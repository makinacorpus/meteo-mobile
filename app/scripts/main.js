var requirejsOptions = {
    baseUrl: './',
    wrap: true,
    paths: {
        'jquery': 'bower_components/jquery/jquery.min',
        'threejs': 'bower_components/threejs/build/three.min',
        'cocoonjs': 'lib/CocoonJS',
        'cocoonjs_app': 'lib/CocoonJS_App',
        'cocoonjs_app_forcocoonjs': 'lib/CocoonJS_App_ForCocoonJS',
        'trackball': 'lib/TrackballControls',
        'localproxy': 'lib/localproxy',
        'lib': 'lib/',
        'app': 'scripts/'
    },
    shim: {
        'trackball': {
            deps: ['threejs'],
            exports: 'trackball'
        },
        'localproxy': {
            deps: ['jquery'],
            exports: 'localproxy'
        },
        'cocoonjs_app': ['cocoonjs'],
        'cocoonjs_app_forcocoonjs': ['cocoonjs']
    }
};

if (typeof exports !== 'undefined' && typeof module !== 'undefined') {
    module.exports = requirejsOptions;
}
if (typeof requirejs !== 'undefined' && requirejs.config) {
    requirejs.config(requirejsOptions);
}

// Created by Bjorn Sandvik - thematicmapping.org
// Adapted by Makina Corpus
define([
    'localproxy',
    'jquery',
    'threejs',
    'trackball',
    'cocoonjs',
    'cocoonjs_app',
    'cocoonjs_app_forcocoonjs'
], function(PROXY) {
    'use strict';
    PROXY.setCredentials('not-me', '****', 'http://screamshot.makina-corpus.net/public/api/custom/tokens/');

    var width  = window.innerWidth,
    height = window.innerHeight;

    // Earth params
    var radius   = 0.5,
    segments = 32,
    rotation = 6;
    var layers = [];
    var textures = {};

    PROXY.getToken(function(path) {
        // UI
        CocoonJS.App.onLoadInTheWebViewSucceed.addEventListener(function(pageURL) {
            // Show the webview. By default, the webview is hidden.
            CocoonJS.App.showTheWebView();
        });

        CocoonJS.App.onLoadInTheWebViewFailed.addEventListener(function(pageURL) {
            console.error("Could not load the HTML file in the webview");

        });

        CocoonJS.App.loadInTheWebView("ui.html");

        $(window).on('pathLoaded', function(e, path) {
            loadFilterTexture(path);
        });

        function loadFilterTexture(path) {
            textures[path] = THREE.ImageUtils.loadTexture(PROXY.getPath(path), new THREE.UVMapping(), function() {
                console.log(path + " loaded");
                CocoonJS.App.forward("$(window).trigger('textureLoaded');");
            });
        }

        var scene = new THREE.Scene();

        var camera = new THREE.PerspectiveCamera(45, width / height, 0.01, 1000);
        camera.position.z = 1.5;

        var renderer = new THREE.WebGLRenderer();
        renderer.setSize(width, height);

        scene.add(new THREE.AmbientLight(0x333333));

        var light = new THREE.DirectionalLight(0xffffff, 1);
        light.position.set(5,3,5);
        scene.add(light);

        var sphere = createSphere(radius, segments, path);
        sphere.rotation.y = rotation;
        scene.add(sphere);

        var stars = createStars(90, 64);
        scene.add(stars);

        var controls = new THREE.TrackballControls(camera);

        document.body.appendChild(renderer.domElement);

        render();

        function addLayer(path) {
            var layer = createLayer(textures[path], radius, segments);
            cleanLayers();
            scene.add(layer);
            layers.push(layer);
        }

        function cleanLayers(path) {
            for(var i=0;i<layers.length;i++) {
                scene.remove(layers[i]);
            }
            layers = [];
        }

        function render() {
            controls.update();
            sphere.rotation.y += 0.0005;
            for(var i=0;i<layers.length;i++) {
                layers[i].rotation.y += 0.0005;   
            }
            //clouds.rotation.y += 0.0005;
            requestAnimationFrame(render);
            renderer.render(scene, camera);
        }

        function createSphere(radius, segments) {
            return new THREE.Mesh(
                new THREE.SphereGeometry(radius, segments, segments),
                new THREE.MeshPhongMaterial({
                    map:         THREE.ImageUtils.loadTexture(PROXY.getPath(
                        'http://screamshot.makina-corpus.net/public/api/ogc/wms/raster_basemap/?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&LAYERS=physicalmap&STYLES=&FORMAT=image%2Fjpeg&TRANSPARENT=true&HEIGHT=1024&WIDTH=2048&CRS=EPSG%3A4326&BBOX=-90,-180,90,180')),
                    bumpMap:     THREE.ImageUtils.loadTexture('images/elev_bump_4k.jpg'),
                    bumpScale:   0.01,
                    specularMap: THREE.ImageUtils.loadTexture('images/water_4k.png'),
                    specular:    new THREE.Color('grey')
                })
            );
        }

        function createLayer(texture, radius, segments) {
            return new THREE.Mesh(
                new THREE.SphereGeometry(radius + 0.003, segments, segments),
                new THREE.MeshPhongMaterial({
                    //map:         THREE.ImageUtils.loadTexture('images/fair_clouds_4k.png'),
                    //map:         THREE.ImageUtils.loadTexture(PROXY.getPath(path)),
                    map: texture,
                    transparent: true
                })
                );
        }

        function createStars(radius, segments) {
            return new THREE.Mesh(
                new THREE.SphereGeometry(radius, segments, segments),
                new THREE.MeshBasicMaterial({
                    map:  THREE.ImageUtils.loadTexture('images/galaxy_starfield.png'),
                    side: THREE.BackSide
                })
                );
        }
    });
});
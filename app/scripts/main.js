var requirejsOptions = {
    baseUrl: './',
    wrap: true,
    paths: {
        'jquery': 'bower_components/jquery/jquery.min',
        'stats': 'bower_components/stats.js/build/Stats',
        'threejs': 'bower_components/threejs/build/three.min',
        'detector': 'lib/Detector',
        'trackball': 'lib/TrackballControls',
        'localproxy': 'lib/localproxy',
    },
    shim: {
        'trackball': {
            deps: ['threejs'],
            exports: 'trackball'
        },
        'localproxy': {
            deps: ['jquery'],
            exports: 'localproxy'
        }
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
    'stats',
    'threejs',
    'detector',
    'trackball'
], function(PROXY) {
    'use strict';
    PROXY.setCredentials('not-me', '****', 'http://synchrone.meteo.fr/public/api/custom/tokens/');

    var webglEl = document.getElementById('webgl');

    if (!Detector.webgl) {
        Detector.addGetWebGLMessage(webglEl);
        return;
    }

    var width  = window.innerWidth,
    height = window.innerHeight;


    // Stats
    var stats = new Stats();
    stats.domElement.style.position = 'absolute';
    stats.domElement.style.bottom = '0px';
    stats.domElement.style.zIndex = 100;
    webglEl.appendChild(stats.domElement);

    // Earth params
    var radius   = 0.5,
    segments = 32,
    rotation = 6;

PROXY.getPath('http://synchrone.meteo.fr/public/api/ogc/wms/raster_basemap/?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&LAYERS=physicalmap&STYLES=&FORMAT=image%2Fjpeg&TRANSPARENT=true&HEIGHT=1024&WIDTH=2048&CRS=EPSG%3A4326&BBOX=-90,-180,90,180&token=34c6e7ba52d74eae900d2112b64a1752',
    function(path) {
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

    var clouds = createClouds(radius, segments);
    clouds.rotation.y = rotation;
    scene.add(clouds);

    var stars = createStars(90, 64);
    scene.add(stars);

    var controls = new THREE.TrackballControls(camera);

    webglEl.appendChild(renderer.domElement);

    render();

    function render() {
        controls.update();
        stats.update();
        sphere.rotation.y += 0.0005;
        clouds.rotation.y += 0.0005;
        requestAnimationFrame(render);
        renderer.render(scene, camera);
    }

    function createSphere(radius, segments, path) {
        return new THREE.Mesh(
            new THREE.SphereGeometry(radius, segments, segments),
            new THREE.MeshPhongMaterial({
                map:         THREE.ImageUtils.loadTexture(path),
                bumpMap:     THREE.ImageUtils.loadTexture('images/elev_bump_4k.jpg'),
                bumpScale:   0.01,
                specularMap: THREE.ImageUtils.loadTexture('images/water_4k.png'),
                specular:    new THREE.Color('grey')
            })
        );
    }

    function createClouds(radius, segments) {
        return new THREE.Mesh(
            new THREE.SphereGeometry(radius + 0.003, segments, segments),
            new THREE.MeshPhongMaterial({
                map:         THREE.ImageUtils.loadTexture('images/fair_clouds_4k.png'),
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
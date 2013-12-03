var requirejsOptions = {
    baseUrl: './',
    wrap: true,
    paths: {
        'jquery': 'bower_components/jquery/jquery.min',
        'cocoonjs': 'lib/CocoonJS',
        'cocoonjs_app': 'lib/CocoonJS_App',
        'cocoonjs_app_forwebview': 'lib/CocoonJS_App_ForWebView'
    },
    shim: {
        'cocoonjs_app': ['cocoonjs'],
        'cocoonjs_app_forwebview': ['cocoonjs']
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
    'jquery',
    'cocoonjs',
    'cocoonjs_app',
    'cocoonjs_app_forwebview'
], function() {
    CocoonJS.App.onLoadInCocoonJSSucceed.addEventListener(function(pageURL) {
        console.log('lolds');
    });

    $("#buttons button").each(function() {
        var path = 'http://screamshot.makina-corpus.net/public/api/ogc/wms/';
        path += this.attributes['data-layer-service'].value; //satellite
        path += '/?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&LAYERS=';
        path += this.attributes['data-layer-name'].value; //geostationary_hrv_cloud
        path += '&STYLES=&FORMAT=';
        path += encodeURIComponent(this.attributes['data-layer-format'].value); //image%2Fpng
        path += '&TRANSPARENT=true&HEIGHT=1024&WIDTH=2048&CRS=EPSG%3A4326&BBOX=-90,-180,90,180';
        this.setAttribute('data-layer-path', path);
        var button = this;
        CocoonJS.App.forward("$(window).trigger('pathLoaded', ['"+ path +"']);");

        $(window).one('textureLoaded', function(e) {
            $(button).removeAttr('disabled');
        });

        $(this).on('click', function(e) {
            addLayer(e.target.attributes['data-layer-path'].value);
        });
    });
});
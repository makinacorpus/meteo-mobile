package com.makina.meteofrance;

import org.glob3.mobile.generated.LayerBuilder;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.LevelTileCondition;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URL;
import org.glob3.mobile.generated.WMSLayer;
import org.glob3.mobile.generated.WMSServerVersion;

public class SimpleRasterLayerBuilder extends LayerBuilder {
	private static final String tokenToUse="455c255e10ca429988e3d08d1fe3d7c1";

	public static LayerSet createLayerset() {
		final LayerSet layerSet = new LayerSet();

		final WMSLayer globeLyer = new WMSLayer(
				"openstreetmap",
				new URL(
						"http://maps.opengeo.org/geowebcache/service/wms?",
						false), WMSServerVersion.WMS_1_1_0,
				Sector.fullSphere(), "image/png", "EPSG:4326", "", false,
				new LevelTileCondition(0, 18), TimeInterval.fromDays(30), true);
		globeLyer.setTitle("globe");
		globeLyer.setEnable(true);
		layerSet.addLayer(globeLyer);

		final WMSLayer tmpLyer = new WMSLayer(
				"THETA__ISO_TP_2000",
				new URL(
						"http://screamshot.makina-corpus.net/public/api/ogc/wms/model/?token="+tokenToUse+"&",
						false), WMSServerVersion.WMS_1_3_0,
				Sector.fullSphere(), "image/png", "EPSG:4326", "", true,
				new LevelTileCondition(0, 18), TimeInterval.fromDays(30), true);
		tmpLyer.setTitle("Tmp");
		tmpLyer.setEnable(false);

		layerSet.addLayer(tmpLyer);

		final WMSLayer cloudsLayer = new WMSLayer(
				"geostationary_hrv_cloud",
				new URL(
						"http://screamshot.makina-corpus.net/public/api/ogc/wms/satellite/?token="+tokenToUse+"&",
						false), WMSServerVersion.WMS_1_3_0,
				Sector.fullSphere(), "image/png", "EPSG:4326", "", true,
				new LevelTileCondition(0, 18), TimeInterval.fromDays(30), true);
		cloudsLayer.setTitle("clouds");
		cloudsLayer.setEnable(false);

		layerSet.addLayer(cloudsLayer);

		return layerSet;
	}
}

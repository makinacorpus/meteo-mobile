package com.makina.meteofrance;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.glob3.mobile.generated.LayerBuilder;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.LevelTileCondition;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URL;
import org.glob3.mobile.generated.WMSLayer;
import org.glob3.mobile.generated.WMSServerVersion;
import org.json.JSONException;
import org.json.JSONObject;

public class SimpleRasterLayerBuilder extends LayerBuilder {
	
	private static final String token_url = "http://query.yahooapis.com/v1/public/yql?q=use%20%22http%3A%2F%2Fwww.plomino.net%2Fpost-yql%22%20as%20htmlpost%3B%0Aselect%20*%20from%20htmlpost%20where%0Aurl%3D'http%3A%2F%2Fsynchrone.meteo.fr%2Fpublic%2Fapi%2Fcustom%2Ftokens%2F'%0Aand%20postdata%3D%22%22%20and%20xpath%3D%22%2F%2Fp%22&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";
	private static String tokenToUse = "";
	
	private static String getToken() {
		if(tokenToUse == "") {
			HttpClient httpClient = new DefaultHttpClient();
		    try {
		        HttpGet request = new HttpGet(token_url);
		        HttpResponse response = httpClient.execute(request);
		        HttpEntity entity = response.getEntity();
		        String responseString = EntityUtils.toString(entity, "UTF-8");
		        JSONObject json = new JSONObject(responseString);
		        String inner_json = json.getJSONObject("query").getJSONObject("results").getJSONObject("postresult").getString("p");
		        tokenToUse = (new JSONObject(inner_json)).getString("token");
		    } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
		    } catch (JSONException e) {
				e.printStackTrace();
			} finally {
		        httpClient.getConnectionManager().shutdown();
		    }
		}
		return tokenToUse;
	}

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
						"http://screamshot.makina-corpus.net/public/api/ogc/wms/model/?token="+getToken()+"&",
						false), WMSServerVersion.WMS_1_3_0,
				Sector.fullSphere(), "image/png", "EPSG:4326", "", true,
				new LevelTileCondition(0, 18), TimeInterval.fromDays(30), true);
		tmpLyer.setTitle("Tmp");
		tmpLyer.setEnable(false);

		layerSet.addLayer(tmpLyer);

		final WMSLayer cloudsLayer = new WMSLayer(
				"geostationary_hrv_cloud",
				new URL(
						"http://screamshot.makina-corpus.net/public/api/ogc/wms/satellite/?token="+getToken()+"&",
						false), WMSServerVersion.WMS_1_3_0,
				Sector.fullSphere(), "image/png", "EPSG:4326", "", true,
				new LevelTileCondition(0, 18), TimeInterval.fromDays(30), true);
		cloudsLayer.setTitle("clouds");
		cloudsLayer.setEnable(false);

		layerSet.addLayer(cloudsLayer);

		return layerSet;
	}
}

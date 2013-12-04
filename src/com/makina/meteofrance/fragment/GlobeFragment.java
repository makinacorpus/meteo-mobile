/*******************************************************************************
 * Copyright 2012 Steven Rudenko
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.makina.meteofrance.fragment;

import org.glob3.mobile.generated.Layer;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.makina.meteofrance.R;
import com.makina.meteofrance.SimpleRasterLayerBuilder;

public class GlobeFragment extends Fragment {
	public static final String TAG = GlobeFragment.class.getSimpleName();

	private static final String ABOUT_SCHEME = "globe";
	private static final String ABOUT_AUTHORITY = "globe3d";
	public static final Uri ABOUT_URI = new Uri.Builder().scheme(ABOUT_SCHEME)
			.authority(ABOUT_AUTHORITY).build();
	private G3MWidget_Android _g3mWidget;
	private RelativeLayout _placeHolder;
	LayerSet layerset;
	G3MBuilder_Android builder;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View v = inflater.inflate(R.layout.activity_simplest_raster,
				container, false);
		layerset = SimpleRasterLayerBuilder.createLayerset();
		builder = new G3MBuilder_Android(getActivity());

		builder.getPlanetRendererBuilder().setLayerSet(layerset);

		_g3mWidget = builder.createWidget();

		_placeHolder = (RelativeLayout) v.findViewById(R.id.g3mWidgetHolder);
		_placeHolder.addView(_g3mWidget);

		return v;
	}

	public void onActionNotify(int position) {
		switch (position) {
		case 0:
			final Layer tempLayer = layerset.getLayerByTitle("Tmp");
			if (!tempLayer.isEnable()) {
				tempLayer.setEnable(true);

			}else tempLayer.setEnable(false);
			break;
		case 1:
			final Layer cloudsLayer = layerset.getLayerByTitle("clouds");
			if (!cloudsLayer.isEnable()) {
				cloudsLayer.setEnable(true);

			}else cloudsLayer.setEnable(false);
			break;

		}
	}
}

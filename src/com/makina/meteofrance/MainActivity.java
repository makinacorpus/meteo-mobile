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
package com.makina.meteofrance;

import shared.ui.actionscontentview.ActionsContentView;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.makina.meteofrance.adapter.ActionsAdapter;
import com.makina.meteofrance.fragment.GlobeFragment;

public class MainActivity extends FragmentActivity {

	private ActionsContentView viewActionsContentView;

	private Uri currentUri = GlobeFragment.ABOUT_URI;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if( Build.VERSION.SDK_INT >= 9){
		    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

		    StrictMode.setThreadPolicy(policy); 
		}
		
		setContentView(R.layout.main_activity);

		viewActionsContentView = (ActionsContentView) findViewById(R.id.actionsContentView);
		viewActionsContentView.setSwipingType(ActionsContentView.SWIPING_EDGE);

		final ListView viewActionsList = (ListView) findViewById(R.id.actions);
		final ActionsAdapter actionsAdapter = new ActionsAdapter(this);
		viewActionsList.setAdapter(actionsAdapter);
		viewActionsList
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> adapter, View v,
							int position, long flags) {

						viewActionsContentView.showContent();
						final FragmentManager fm = getSupportFragmentManager();
					
						final GlobeFragment foundFragment = (GlobeFragment) fm
								.findFragmentByTag(GlobeFragment.TAG);
						foundFragment.onActionNotify(position);
					}
				});

		updateContent(currentUri);
	}

	@Override
	public void onBackPressed() {

		super.onBackPressed();
	}

	public void onActionsButtonClick(View view) {
		if (viewActionsContentView.isActionsShown())
			viewActionsContentView.showContent();
		else
			viewActionsContentView.showActions();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {

		super.onSaveInstanceState(outState);
	}

	
	public void updateContent(Uri uri) {
		final Fragment fragment;
		final String tag;

		final FragmentManager fm = getSupportFragmentManager();
		final FragmentTransaction tr = fm.beginTransaction();

		tag = GlobeFragment.TAG;
		final Fragment foundFragment = fm.findFragmentByTag(tag);
		if (foundFragment != null) {
			fragment = foundFragment;
		} else {
			fragment = new GlobeFragment();
		}

		if (fragment.isAdded()) {
			tr.show(fragment);
		} else {
			tr.replace(R.id.content, fragment, tag);
		}
		tr.commit();

		currentUri = uri;
	}

}

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
package com.makina.meteofrance.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.makina.meteofrance.R;

public class ActionsAdapter extends BaseAdapter {

	private final LayoutInflater mInflater;

	private final String[] mTitles;
	private final int[] mIcons;
	private final int[] mColor;

	public ActionsAdapter(Context context) {
		mInflater = LayoutInflater.from(context);

		final Resources res = context.getResources();
		mTitles = res.getStringArray(R.array.actions_names);

		final TypedArray iconsArray = res
				.obtainTypedArray(R.array.actions_icons);
		final int count = iconsArray.length();
		mIcons = new int[count];
		for (int i = 0; i < count; ++i) {
			mIcons[i] = iconsArray.getResourceId(i, 0);
		}
		iconsArray.recycle();

		final TypedArray colorsArray = res
				.obtainTypedArray(R.array.actions_color);
		final int countColor = colorsArray.length();
		mColor = new int[countColor];
		for (int i = 0; i < countColor; ++i) {
			mColor[i] = colorsArray.getResourceId(i, 0);
		}
		colorsArray.recycle();
	}

	@Override
	public int getCount() {
		return mTitles.length;
	}

	@Override
	public Uri getItem(int position) {
		return Uri.parse(mTitles[position]);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@SuppressLint("DefaultLocale")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		final ViewHolder holder;
		if (convertView == null) {

			convertView = mInflater.inflate(R.layout.action_list_item, parent,
					false);

			holder = new ViewHolder();
			holder.text = (TextView) convertView
					.findViewById(android.R.id.text1);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		final Drawable icon = convertView.getContext().getResources()
				.getDrawable(mIcons[position]);
		icon.setBounds(0, 0, icon.getIntrinsicWidth(),
				icon.getIntrinsicHeight());
		holder.text.setCompoundDrawables(icon, null, null, null);
		holder.text.setText(mTitles[position]);
	
		convertView.setBackgroundColor(mColor[position]);

		return convertView;
	}

	private static class ViewHolder {
		TextView text;
	}
}

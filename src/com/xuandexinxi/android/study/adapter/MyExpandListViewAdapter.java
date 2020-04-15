package com.xuandexinxi.android.study.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.pojo.MyEvent;

public class MyExpandListViewAdapter extends BaseExpandableListAdapter {

	private Context context;
	private String[] groupArray;
	public MyEvent[][] childArray;

	public MyExpandListViewAdapter(Context context, String[] groupArray,
			MyEvent[][] childArray) {
		this.context = context;
		this.groupArray = groupArray;
		this.childArray = childArray;
	}

	@Override
	public int getGroupCount() {
		return groupArray.length;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return childArray[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		return null;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return null;
	}

	@Override
	public long getGroupId(int groupPosition) {
		return 0;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(context).inflate(R.layout.layout_group,
				parent, false);
		TextView groupName = (TextView) view.findViewById(R.id.tv_group);
		groupName.setText(groupArray[groupPosition]);
		return view;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(context).inflate(R.layout.layout_child,
				parent, false);
		TextView tv_name = (TextView) view.findViewById(R.id.tv_name);
		tv_name.setText(context
				.getText(childArray[groupPosition][childPosition].getNameId()));
		return view;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
}
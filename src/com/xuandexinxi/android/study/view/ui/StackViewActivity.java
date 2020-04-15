package com.xuandexinxi.android.study.view.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.StackView;

import com.xuandexinxi.android.study.R;


public class StackViewActivity extends Activity
{
	StackView stackView;
	int[] imageIds = new int[]
	{
		R.drawable.bomb5 , R.drawable.bomb6 , R.drawable.bomb7
		, R.drawable.bomb8 , R.drawable.bomb9 , R.drawable.bomb10
		, R.drawable.bomb11 , R.drawable.bomb12	, R.drawable.bomb13
		, R.drawable.bomb14 , R.drawable.bomb15 , R.drawable.bomb16
};
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_29);
		stackView = (StackView) findViewById(R.id.mStackView);
		// 创建一个List对象，List对象的元素是Map
		List<Map<String, Object>> listItems =
				new ArrayList<Map<String, Object>>();
		for (int i = 0; i < imageIds.length; i++)
		{
			Map<String, Object> listItem = new HashMap<String, Object>();
			listItem.put("image", imageIds[i]);
			listItems.add(listItem);
		}
		// 创建一个SimpleAdapter
		SimpleAdapter simpleAdapter = new SimpleAdapter(this,
				listItems
				// 使用/layout/cell.xml文件作为界面布局
				, R.layout.cell, new String[] { "image" },
				new int[] { R.id.image1 });
		stackView.setAdapter(simpleAdapter);
	}
	public void prev(View view)
	{
		// 显示上一个组件
		stackView.showPrevious();
	}
	public void next(View view)
	{
		// 显示下一个组件
		stackView.showNext();
	}
}


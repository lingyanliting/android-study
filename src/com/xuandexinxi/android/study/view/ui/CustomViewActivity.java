package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.widget.DrawView;


public class CustomViewActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_3_custom_view);
		// 获取布局文件中的LinearLayout容器
		LinearLayout root = (LinearLayout) findViewById(R.id.root);
		// 创建DrawView组件
		final DrawView draw = new DrawView(this);
		// 设置自定义组件的最小宽度、高度
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		root.addView(draw);
	}
}


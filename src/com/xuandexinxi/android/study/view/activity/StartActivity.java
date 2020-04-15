package com.xuandexinxi.android.study.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.base.BaseActivity;

public class StartActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_4_2);
		// 获取应用程序中的bn按钮
		Button bn = (Button) findViewById(R.id.bn);
		// 为bn按钮绑定事件监听器
		bn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View source) {
				// 创建需要启动的Activity对应的Intent
				Intent intent = new Intent(thisActivity, SecondActivity.class);
				// 启动intent对应的Activity
				startActivity(intent);
			}
		});
	}
}

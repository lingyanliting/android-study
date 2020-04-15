package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;

import com.xuandexinxi.android.study.R;

public class OtherActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置该Activity显示的页面
		setContentView(R.layout.other);
	}
}
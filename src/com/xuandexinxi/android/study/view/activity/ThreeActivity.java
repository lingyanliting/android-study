package com.xuandexinxi.android.study.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThreeActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setText("对话框风格的Activity");
		setContentView(tv);
	}
}

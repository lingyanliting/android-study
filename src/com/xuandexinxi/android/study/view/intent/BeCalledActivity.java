package com.xuandexinxi.android.study.view.intent;

import android.app.Activity;
import android.os.Bundle;

import com.xuandexinxi.android.study.R;

public class BeCalledActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.be_called);
	}
}
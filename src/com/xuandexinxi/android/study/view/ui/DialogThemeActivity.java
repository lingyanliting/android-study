package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.xuandexinxi.android.study.R;

public class DialogThemeActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_47);
		Button bn = (Button) findViewById(R.id.bn);
		// 为按钮绑定事件监听器
		bn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// 结束该Activity
				finish();
			}
		});
	}
}

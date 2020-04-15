package com.xuandexinxi.android.study.view.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.base.BaseActivity;

public class TextSwitcherActivity extends BaseActivity {
	TextSwitcher textSwitcher;
	String[] strs = new String[] { "Java", "Ajax", "Java EE", "Android" };
	int curStr;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_36);
		textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
		textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
			public View makeView() {
				TextView tv = new TextView(thisActivity);
				tv.setTextSize(40);
				tv.setTextColor(Color.MAGENTA);
				return tv;
			}
		});
		// 调用next方法显示下一个字符串
		next(null);
	}

	// 事件处理函数，控制显示下一个字符串
	public void next(View source) {
		textSwitcher.setText(strs[curStr++ % strs.length]); // ①
	}
}

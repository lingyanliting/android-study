package com.xuandexinxi.android.study.view.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.xuandexinxi.android.study.R;

public class ActionBarActivity extends Activity {
	ActionBar actionBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_56);
		// 获取该Activity的ActionBar
		// 只有当应用主题没有关闭ActionBar时，该代码才能返回ActionBar
		actionBar = getActionBar();
	}

	// 为“显示ActionBar”按钮定义事件处理方法
	public void showActionBar(View source) {
		// 显示ActionBar
		actionBar.show();
	}

	// 为“隐藏ActionBar”按钮定义事件处理方法
	public void hideActionBar(View source) {
		// 隐藏ActionBar
		actionBar.hide();
	}
}

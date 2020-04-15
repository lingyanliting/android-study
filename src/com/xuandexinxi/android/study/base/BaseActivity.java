package com.xuandexinxi.android.study.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.xuandexinxi.android.study.R;

/**
 * 基类Activity
 */
public abstract class BaseActivity extends Activity {

	/**
	 * 顶部左边
	 */
	protected Button btnTopBack;
	/**
	 * 顶部标题
	 */
	protected TextView tvTopTitle;

	protected Context context;

	protected Activity thisActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
		thisActivity = this;
	}

	/**
	 * 初始化头部
	 */
	protected void initHeader(int titleRes) {
		btnTopBack = (Button) findViewById(R.id.top_back);
		tvTopTitle = (TextView) findViewById(R.id.top_title);
		tvTopTitle.setText(getString(titleRes));
		btnTopBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				defaultFinish();
			}
		});
	}

	/**
	 * 初始化布局
	 */
	protected void initUI() {

	};

	/**
	 * 初始化事件
	 */
	protected void initEvent() {

	};

	/**
	 * 不带参数
	 * 
	 * @param activity
	 */
	public void startActivity(Class<?> activity) {
		Intent intent = new Intent(this, activity);
		startActivity(intent);
	}

	protected void defaultFinish() {
		this.finish();
	}
}

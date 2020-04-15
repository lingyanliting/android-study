package com.xuandexinxi.android.study.view.basic;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.base.BaseActivity;

public class HelloWorldWorldActivity extends BaseActivity {

	private Button bn;

	// 当第一次创建该Activity时回调该方法
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置使用main.xml文件定义的页面布局
		setContentView(R.layout.activity_1_helloworld);
		initUI();
		initEvent();
	}

	@Override
	protected void initUI() {
		initHeader(R.string._1_catalog_helloworld);
		// 获取UI界面中ID为R.id.ok的按钮
		bn = (Button) findViewById(R.id.ok);
	}

	@Override
	protected void initEvent() {
		bn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// 获取UI界面中ID为R.id.show的文本框
				final TextView show = (TextView) findViewById(R.id.show);
				// 改变文本框的文本内容
				show.setText("Hello Android~" + new java.util.Date());
			}
		});
	}
}
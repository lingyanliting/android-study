package com.xuandexinxi.android.study.view.event;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.xuandexinxi.android.study.R;

public class BindingTagActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3_6);
	}

	// 定义一个事件处理方法
	// 其中source参数代表事件源
	public void clickHandler(View source) {
		EditText show = (EditText) findViewById(R.id.show);
		show.setText("bn按钮被单击了");
	}
}

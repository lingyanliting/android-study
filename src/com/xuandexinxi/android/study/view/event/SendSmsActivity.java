package com.xuandexinxi.android.study.view.event;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.listener.SendSmsListener;

public class SendSmsActivity extends Activity {
	EditText address;
	EditText content;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3_3);
		// 获取页面中收件人地址、短信内容
		address = (EditText) findViewById(R.id.address);
		content = (EditText) findViewById(R.id.content);
		Button bn = (Button) findViewById(R.id.send);
		// 使用外部类的实例作为事件监听器
		bn.setOnLongClickListener(new SendSmsListener(this, address, content));
	}
}

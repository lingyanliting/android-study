package com.xuandexinxi.android.study.view.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xuandexinxi.android.study.R;

public class DataTypeOverrideActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_5_6);
	}

	public void overrideType(View source) {
		Intent intent = new Intent();
		// 先为Intent设置Type属性
		intent.setType("abc/xyz");
		// 再为Intent设置Data属性，覆盖Type属性
		intent.setData(Uri.parse("lee://www.fkjava.org:8888/test"));
		Toast.makeText(this, intent.toString(), Toast.LENGTH_LONG).show();
	}

	public void overrideData(View source) {
		Intent intent = new Intent();
		// 先为Intent设置Data属性
		intent.setData(Uri.parse("lee://www.fkjava.org:8888/mypath"));
		// 再为Intent设置Type属性，覆盖Data属性
		intent.setType("abc/xyz");
		Toast.makeText(this, intent.toString(), Toast.LENGTH_LONG).show();
	}

	public void dataAndType(View source) {
		Intent intent = new Intent();
		// 同时设置Intent的Data、Type属性
		intent.setDataAndType(Uri.parse("lee://www.fkjava.org:8888/mypath"), "abc/xyz");
		Toast.makeText(this, intent.toString(), Toast.LENGTH_LONG).show();
	}
}

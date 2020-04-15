package com.xuandexinxi.android.study.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.base.BaseActivity;
import com.xuandexinxi.android.study.pojo.Person;

public class BundleActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_4_3);
		Button bn = (Button) findViewById(R.id.bn);
		bn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				EditText name = (EditText) findViewById(R.id.name);
				EditText passwd = (EditText) findViewById(R.id.passwd);
				RadioButton male = (RadioButton) findViewById(R.id.male);
				String gender = male.isChecked() ? "男 " : "女";
				Person p = new Person(name.getText().toString(), passwd.getText().toString(), gender);
				// 创建一个Bundle对象
				Bundle data = new Bundle();
				data.putSerializable("person", p);
				// 创建一个Intent
				Intent intent = new Intent(thisActivity, ResultActivity.class);
				intent.putExtras(data);
				// 启动intent对应的Activity
				startActivity(intent);
			}
		});
	}
}

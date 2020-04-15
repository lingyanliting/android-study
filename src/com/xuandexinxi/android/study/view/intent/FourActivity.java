package com.xuandexinxi.android.study.view.intent;

import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.xuandexinxi.android.study.R;

public class FourActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_5_3_1);
		EditText show = (EditText) findViewById(R.id.show);
		// 获取该Activity对应的Intent的Action属性
		String action = getIntent().getAction();
		// 显示Action属性
		show.setText("Action为：" + action);
		EditText cate = (EditText) findViewById(R.id.cate);
		// 获取该Activity对应的Intent的Category属性
		Set<String> cates = getIntent().getCategories();
		// 显示Category属性
		cate.setText("Category属性为：" + cates);
	}
}

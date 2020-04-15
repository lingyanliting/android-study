package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.xuandexinxi.android.study.R;


public class SpinnerActivity extends Activity
{
	Spinner spinner;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_27);
		// 获取界面布局文件中的Spinner组件
		spinner = (Spinner) findViewById(R.id.spinner);
		String[] arr = { "孙悟空", "猪八戒", "唐僧" };
		// 创建ArrayAdapter对象
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_multiple_choice, arr);
		// 为Spinner设置Adapter
		spinner.setAdapter(adapter);
	}
}

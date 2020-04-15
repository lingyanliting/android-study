package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.xuandexinxi.android.study.R;


public class AutoCompleteTextViewActivity extends Activity
{
	AutoCompleteTextView actv;
	MultiAutoCompleteTextView mauto;
	// 定义字符串数组，作为提示的文本
	String[] books = new String[]{
			"Java",
			"Ajax",
			"XML",
			"Workflow"
	};
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_24);
		// 创建一个ArrayAdapter，封装数组
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, books);
		actv = (AutoCompleteTextView)findViewById(R.id.auto);
		// 设置Adapter
		actv.setAdapter(aa);
		mauto = (MultiAutoCompleteTextView)findViewById(R.id.mauto);
		// 设置Adapter
		mauto.setAdapter(aa);
		// 为MultiAutoCompleteTextView设置分隔符
		mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}
}


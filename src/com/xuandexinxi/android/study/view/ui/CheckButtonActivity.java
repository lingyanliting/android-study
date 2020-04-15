package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.xuandexinxi.android.study.R;

public class CheckButtonActivity extends Activity {
	RadioGroup rg;
	TextView show;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_13);
		// 获取界面上rg、show两个组件
		rg = (RadioGroup) findViewById(R.id.rg);
		show = (TextView) findViewById(R.id.show);
		// 为RadioGroup组件的OnCheckedChange事件绑定事件监听器
		rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// 根据用户勾选的单选按钮来动态改变tip字符串的值
				String tip = checkedId == R.id.male ? "您的性别是男人" : "您的性别是女人";
				// 修改show组件中的文本
				show.setText(tip);
			}
		});
	}
}

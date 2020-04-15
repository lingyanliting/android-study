package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

import com.xuandexinxi.android.study.R;


public class QuickContactBadgeActivity extends Activity
{
	QuickContactBadge badge;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_19);
		// 获取QuickContactBadge组件
		badge = (QuickContactBadge) findViewById(R.id.badge);
		// 将QuickContactBadge组件与特定电话号码对应的联系人建立关联
		badge.assignContactFromPhone("020-88888888", false);
	}
}


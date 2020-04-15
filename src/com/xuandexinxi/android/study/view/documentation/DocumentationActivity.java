package com.xuandexinxi.android.study.view.documentation;

import android.os.Bundle;
import android.view.Window;

import com.xuandexinxi.android.study.R;
import com.xuandexinxi.android.study.base.BaseActivity;

public class DocumentationActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_documentation);
		initHeader(R.string._20_catalog_1);
	}

}

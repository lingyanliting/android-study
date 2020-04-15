package com.xuandexinxi.android.study;

import android.os.Bundle;
import android.view.Window;

import com.xuandexinxi.android.study.base.BaseActivity;
import com.xuandexinxi.android.study.widget.Shimmer;
import com.xuandexinxi.android.study.widget.ShimmerTextView;

public class SplashActivity extends BaseActivity {

	ShimmerTextView tv;
	Shimmer shimmer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
		if (shimmer != null && shimmer.isAnimating()) {
			shimmer.cancel();
		} else {
			shimmer = new Shimmer();
			shimmer.start(tv);
		}
		new Thread(new Runnable() {
			public void run() {
				// 登录动画休眠一秒
				try {
					Thread.sleep(5000);
					startActivity(MainActivity.class);
					defaultFinish();
				} catch (InterruptedException e) {
				}
			}
		}).start();
	}

}
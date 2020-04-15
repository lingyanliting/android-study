package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

import com.xuandexinxi.android.study.R;

public class RatingBarActivity extends Activity {
	ImageView image;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_32);
		image = (ImageView) findViewById(R.id.image);
		RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);
		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			// 当星级评分条的评分发生改变时触发该方法
			@Override
			public void onRatingChanged(RatingBar arg0, float rating, boolean fromUser) {
				// 动态改变图片的透明度，其中255是星级评分条的最大值
				// 5个星星就代表最大值255
				image.setImageAlpha((int) (rating * 255 / 5));
			}
		});

	}
}

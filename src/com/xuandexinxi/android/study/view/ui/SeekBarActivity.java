package com.xuandexinxi.android.study.view.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.xuandexinxi.android.study.R;

public class SeekBarActivity extends Activity {
	ImageView image;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2_33);
		image = (ImageView) findViewById(R.id.image);
		SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			// 当拖动条的滑块位置发生改变时触发该方法
			@Override
			public void onProgressChanged(SeekBar arg0, int progress, boolean fromUser) {
				// 动态改变图片的透明度
				image.setImageAlpha(progress);
			}

			@Override
			public void onStartTrackingTouch(SeekBar bar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar bar) {
			}
		});
	}
}

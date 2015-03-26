package com.example.android2015;

import java.util.Timer;
import java.util.TimerTask;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Time;
import android.widget.ImageView;

public class HandleTest extends Activity {

	// 定义周期性显示的图片的id
	int[] imageIds = new int[] {

	R.drawable.java, R.drawable.ee, R.drawable.ajax, R.drawable.xml,
			R.drawable.classic,

	};
	int currentImageId = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.handletest);
		final ImageView show = (ImageView) findViewById(R.id.show);
		final Handler myHandler = new Handler() {
			public void handleMessage(android.os.Message msg) {
				// 如果该消息是由本程序所发送的
				if (msg.what == 0x1233) {
					// 动态的修改所显示的图片
					show.setImageResource(imageIds[currentImageId++
							% imageIds.length]);
				}
			}
		};
		// 定义一个计时器，让该计时器周期性地执行指定任务
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				// 发送空消息
				myHandler.sendEmptyMessage(0x1233);
			}
		}, 0, 1200);

	}

}

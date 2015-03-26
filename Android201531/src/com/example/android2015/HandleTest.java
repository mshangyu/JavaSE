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

	// ������������ʾ��ͼƬ��id
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
				// �������Ϣ���ɱ����������͵�
				if (msg.what == 0x1233) {
					// ��̬���޸�����ʾ��ͼƬ
					show.setImageResource(imageIds[currentImageId++
							% imageIds.length]);
				}
			}
		};
		// ����һ����ʱ�����øü�ʱ�������Ե�ִ��ָ������
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				// ���Ϳ���Ϣ
				myHandler.sendEmptyMessage(0x1233);
			}
		}, 0, 1200);

	}

}

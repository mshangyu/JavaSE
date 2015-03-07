package com.example.android2015;

import android.R.integer;
import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MixView extends Activity{

	//����һ������ͼƬ������
	int[] images=new int[]{
			R.drawable.java,
			R.drawable.ee,
			R.drawable.classic,
			R.drawable.ajax,
			R.drawable.xml,
	};
	int currentImg =0;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//��ȡLinearLayout ��������
		LinearLayout main=(LinearLayout) findViewById(R.id.root);
		//���򴴽�ImageView���
		final ImageView image=new ImageView(this);
		//��imageview�����ӵ�linearlayout����������
		main.addView(image);
		//��ʼ��ʱ����ʾ��һ��ͼƬ
		image.setImageResource(images[0]);
		image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//�ı�imageview������ʾ��ͼƬ
				image.setImageResource(images[++currentImg % images.length]);
			}
		});
	}

}

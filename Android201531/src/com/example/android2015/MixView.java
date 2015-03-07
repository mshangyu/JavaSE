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

	//定义一个访问图片的数组
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
		//获取LinearLayout 布局容器
		LinearLayout main=(LinearLayout) findViewById(R.id.root);
		//程序创建ImageView组件
		final ImageView image=new ImageView(this);
		//将imageview组件添加到linearlayout布局容器中
		main.addView(image);
		//初始化时候显示第一张图片
		image.setImageResource(images[0]);
		image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//改变imageview里面显示的图片
				image.setImageResource(images[++currentImg % images.length]);
			}
		});
	}

}

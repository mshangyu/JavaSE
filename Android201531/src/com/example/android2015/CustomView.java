package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CustomView extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dishige);
		/*//获取布局文件中的LinearLayout容器
		LinearLayout root=(LinearLayout) findViewById(R.id.root);
		//创建DrawView组件
		final DrawView draw = new DrawView(this);
		//设置自定义组件的最大宽度、高度
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		root.addView(draw);*/
	}
	
}

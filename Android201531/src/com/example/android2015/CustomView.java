package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CustomView extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dishige);
		/*//��ȡ�����ļ��е�LinearLayout����
		LinearLayout root=(LinearLayout) findViewById(R.id.root);
		//����DrawView���
		final DrawView draw = new DrawView(this);
		//�����Զ�������������ȡ��߶�
		draw.setMinimumWidth(300);
		draw.setMinimumHeight(500);
		root.addView(draw);*/
	}
	
}
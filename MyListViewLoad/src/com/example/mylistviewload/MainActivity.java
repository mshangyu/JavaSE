package com.example.mylistviewload;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebIconDatabase.IconListener;

import com.example.mylistviewload.MyAdapter;
import com.example.mylistviewload.ApkEntity;
import com.example.mylistviewload.LoadListView;

public class MainActivity extends Activity implements IconListener, com.example.mylistviewload.LoadListView.ILoadListener{
	ArrayList<ApkEntity> apk_list = new ArrayList<ApkEntity>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getData();
		showListView(apk_list);
	}

	MyAdapter adapter;
	LoadListView listview;
	private void showListView(ArrayList<ApkEntity> apk_list) {
		if (adapter == null) {
			listview = (LoadListView) findViewById(R.id.listview);
			listview.setInterface(this);
			adapter = new MyAdapter(this, apk_list);
			listview.setAdapter(adapter);
		} else {
			adapter.onDateChange(apk_list);
		}
	}

	private void getData() {
		for (int i = 0; i < 10; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("�����ֿ���");
			entity.setInfo("���Ȼ�̵��ɶ�����������С����θ̵�ȣ����ܷ纮�����ͷʹ���ȣ�����̵ʢ�����ٴ��������겻��");
			entity.setDes("�������Ǻ���������ҵ��865��");
			apk_list.add(entity);
		}
	}
	private void getLoadData() {
		for (int i = 0; i < 2; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("�Ѿ�����������");
			entity.setInfo("���� С�������");
			entity.setDes("ɵ�� ɵ�� ��ɵ�ƣ�");
			apk_list.add(entity);
		}
	}

	public void onLoad() {
		// TODO Auto-generated method stub
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//��ȡ��������
				getLoadData();
				//����listview��ʾ��
				showListView(apk_list);
				//֪ͨlistview�������
				listview.loadComplete();
			}
		}, 2000);
	}

	@Override
	public void onReceivedIcon(String url, Bitmap icon) {
		// TODO Auto-generated method stub
		
	}
}

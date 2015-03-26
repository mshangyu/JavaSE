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
			entity.setName("健儿乐颗粒");
			entity.setInfo("清热化痰这可定喘，适用于小儿肺胃痰热，感受风寒引起的头痛身热，咳嗽痰盛，气促喘急，烦躁不安");
			entity.setDes("苏州市星湖街荣域商业街865商");
			apk_list.add(entity);
		}
	}
	private void getLoadData() {
		for (int i = 0; i < 2; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("已经加载了两个");
			entity.setInfo("哈哈 小样我来喽");
			entity.setDes("傻逼 傻逼 大傻逼！");
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
				//获取更多数据
				getLoadData();
				//更新listview显示；
				showListView(apk_list);
				//通知listview加载完毕
				listview.loadComplete();
			}
		}, 2000);
	}

	@Override
	public void onReceivedIcon(String url, Bitmap icon) {
		// TODO Auto-generated method stub
		
	}
}

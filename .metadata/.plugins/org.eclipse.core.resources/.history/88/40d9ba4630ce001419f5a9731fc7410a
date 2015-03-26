package com.example.mylistviewrrash;

import java.util.ArrayList;

import com.example.mylistviewrrash.R;
import com.example.mylistviewrrash.ApkEntity;
import com.example.mylistviewrrash.ReFlashListView.IReflashListener;
import com.example.mylistviewrrash.MyAdapter;
import com.example.mylistviewrrash.ReFlashListView;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements IReflashListener {
	ArrayList<ApkEntity> apk_list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setData();
		showList(apk_list);
	}

	MyAdapter adapter;
	ReFlashListView listview;

	private void showList(
			ArrayList<com.example.mylistviewrrash.ApkEntity> apk_list) {
		// TODO Auto-generated method stub
		if (adapter == null) {
			listview = (ReFlashListView) findViewById(R.id.listview);
			listview.setInterface(this);
			adapter = new MyAdapter(this, apk_list);
			listview.setAdapter(adapter);
		} else {
			adapter.onDateChange(apk_list);
		}
	}

	private void setData() {
		// TODO Auto-generated method stub
		apk_list = new ArrayList<ApkEntity>();
		for (int i = 0; i < 10; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("健儿乐颗粒");
			entity.setDes("清热化痰这可定喘，适用于小儿肺胃痰热，感受风寒引起的头痛身热，咳嗽痰盛，气促喘急，烦躁不安");
			entity.setInfo("苏州市星湖街荣域商业街865商铺");
			apk_list.add(entity);
		}
	}

	private void setReflashData() {
		for (int i = 0; i < 2; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("刷新数据");
			entity.setDes("hahahaha");
			entity.setInfo("shushsuushus");
			apk_list.add(0, entity);
		}
	}

	@Override
	public void onReflash() {
		// TODO Auto-generated method stub
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// 获取最新数据
				setReflashData();
				// 通知界面显示
				showList(apk_list);
				// 通知listview 刷新数据完毕；
				listview.reflashComplete();
			}
		}, 2000);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

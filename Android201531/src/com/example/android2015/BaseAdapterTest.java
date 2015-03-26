package com.example.android2015;

import android.app.Activity;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class BaseAdapterTest extends Activity {
ListView myList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shierge);
		myList = (ListView) findViewById(R.id.myList);
		BaseAdapter adapter = new BaseAdapter() {
			//��д�÷��� �÷������ص�view����Ϊ�б���
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				{
					//����һ��linelayout �������������������
					LinearLayout line = new LinearLayout(BaseAdapterTest.this);
					line.setOrientation(0);
					ImageView image = new ImageView(BaseAdapterTest.this);
					image.setImageResource(R.drawable.ic_launcher);
					TextView text = new TextView(BaseAdapterTest.this);
					text.setText("��"+(position + 1)+"���б���");
					text.setTextSize(20);
					text.setTextColor(Color.RED);
					line.addView(text);
					line.addView(text);
					//����linearLayoutʵ��
					return line;
				}
				
			};
			
			//��д�÷��� �÷����ķ���ֵ����Ϊ�б����id
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return position;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				//ָ��һ������40��ѡ��
				return 40;
			}
		};
		
		myList.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base_adapter_test, menu);
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
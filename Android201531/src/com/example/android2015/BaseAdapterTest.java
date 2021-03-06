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
			//重写该方法 该方法返回的view将作为列表框
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				{
					//创建一个linelayout 并向其中添加两个组件
					LinearLayout line = new LinearLayout(BaseAdapterTest.this);
					line.setOrientation(0);
					ImageView image = new ImageView(BaseAdapterTest.this);
					image.setImageResource(R.drawable.ic_launcher);
					TextView text = new TextView(BaseAdapterTest.this);
					text.setText("第"+(position + 1)+"个列表项");
					text.setTextSize(20);
					text.setTextColor(Color.RED);
					line.addView(text);
					line.addView(text);
					//返回linearLayout实例
					return line;
				}
				
			};
			
			//重写该方法 该方法的返回值将作为列表项的id
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
				//指定一共包含40个选项
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

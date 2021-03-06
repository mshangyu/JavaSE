package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
//当 第一次创建该activity时候 回掉该方法
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//创建一个线性布局管理器
		LinearLayout layout=new LinearLayout(this);
		//设置该Activity显示layout
		super.setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		//创建一个textview
		final TextView show=new TextView(this);
		//创建一个按钮
		Button bn=new Button(this);
		bn.setText(R.string.ok);
		bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
		//向Layout容器中添加TextView
		layout.addView(show);
		//向layout容器中添加按钮
		layout.addView(bn);
		//为按钮绑定一个事件监听器
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				show.setText("你好 现在北京时间是："+new java.util.Date());
			}
		});
	
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

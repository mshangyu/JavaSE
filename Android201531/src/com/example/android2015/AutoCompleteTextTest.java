package com.example.android2015;

import java.security.PublicKey;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextTest extends Activity {
	AutoCompleteTextView actv;
	MultiAutoCompleteTextView mauto;
	//定义字符串数组作为提示的文本
	String[] books=new String[]{"疯狂java讲义","疯狂ajax讲义","疯狂xml讲义","疯狂workflow讲义","疯狂安卓"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shisange);
		//创建一个ArrayAdapter 封装数组
		ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,books);
		actv = (AutoCompleteTextView)findViewById(R.id.auto);
		//设置Adapter
		actv.setAdapter(aa);
		mauto = (MultiAutoCompleteTextView)findViewById(R.id.mauto);
		//设置Adapter
		mauto.setAdapter(aa);
		//为MultiAutoCompleteTextView设置分割符
		mauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.auto_complete_text_test, menu);
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

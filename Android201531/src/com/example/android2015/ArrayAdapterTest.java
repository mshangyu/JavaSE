package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shiyige);
		ListView list1 = (ListView) findViewById(R.id.list1);
		//����һ������
		String[] arr1 = {"�����","���˽�","ţħ��"};
		//�������װ��ArrayAdapter
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.array_item,arr1);
		//Ϊlistview����adapter
		list1.setAdapter(adapter1);
		
		ListView list2 = (ListView) findViewById(R.id.list2);
		//����һ������
		String[] arr2= {"java","Hibernate","Spring","Android"};
		//�������װ��ArrayAdapter
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.checked_item,arr1);
		//Ϊlistview����adapter
		list1.setAdapter(adapter2);
		
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.array_adapter_test, menu);
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
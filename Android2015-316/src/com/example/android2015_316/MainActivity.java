package com.example.android2015_316;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.Preference;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText userName,passWord;
CheckBox checkBox1;
SharedPreferences pref;
Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		userName = (EditText) findViewById(R.id.userName);
		passWord = (EditText) findViewById(R.id.passWord);
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		
		pref = getSharedPreferences("UserInfo", MODE_PRIVATE);
		editor = pref.edit();
		String name = pref.getString("userName", "");
		String pass = pref.getString("passWord", "");
		
		if (name == null || pass==null) {  /*������Ϊ�˵�������û���������֮�� �´λ���ס�û���  Ĭ�ϵ� ֻҪ�û�����ֵ�û��ͻ�Ѹ�ѡ�����ס*/
			checkBox1.setChecked(false);
		}else {
			checkBox1.setChecked(true);
			userName.setText(name);
			passWord.setText(pass);
		}
	}
	public void doClick(View v){
		switch (v.getId()) {
		case R.id.button1:
			String name=userName.getText().toString().trim();  /*��ȡ��������� ��ȥ����β�Ŀո� */
			String pass=passWord.getText().toString().trim();  /*��ȡ��������� ��ȥ����β�Ŀո� */
			if ("admin".equals(name)&&"123456".equals(pass)) {
				if (checkBox1.isChecked()) {         /*�������û��������붼��ȷ�������  ���ҹ�ѡ�˸�ѡ���ס����*/
					editor.putString("userName", name); /*���ʱ�����ж����û������б���*/
					editor.putString("passWord", pass); 
					editor.commit();
					
				}else {
					editor.remove("userName");  /*���û�н��м�ס�û����Ĺ�ѡ��ô �Ͳ����ס*/
					editor.commit();
				}
				Toast.makeText(MainActivity.this, "��½�ɹ� ��ϲ��", Toast.LENGTH_LONG).show();
			}else {
				Toast.makeText(MainActivity.this, "��½ʧ�� ������˼�", Toast.LENGTH_LONG).show();
			}
			break;

		default:
			break;
		}
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

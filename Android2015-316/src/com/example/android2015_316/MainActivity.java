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
		
		if (name == null || pass==null) {  /*这里是为了当你填过用户名和密码之后 下次还记住用户名  默认的 只要用户名有值得话就会把复选框给勾住*/
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
			String name=userName.getText().toString().trim();  /*获取输入的名字 并去掉首尾的空格 */
			String pass=passWord.getText().toString().trim();  /*获取输入的密码 并去掉首尾的空格 */
			if ("admin".equals(name)&&"123456".equals(pass)) {
				if (checkBox1.isChecked()) {         /*在输入用户名和密码都正确的情况下  并且勾选了复选框记住密码*/
					editor.putString("userName", name); /*这个时候会进行对于用户名进行保存*/
					editor.putString("passWord", pass); 
					editor.commit();
					
				}else {
					editor.remove("userName");  /*如果没有进行记住用户名的勾选那么 就不会记住*/
					editor.commit();
				}
				Toast.makeText(MainActivity.this, "登陆成功 恭喜你", Toast.LENGTH_LONG).show();
			}else {
				Toast.makeText(MainActivity.this, "登陆失败 不好意思喽", Toast.LENGTH_LONG).show();
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

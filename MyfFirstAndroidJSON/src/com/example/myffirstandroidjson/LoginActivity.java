package com.example.myffirstandroidjson;



import com.gem.service.impl.UserServiceImpl;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class LoginActivity extends Activity implements OnClickListener{
	EditText edtId1;
	EditText edtId2;
	Button btnLogin;
	Button btnRegister;
	String response;
	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			if (msg.what == 0x123) {
				// 设置show组件显示服务器响应
				Toast.makeText(LoginActivity.this,String.valueOf(response.length()), 3000).show();
				if (response.length()>0) {
					Toast.makeText(LoginActivity.this, "登录成功！", 3000).show();
					Intent intent =new Intent(LoginActivity.this,ListViewActivity.class);
					startActivity(intent);
				} else {
					Toast.makeText(LoginActivity.this,"账号或密码错误！", 3000).show();
				}
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		// ======================================

		edtId1 = (EditText) findViewById(R.id.et_userName);
		edtId2= (EditText) findViewById(R.id.et_password);
		btnLogin = (Button) findViewById(R.id.denglu);
		btnRegister = (Button) findViewById(R.id.zhuce);
		btnLogin.setOnClickListener(this);
		btnRegister.setOnClickListener(this);
		// ======================================
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.denglu) {
			// ============================
			// Toast.makeText(getApplicationContext(), "Login", 3000).show();
			/*
			 * int empId=Integer.parseInt(edtId.getText().toString()) ; String
			 * s=new EmployeeServiceImpl().getEmployeeById(empId, "");
			 * if(s=="1"){ Toast.makeText(getApplicationContext(), "登录成功！",
			 * 3000).show(); } else { Toast.makeText(getApplicationContext(),
			 * "账号或密码错误！", 3000).show(); }
			 */
			new Thread() {
				@Override
				public void run() {
					Looper.prepare();
					String userName = edtId1.getText().toString();
					String password = edtId2.getText().toString();
					response = new UserServiceImpl().getUserByName(userName, password);
					handler.sendEmptyMessage(0x123);
					Looper.loop();
				}
			}.start();

			// ============================
		} else if (v.getId() == R.id.zhuce) {
			Toast.makeText(getApplicationContext(), "Register", 3000).show();
		}
	}

}

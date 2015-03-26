package com.example.handler01;



import java.security.PublicKey;

import android.app.Activity;
import android.R.integer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	private TextView textView;
	private Button button;
	
	private Handler hander=new Handler();
		
	
	
	
	/*ʹ��postDelayed���� �����������߳���ʹ��*/
	private ImageView imageView;
	private int images[]={R.drawable.suancaiyu,R.drawable.youyu,R.drawable.rouwan};
	private int index;
	private MyRunnable myRunnable=new MyRunnable();
	class MyRunnable implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			index++;
			index=index%3;
			imageView.setImageResource(images[index]);
			hander.postDelayed(myRunnable, 1000);	/*��Щд��֮�� ��Ҫ�����߳��е���һ��*/
			
		}
	}
	
	/*���ﴴ��һ���������Ϊ�˲���sendMessage�������*/
	class Person{
		public  int age;
		public String name;
		public String toString(){
			return "name="+name+"age="+age;
		}
	}
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.textview);
		imageView=(ImageView) findViewById(R.id.imageView1);
		button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		//hander.postDelayed(myRunnable, 1000);
		
		/*new Thread() {
			public void run() {
				try {
					Thread.sleep(1000);
					hander.post(new Runnable() {

						@Override
						public void run() {
							// TODO Auto-generated method stub
							textView.setText("UPDATE THREAD");
						}
					});

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();  ����߳��ǲ��� postDelayed������
		*/
		
		new Thread(){
			public void run(){
				/*Thread.sleep(2000);
				��Ҫ������Ϣ ����������Ҫ����һ����Ϣ
				Message message=new Message();
				message.arg1=88;
				message.arg2=100;*/
				Message message=hander.obtainMessage();
				Person person=new Person();
				person.age=18;
				person.name="kiki";
				message.obj=person;
				message.sendToTarget();
				//hander.sendMessage(message);
			};
		}.start();
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


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		hander.removeCallbacks(myRunnable);
	}
}
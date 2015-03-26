package com.example.myffirstandroidjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.gem.service.impl.UserServiceImpl;
import com.gem.vo.User;



import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ListViewActivity extends Activity {

	ListView listView;
	List<User> lists ;
	Handler handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg)
		{
			if(msg.what == 0x123)
			{

				Toast.makeText(getApplicationContext(), String.valueOf(lists.size()), 3000).show();
				
				try {
					List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
					for (User user: lists) {
						HashMap<String, Object> item = new HashMap<String, Object>();
						item.put("userName", user.getUserName());
						item.put("sex", user.getSex());
						item.put("eMail", user.geteMail());
						item.put("phoneNumber", user.getPhoneNumber());
						
						data.add(item);
					}
					SimpleAdapter adapter = new SimpleAdapter(ListViewActivity.this, data,
							R.layout.item,
							new String[] { "userName", "sex","eMail","phoneNumber" }, new int[] {
									R.id.username,R.id.sex,R.id.email, R.id.phonenumber});
					listView.setAdapter(adapter);
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(), "сп╢М", 3000).show();
					e.printStackTrace();
				}
			}
		}
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    	// =======================
		 listView = (ListView) findViewById(R.id.listView1);
		new Thread() {
			@Override
			public void run() {
				Looper.prepare();

				 lists = new UserServiceImpl().getAllUser();
				handler.sendEmptyMessage(0x123);
				Looper.loop();
			}
		}.start();
	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_view, menu);
        return true;
    }
    
}

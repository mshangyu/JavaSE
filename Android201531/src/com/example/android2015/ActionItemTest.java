package com.example.android2015;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;

public class ActionItemTest extends Activity {
	private TextView txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actionitemtest);
		txt = (TextView) findViewById(R.id.txt);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.action_item_test, menu);
		return super.onCreateOptionsMenu(menu);
	}

	// ͨ��ѡ��Ĳ˵��� ��������Ļص�����
	@Override
	public boolean onOptionsItemSelected(MenuItem mi) {
		if (mi.isCheckable()) {
			mi.setCheckable(true);
		}
		// �жϵ��������Ǹ��˵��� ��������Ե�������Ӧ
		switch (mi.getItemId()) {
		case R.id.font_10:
			txt.setTextSize(10 * 2);
			break;
		case R.id.font_12:
			txt.setTextSize(12 * 2);
			break;
		case R.id.font_14:
			txt.setTextSize(14 * 2);
			break;
		case R.id.font_16:
			txt.setTextSize(16 * 2);
			break;
		case R.id.font_18:
			txt.setTextSize(18 * 2);
			break;

		case R.id.red_font:
			txt.setTextColor(Color.RED);
			mi.setChecked(true);
			break;
		case R.id.green_font:
			txt.setTextColor(Color.GREEN);
			mi.setChecked(true);
			break;
		case R.id.blue_font:
			txt.setTextColor(Color.BLUE);
			mi.setChecked(true);
			break;

		case R.id.plain_item:
			Toast toast = Toast.makeText(ActionItemTest.this, "�㵥������ͨ�˵���",
					Toast.LENGTH_LONG);
			toast.show();
			break;
		}

		return true;
	}
}

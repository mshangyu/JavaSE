package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class GridLayoutTest extends Activity {
	GridLayout gridLayout;
	// 定义16个按钮的文本
	String[] chars = new String[] { "7", "8", "9", "%", "4", "5", "6", "*","1","2","3","-",
			".", "0", "=", "+" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diwuge);
		gridLayout = (GridLayout) findViewById(R.id.root);
		for (int i = 0; i < chars.length; i++) {
			Button bn = new Button(this);
			bn.setText(chars[i]);
			// 设置该按钮的字号大小
			bn.setTextSize(40);
			// 指定该组件所在的行
			GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
			GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
			GridLayout.LayoutParams params = new GridLayout.LayoutParams(
					rowSpec, columnSpec);
			// 指定该组件占满父容器
			params.setGravity(Gravity.FILL);
			gridLayout.addView(bn, params);
		}
	}
}

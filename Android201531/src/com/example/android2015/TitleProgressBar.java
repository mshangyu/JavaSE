package com.example.android2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;


public class TitleProgressBar extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
//		//���ô���������������ʾ���ȵĽ�����
//		requestWindowFeature(Window.FEATURE_PROGRESS);  //��
		//���ô������������ò���ʾ���ȵĽ�����
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS); //��
		setContentView(R.layout.activity_title_progress_bar);
		Button bn1 = (Button)findViewById(R.id.bn1);
		Button bn2 = (Button)findViewById(R.id.bn2);
		bn1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View source)
			{
				//��ʾ�������ȵĽ�������
				setProgressBarIndeterminateVisibility(true);
				//��ʾ�����ȵĽ�������
				setProgressBarVisibility(true);
				//���ý������Ľ���
				setProgress(4500);

			}
		});
		bn2.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View source)
			{
				//���ز������ȵĽ�������
				setProgressBarIndeterminateVisibility(false);
				//���ش����ȵĽ�������
				setProgressBarVisibility(false);
			}
		});
	}
}
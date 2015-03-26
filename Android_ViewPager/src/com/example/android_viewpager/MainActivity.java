package com.example.android_viewpager;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {
//��view1 2 3 4 ת��view����
	
	private List<View> viewlist;
	private ViewPager pager;
	//�����Ѿ������˵�һ���ڶ���������������ҳ�� ����ÿ��ҳ������б���ʲô�� ���ھ�������
	private PagerTabStrip tab;
	private List<String> titleList;  //�������������ű��� ���еı��ⶼ����������������
	private List<Fragment> fraglist;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewlist=new ArrayList<View>();
		
		//��һ�ַ���
		//ͨ��view����ȥ��ΪviewPager������Դ
		View view1 =View.inflate(this, R.layout.view1, null);
		View view2 =View.inflate(this, R.layout.view2, null);
		View view3 =View.inflate(this, R.layout.view3, null);
		View view4 =View.inflate(this, R.layout.view4, null);
		
		//���ڰ����Ƿŵ�����Դ�ļ�������
		viewlist.add(view1);
		viewlist.add(view2);
		viewlist.add(view3);
		viewlist.add(view4);
		
		/*
		 * �ڶ��ַ��� 
		 * ͨ��Fragment��ΪViewPager������Դ
		 * */
		fraglist=new ArrayList<Fragment>();
		fraglist.add(new Fragment1());
		fraglist.add(new Fragment2());
		fraglist.add(new Fragment3());
		fraglist.add(new Fragment4());
		//����Щд��֮�� �Ϳ���д������������ MyFragmentPagerAdapter
		
		
		
		
		
		
		//ΪVIEWPAGER ҳ�����ñ���
		titleList=new ArrayList<String>();
		titleList.add("��һҳ");
		titleList.add("�ڶ�ҳ");
		titleList.add("����ҳ");
		titleList.add("����ҳ");
		
		//���������Ϊpagertabstrip����һЩ����
		//���ȶ�tab���г�ʼ��
		tab=(PagerTabStrip) findViewById(R.id.tab);
		tab.setBackgroundColor(Color.YELLOW);
		tab.setTextColor(Color.RED);
		//��仰��ȥ���������
		tab.setDrawFullUnderline(false);
		//��仰����������С���ߵ���ɫ
		tab.setTabIndicatorColor(Color.GREEN);
		
		
//		//��ʼ��ViewPager
		pager=(ViewPager) findViewById(R.id.pager);
		
		//����pageradapter��������
		//MyPagerAdapter adapter =new MyPagerAdapter(viewlist);
		
		//���ڽ�titlelist���ӵ����췽������
		MyPagerAdapter adapter =new MyPagerAdapter(viewlist,titleList);
		
		//viewpager����������           
	//	pager.setAdapter(adapter);
		//��Щ������֮���Իᱻע�� ���ǵ�����ȥ�����Ǹ�ҳ���ʱ�� �Ͱ�ע�Ӹ�ȡ����
		
		//����MyFragmentPagerAdapter.javaд����֮�� �Ϳ��Թ���Щ��ʼ���������ȵ���
//		//��ʼ��������
		MyFragmentPagerAdapter adapter2=new MyFragmentPagerAdapter(getSupportFragmentManager(), fraglist, titleList);
	//	pager.setAdapter(adapter2);
		
//      //
		MyFragmentPagerAdapter2 adapter3=new MyFragmentPagerAdapter2(getSupportFragmentManager(), fraglist, titleList);
		pager.setAdapter(adapter3);
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
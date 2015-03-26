package com.example.android_viewpager;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyPagerAdapter extends PagerAdapter {
	// ���������Ĺ��췽��д���� ��һ��
	private List<View> viewlist;
	private List<String> titlelList;

	public MyPagerAdapter(List<View> viewList) {
		this.viewlist = viewList;
	}

	public MyPagerAdapter(List<View> viewList, List<String> titleList) {
		// TODO Auto-generated constructor stub
		this.viewlist = viewList;
		this.titlelList=titleList;
	}

	
	
	
	// ���ص���ҳ��������
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewlist.size();
	}

	// �жϵ�ǰview�Ƿ������ڶ��� ͨ���ж��Ƿ��������ʾ
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == arg1;
	}

	// ��������������û��дȫ�� ��ôҲҪ����  
	//����ʵ��������֮�� ��Ҫȥmainactivity�д���������

	// ʵ����һ��ҳ��
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		//��Ҫ���ӵ�viewgroup����
		container.addView(viewlist.get(position));
		return viewlist.get(position);
	}

	// ����һ��ҳ��
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		//ͨ��ViewGroup container���Ƴ�һ��view
		container.removeView(viewlist.get(position));
	}
	
	//����һ������Ļ� ��Ҫ����ķ���  ����viewpagerҳ���ı���
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return titlelList.get(position);
	}
	
}
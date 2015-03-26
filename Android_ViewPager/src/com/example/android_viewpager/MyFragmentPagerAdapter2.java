package com.example.android_viewpager;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyFragmentPagerAdapter2 extends FragmentStatePagerAdapter{
	private List<Fragment> fragList;
	private List<String> titleList;
	
	//以下三种方法 是必须要的 自己返回的
	public MyFragmentPagerAdapter2(FragmentManager fm,List<Fragment> fragList,List<String> titlelist) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.fragList=fragList;
		this.titleList=titlelist;
	}

	//返回标题信息
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return titleList.get(position);
	}
	
	
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return fragList.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragList.size();
	}
@Override
public Object instantiateItem(ViewGroup arg0, int arg1) {
	// TODO Auto-generated method stub
	return super.instantiateItem(arg0, arg1);
}
@Override
public void destroyItem(View container, int position, Object object) {
	// TODO Auto-generated method stub
	super.destroyItem(container, position, object);
}


}

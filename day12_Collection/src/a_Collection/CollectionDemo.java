package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection coll=new ArrayList();
		Collection co=new ArrayList();
		//Collection com=new ArrayList();
		//添加一个元素
		coll.add("Google");
		coll.add("Appale");
		coll.add("Oracle");
		
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("Appale");
		
//		//添加一个集合里所有的
//		coll.addAll(co);
//		
//		System.out.println("国内"+co);
//		System.out.println("国外"+coll);
//		
//		
//		//2\删除
//		System.out.println(coll.remove("xiaomi"));
//		System.out.println(coll.remove("Appale"));
		
		//删除交集 共有的元素
		//coll.removeAll(co);
		//System.out.println(coll.removeAll(co));
		//coll.clear();
		//System.out.println("国外"+coll);
		
		//取交集操作  求同去异
		//coll.retainAll(co);
		//System.out.println("国外"+coll);
		
		//3、判断操作  判断是否为空
		//System.out.println(coll.isEmpty());
		//System.out.println(co.isEmpty());
		//子集判断（判断是否包含）
		//System.out.println(coll.containsAll(co));
		//System.out.println(co.containsAll(coll));
		//获取长度
		//System.out.println(""+co.containsAll(coll)+co.size());
		
		//使用迭代器
//		Iterator it=co.iterator();
//		System.out.println(it.next());
//		System.out.println(""+it.next()+co.size());
//		it.remove();//删除的上一次操作的对象
//		System.out.println(""+co+co.size());
//		
		//遍历操作：
		Iterator it=co.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			//co.add("geminno");
			//co.remove("Baidu");
			System.out.println("object");
		}
		
		System.out.println("======================");
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("======================");
		for(Object object:coll){
			coll.add("tes");
			coll.remove("Baidu");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=====================");
		for(Object object:coll){
			System.out.println("coll:"+object);
		}//for each循环
	
	}

}

package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;
/*
 * 让普通类具有可比性 实现comapreable接口 复写compareto方法
 * 自定义比较规则==集合的排序规则
 * */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(new Person("google",12));
		ts.add(new Person("baidu",432));
		ts.add(new Person("geminno",23));
		ts.add(new Person("nihao",12));
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Person object = (Person) iterator.next();
			System.out.println(object);
		}
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);
	}

}

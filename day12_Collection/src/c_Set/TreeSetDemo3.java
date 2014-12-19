package c_Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByAge;
import bean.Person;

//使用比较器起进行排序
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByAge());//使用TreeSet的比较器 先年龄 后名字
		
		//TreeSet ts=new TreeSet(); //默认使用person的自然排序 先名字 后年龄
				
		ts.add(new Person("google",12));
		ts.add(new Person("baidu",432));
		ts.add(new Person("geminno",23));
		ts.add(new Person("nihao",12));
		ts.add(new Person("abcd",2));
		ts.add(new Person("frrfr",2));
		
		ts.add(new Person("oracle",2));
		ts.add(new Person("oracle",3));
		ts.add(new Person("oracle",42));
		ts.add(new Person("oracle",5));
		ts.add(new Person("oracle",6));
		ts.add(new Person("oracle",7));
		
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			Person object = (Person) iterator.next();
			System.out.println(object);
		}
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);

	}

}

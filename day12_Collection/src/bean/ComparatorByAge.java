package bean;

import java.util.Comparator;
/*
 * 比较起 先按年龄排序 再按名字排序
 * */
public class ComparatorByAge implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		int res=p1.getAge()-p2.getAge();
		return res==0? p1.getName().compareTo(p2.getName()):res;
	}


	

}

package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


class A{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
}





public class ListDemo {
	public static void main(String[] args) {
		/*list可以存储各种数据，元素可以重复，有序[可以使用索引访问元素]
		 * 相对collection：特有方法;带索引index的方法*/
		
		List list=new ArrayList();
		
        //1\增加操作
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		list.add("Android-006");
//		//System.out.println(list);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//使用for循环输出元素
//		
//		
//		//2\在指定位置插入
		list.add(3,"Google");  //在下标为三的地方插入
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//使用for循环输出元素
//		
		
		//list中使用equals方法判断元素是否相同
		System.out.println(list);
		System.out.println("Android-002"+list.indexOf(new String("Android-002")));
		
		list.remove(new A());
		list.remove(new A());
		System.out.println(list);
		System.out.println("======================");
//		
//		//3、删除操作
//		list.remove(3);//移除某个位置的
//		list.remove("Android-003");//直接移除某个元素
//		//list.remove(10);//移除不存在位置的元素  出异常 使用try catch
//		try {
//			System.out.println(list.remove(10));
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//使用for循环输出元素
//		
//		System.out.println("======================");
//		
//		//4、修改
//		list.set(0, "GDG");
//		//list.set(10, "GDG");//越界  抛出异常
//		System.out.println(list.set(0, "GDG"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//使用for循环输出元素
//		
//		System.out.println("======================");
//		
//		
//		//5、遍历
//		for (Iterator it = list.iterator(); it.hasNext();) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
//		System.out.println("======================");
//		
//		Iterator it=list.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			//list.add("test");
//			System.out.println(object);
//		}
//		
		System.out.println("======================");
		
//		//ListIterator:
//		ListIterator iit=list.listIterator();
//		while (iit.hasNext()) {
//			Object object = (Object) iit.next();
//			//iit.add("Alibaba");
//			System.out.println(object);
//		}
//		
//		while (iit.hasPrevious()) {
//			System.out.println(iit.previous());
//			
//		}
//		
//		System.out.println(list);
		System.out.println("======================");
		 
		
		
		
		
		
		
		
		
	}

}

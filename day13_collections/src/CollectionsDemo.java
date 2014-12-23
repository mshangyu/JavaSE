import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;



/*Collections 是集合框架的工具类 方法都是静态的 ==类方法 
 * Tree set\map 有自然排序 集合比较器 在插入的时候完成排序
 * list ：默认不能排序
 * */
public class CollectionsDemo {
	public static void main(String[] args) {
		run1();
		//run2();
	}
		
	//string 相关的
	public static void run1(){
		List<String> list =new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("abcd");
		list.add("baidu");
		list.add("baidu");
		list.add("baidu");
		list.add("baidu");
		list.add("google");
		list.add("facebook");
		list.add("b");
		list.add("sb");
		list.add("nba");
		
		for(String string:list){
			System.out.println(string);
		}
		System.out.println("-----------------------");
		
//		//使用元素的自然顺序排序
//		Collections.sort(list);
//		//使用比较器进行排序
//		Collections.sort(list, new ComByLenth());
//		for(String string:list){
//			System.out.println(string);
//		}
		System.out.println("ComBylenth()反转===========");
		Comparator<String> com=Collections.reverseOrder(new ComByLenth());
		Collections.sort(list, com);
		for (String string : list) {
			System.out.println(string);
		}
		//交换
		System.out.println("swap======================");
		Collections.swap(list, 0, list.size()-1);
		for (String string : list) {
			System.out.println(string);
		}
		Collections.replaceAll(list, "baidu", "google");
//		Collections.fill(list, "google");
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		//反转
//		System.out.println("==========================");
//		Collections.reverse(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
//		//逆自然排序
//		Comparator<String> com=Collections.reverseOrder();
//		Collections.sort(list, com);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		//自然顺序获取最大值和最小值
//		String max =Collections.max(list);
//		String min=Collections.min(list);
//		System.out.println("自然排序：""max="+max+"\tmin="+min);
			
		//使用比较器获取最大值和最小值
//		String max=Collections.max(list, new ComByLenth());
//		String min=Collections.min(list, new ComByLenth());
//		System.out.println("max="+max+"\tmin="+min);
	}
	
	
	public static void run2(){
		List<Person> list2 =new ArrayList<Person>();
		list2.add(new Person("android",12));
		list2.add(new Person("java",1));
		list2.add(new Person("baidu",23));
		list2.add(new Person("ibm",100));
		
		for (Person person : list2) {
			System.out.println(person);
		}
		

		//自然排序
//		Collections.sort(list2);     
//		for(Person person:list2){
//			System.out.println(person);
//		}
		//使用比较器进行排序
//		Collections.sort(list2,new ComByAge());   //使用sort时候必须具有可比性
//		for(Person person:list2){
//			System.out.println(person);
//		}
//		Person max =Collections.max(list2);
//		Person min=Collections.min(list2);
//		System.out.println("自然排序："+"max="+max+"\tmin="+min);
//		Person max=Collections.max(list2, new ComByAge());
//		Person min=Collections.min(list2, new ComByAge());
//		System.out.println("max="+max+"\tmin="+min);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 



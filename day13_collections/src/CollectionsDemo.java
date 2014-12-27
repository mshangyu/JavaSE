import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;



/*Collections �Ǽ��Ͽ�ܵĹ����� �������Ǿ�̬�� ==�෽�� 
 * Tree set\map ����Ȼ���� ���ϱȽ��� �ڲ����ʱ���������
 * list ��Ĭ�ϲ�������
 * */
public class CollectionsDemo {
	public static void main(String[] args) {
		run1();
		//run2();
	}
		
	//string ��ص�
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
		
//		//ʹ��Ԫ�ص���Ȼ˳������
//		Collections.sort(list);
//		//ʹ�ñȽ�����������
//		Collections.sort(list, new ComByLenth());
//		for(String string:list){
//			System.out.println(string);
//		}
		System.out.println("ComBylenth()��ת===========");
		Comparator<String> com=Collections.reverseOrder(new ComByLenth());
		Collections.sort(list, com);
		for (String string : list) {
			System.out.println(string);
		}
		//����
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
		
		//��ת
//		System.out.println("==========================");
//		Collections.reverse(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
//		//����Ȼ����
//		Comparator<String> com=Collections.reverseOrder();
//		Collections.sort(list, com);
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		//��Ȼ˳���ȡ���ֵ����Сֵ
//		String max =Collections.max(list);
//		String min=Collections.min(list);
//		System.out.println("��Ȼ����""max="+max+"\tmin="+min);
			
		//ʹ�ñȽ�����ȡ���ֵ����Сֵ
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
		

		//��Ȼ����
//		Collections.sort(list2);     
//		for(Person person:list2){
//			System.out.println(person);
//		}
		//ʹ�ñȽ�����������
//		Collections.sort(list2,new ComByAge());   //ʹ��sortʱ�������пɱ���
//		for(Person person:list2){
//			System.out.println(person);
//		}
//		Person max =Collections.max(list2);
//		Person min=Collections.min(list2);
//		System.out.println("��Ȼ����"+"max="+max+"\tmin="+min);
//		Person max=Collections.max(list2, new ComByAge());
//		Person min=Collections.min(list2, new ComByAge());
//		System.out.println("max="+max+"\tmin="+min);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 


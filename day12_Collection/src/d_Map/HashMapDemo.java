package d_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Person;

public class HashMapDemo {
	public static void main(String[] args) {
		//Person --City
		HashMap<Person, String> hm =new HashMap<>();
		//hashsetԪ���Ƿ���ͬ�����ݣ�hashcode equals
		//hashmapԪ���Ƿ���ͬ�����ݣ����Ƿ���ͬ��
		hm.put(new Person("ibm",120), "china");
		hm.put(new Person("Alibaba",12), "jnd");
		hm.put(new Person("google",20), "mosike");
		hm.put(new Person("baidu",43), "beijing");
		hm.put(new Person("baidu",43), "suzhou");// ����ͬ ����ֵ��ͬ
		
		//����
//			Set<Map.Entry<Person, String>>  entry_set=hm.entrySet();
//			Iterator<Map.Entry<Person, String>> it1=entry_set.iterator();
//			
//			while (it1.hasNext()) {
//				Map.Entry<Person, String> entry = (Map.Entry<Person, String>) it1.next();
//				System.out.println(entry);
//			}
			
			Set<Map.Entry<Person, String>> con=hm.entrySet();
			for(Entry<Person, String> coco:con){
				System.out.println(coco);
			}
			
			Collection<Map.Entry<Person, String>> con1=hm.entrySet();
			for(Map.Entry<Person, String> coco:con){
				System.out.println(coco);
			}
			
//		    Set<Person> key=hm.keySet();
//			Iterator<Person> it=key.iterator();
//			while(it.hasNext()){
//				Person person=(Person)it.next();
//				System.out.println("Age:"+person.getAge()+"\tname"+person.getName()+"\tcity:"+hm.get(person));
//			}
////			
//			
//			for(Person value:key){
//				System.out.println(value);
//			}
//			
//			Collection<String> con=hm.values();  //ֵ��string���͵�   //���÷���
//			for(String value:con){
//				System.out.println(value);
//			}
//			
//			
			
		//System.out.println(hm);
	}

}
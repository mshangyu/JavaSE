package d_Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;



import bean.Person;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Person, String> tree =new TreeMap<>();
		
		
		tree.put(new Person("ibm",120), "china");
		tree.put(new Person("Alibaba",12), "jnd");
		tree.put(new Person("google",20), "mosike");
		tree.put(new Person("baidu",43), "beijing");
		tree.put(new Person("baidu",43), "suzhou");// ����ͬ ����ֵ��ͬ
		
		//System.out.println(tree);
		
		//����
//			Set<Map.Entry<Person, String>>  entry_set=tree.entrySet();
//			Iterator<Map.Entry<Person, String>> it1=entry_set.iterator();
//			
//			while (it1.hasNext()) {
//				Map.Entry<Person, String> entry = (Map.Entry<Person, String>) it1.next();
//				System.out.println(entry);
//			}
			
//			Set<Map.Entry<Person, String>> con=tree.entrySet();
//			for(Entry<Person, String> coco:con){
//				System.out.println(coco);
//			}
//			
			Collection<Map.Entry<Person, String>> con1=tree.entrySet();
			for(Map.Entry<Person, String> coco:con1){
				System.out.println(coco);
			}

	}

}
package d_Map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map�Ļ���ʹ�ã�
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		//1������Ԫ��
		//map.put(123, "Google");    ���ص���value��Ӧ��ֵ
		System.out.println(map.put(123, "apple"));//key������ ����null
		System.out.println(map.put(1123, "Google"));//put����key�ϴζ�Ӧ��value  ����ԭֵ
		System.out.println(map.put(321,"baidu"));
		System.out.println(map.put(11, "alibaba"));
		System.out.println(map.put(null, "hehe"));  //�������null ֻ�ܴ��һ��
		System.out.println(map.put(null, "alijaj"));
		System.out.println(map);
//		
//		System.out.println(map);
//	
		
		//2��ɾ��Ԫ��
//		System.out.println(map.remove(1));//���Ƴ�һ�������ڵļ� ����null
//		System.out.println(map.remove(11));//������� �Ƴ���ֵ�� ������value
//	
//		System.out.println(map);
//		map.clear();
//		System.out.println(map);
		
		
		//3���ж�
//		if(map.containsKey(120)){
//			System.out.println("key����");
//		}else{
//			System.out.println("key������");
//		}
//		
//		
//		if(map.containsValue("��ð�")){
//			System.out.println("Value����");
//		}else{
//			System.out.println("Value������");
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("mapΪ��");
//		} else {
//			System.out.println("map�ǿ�:"+map.size());
//		}
//		
//		//4����ȡ����
//		System.out.println(map.get(123));
//		System.out.println(map.get(119)); //�����ڷ��ؿ�
//	
		/*5����������mapû�е�����
		a.�õ�key��set����
		b.ʹ�ø�set���ϵĵ�������ȥ����key
		c.ʹ��get+������==����value 
		*/
		
		
		//��һ��
//		Set<Integer> key_set=map.keySet();
////		for(Integer Value:key_set){
////			System.out.println(Value);
////		}
//		
//		Iterator<Integer> iterable=key_set.iterator();
//		while(iterable.hasNext()){
//			Integer integer=(Integer)iterable.next();
//			System.out.println(map.get(integer));	
//		}
//		
		
//		
		//�ڶ���
		
//		Collection<String> con=map.values();  //ֵ��string���͵�   //���÷���
//		for(String value:con){
//			System.out.println(value);
//		}
//		
//		
//		Iterator<String> bb=con.iterator();
//		while(bb.hasNext()){
//			System.out.println(bb.next());
//		}
		
		//������
		/*ʹ��entrySet()������map����ת����set���� ��ʹ�õ��������е�����
		 * Map.entry���ͣ� ӳ����=��ֵ��[��--ֵ]
		 *  ��ȡһ�Լ�ֵ*/
		Set<Map.Entry<Integer, String>>  entry_set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=entry_set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it
					.next();
			System.out.println(entry);
//			Integer key=entry.getKey();
//			String value=entry.getValue();
//			System.out.println("key:"+key+"\tvalue:"+value);
		}
		
	}

}
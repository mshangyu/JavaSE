package d_Map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map的基本使用：
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		//1、添加元素
		//map.put(123, "Google");    返回的是value对应的值
		System.out.println(map.put(123, "apple"));//key不存在 返回null
		System.out.println(map.put(1123, "Google"));//put返回key上次对应的value  覆盖原值
		System.out.println(map.put(321,"baidu"));
		System.out.println(map.put(11, "alibaba"));
		System.out.println(map.put(null, "hehe"));  //允许存放null 只能存放一次
		System.out.println(map.put(null, "alijaj"));
		System.out.println(map);
//		
//		System.out.println(map);
//	
		
		//2、删除元素
//		System.out.println(map.remove(1));//当移除一个不存在的键 返回null
//		System.out.println(map.remove(11));//如果存在 移除键值对 并返回value
//	
//		System.out.println(map);
//		map.clear();
//		System.out.println(map);
		
		
		//3、判断
//		if(map.containsKey(120)){
//			System.out.println("key存在");
//		}else{
//			System.out.println("key不存在");
//		}
//		
//		
//		if(map.containsValue("你好啊")){
//			System.out.println("Value存在");
//		}else{
//			System.out.println("Value不存在");
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("map为空");
//		} else {
//			System.out.println("map非空:"+map.size());
//		}
//		
//		//4、获取操作
//		System.out.println(map.get(123));
//		System.out.println(map.get(119)); //不存在返回空
//	
		/*5、遍历操作map没有迭代器
		a.得到key的set集合
		b.使用该set集合的迭代器，去遍历key
		c.使用get+迭代器==遍历value 
		*/
		
		
		//第一种
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
		//第二种
		
//		Collection<String> con=map.values();  //值是string类型的   //调用方法
//		for(String value:con){
//			System.out.println(value);
//		}
//		
//		
//		Iterator<String> bb=con.iterator();
//		while(bb.hasNext()){
//			System.out.println(bb.next());
//		}
		
		//第三种
		/*使用entrySet()方法把map集合转换成set集合 ，使用迭代器进行迭代；
		 * Map.entry类型： 映射项=键值对[键--值]
		 *  获取一对键值*/
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

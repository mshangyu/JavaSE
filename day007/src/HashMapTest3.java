import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*Arraylist 集合嵌套 hashmap 集合并遍历
 * 需求：假设arraylist集合的元素是hashmap 有三个
 * 每一个hashmap集合的键和值 都是字符串
 * 遍历
 * 结果： 周瑜--小乔
 *    吕布---貂蝉
 *    
 *    郭靖--黄蓉
 *    杨过--小龙女
 *    
 *    令狐冲--任盈盈
 *    林平之--岳灵珊
 * */


public class HashMapTest3 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> array =new ArrayList<HashMap<String, String>>();
		
		HashMap<String, String> hs1=new HashMap<String,String>();
		hs1.put("周瑜", "小乔");
		hs1.put("吕布", "貂蝉");
		HashMap<String, String> hs2=new HashMap<String,String>();
		hs2.put("郭靖", "黄蓉");
		hs2.put("杨过", "小龙女");
		HashMap<String, String> hs3=new HashMap<String,String>();
		hs3.put("令狐冲", "任盈盈");
		hs3.put("林平之", "岳灵珊");
		
		array.add(hs1);
		array.add(hs2);
		array.add(hs3);
//		for (HashMap<String, String> hashMap : array) {
//			System.out.println(hashMap);
//		}
		
//		Set<HashMap<String, String>>  set =array.keySet();
//		for (HashMap<String, String> key : set) {
//			System.out.println(key);
//			
//			HashMap<String, String> hst=array.get(key);
//			for (HashMap<String, String> hashMap : set) {
//				System.out.println(hashMap);
//			}
//		}
		
		for (HashMap<String, String> array1 : array) {
			Set<String> set=array1.keySet();
			for (String key : set) {
				String value =array1.get(key);
				System.out.println(key+"\t"+value);
			}
		}
		
	}
}



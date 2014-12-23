import java.util.HashMap;
import java.util.Set;

/*czbk
 * 		"jc"   基础班
 * 					姓名--年龄
 * 		"jy"   就业班
 * 					姓名--年龄
 * hashmap 嵌套hashmap集合遍历
 * */
public class HashMapTest {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<String, HashMap<String, Integer>> czbk=new HashMap<String, HashMap<String, Integer>>();
		//创建元素对象
		HashMap<String, Integer> jc =new HashMap<String,Integer>();
		jc.put("毕向东", 23);
		jc.put("石松", 27);
		
		czbk.put("基础班", jc);
		
		HashMap<String, Integer> jy =new HashMap<String,Integer>();
		jy.put("崔希凡", 83);
		jy.put("刘洋", 67);
		
		czbk.put("就业班", jy);
		
		Set<String> czbkSet=czbk.keySet();
		for (String czbkSetKey: czbkSet) {
			System.out.println(czbkSetKey);
			HashMap<String, Integer> czbkSetvalue=czbk.get(czbkSetKey);
			
			Set<String> czbkSetvalueSet =czbkSetvalue.keySet();
			for (String czbkSetvalueSetKey: czbkSetvalueSet) {
				Integer czbkSetvalueSetValue = czbkSetvalue.get(czbkSetvalueSetKey);
				
				System.out.println("\t"+czbkSetvalueSetValue+"==="+czbkSetvalueSetKey);
			}
		}
	}

}

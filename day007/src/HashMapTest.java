import java.util.HashMap;
import java.util.Set;

/*czbk
 * 		"jc"   ������
 * 					����--����
 * 		"jy"   ��ҵ��
 * 					����--����
 * hashmap Ƕ��hashmap���ϱ���
 * */
public class HashMapTest {
	public static void main(String[] args) {
		//�������϶���
		HashMap<String, HashMap<String, Integer>> czbk=new HashMap<String, HashMap<String, Integer>>();
		//����Ԫ�ض���
		HashMap<String, Integer> jc =new HashMap<String,Integer>();
		jc.put("����", 23);
		jc.put("ʯ��", 27);
		
		czbk.put("������", jc);
		
		HashMap<String, Integer> jy =new HashMap<String,Integer>();
		jy.put("��ϣ��", 83);
		jy.put("����", 67);
		
		czbk.put("��ҵ��", jy);
		
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

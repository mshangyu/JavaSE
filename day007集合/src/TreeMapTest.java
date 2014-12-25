import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String line=sc.nextLine();
		
		TreeMap<Character, Integer> tm =new TreeMap<Character,Integer>();

		char[] chs=line.toCharArray();
		
		for (char ch : chs) {
			Integer i=tm.get(ch);
			if (i==null) {
				tm.put(ch, 1);
			} else {
				i++;
				tm.put(ch, i);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		Set<Character> set =tm.keySet();
		for (Character key : set) {
			 Integer value=tm.get(key);
			 sb.append(key).append(value);
		}
		String result =sb.toString();
		
		System.out.println(result);
	}

}

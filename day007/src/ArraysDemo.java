import java.util.Arrays;
import java.util.List;


public class ArraysDemo {
	public static void main(String[] args) {
		String[] strArray={"hello","world","java"};
		
		//将数组转换成集合
		List<String> list=Arrays.asList(strArray);
		
		//list.add("javaee");
		//list.remove(1);
		//list.set(1, "javaee");
		//System.out.println(list.get(1));
		
		for(String s:list){
			System.out.println(s);
		}
	}

}

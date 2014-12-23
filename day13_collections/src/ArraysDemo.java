import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*容器：数组---〉集合
 * as.list 使数组可以使用集合的高级的方法，不需要手动实现.但是不支持增删操作，因为数组是固定长度
 * */
public class ArraysDemo {
	public static void main(String[] args) {
		run1();

	}
	
	public static void run1(){
		String[] str={"baidu","google","alibab"};
		System.out.println(str);
		System.out.println(Arrays.toString(str));
		     
//		System.out.println(str[0]);
//		for (String string : str) {
//			System.out.println(string);
//		}
		//判断数组中是否有某个元素
		//System.out.println("baidu是否存在："+isExist(str, "baidu"));
		//System.out.println("jack是否存在："+isExist(str,"jack"));
		
		//将一个数组转换成集合
		List<String> list=Arrays.asList(str);
		System.out.println("baidu是否存在："+list.contains("baidu"));
		//list.add("jack");
	//	System.out.println("jack是否存在："+list.contains("jack"));
		list.remove(0);
		System.out.println();
	}
	
	public static boolean isExist(String[] arr,String str){
		for (String e : arr) {
			if (e.equals(str)) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*����������---������
 * as.list ʹ�������ʹ�ü��ϵĸ߼��ķ���������Ҫ�ֶ�ʵ��.���ǲ�֧����ɾ��������Ϊ�����ǹ̶�����
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
		//�ж��������Ƿ���ĳ��Ԫ��
		//System.out.println("baidu�Ƿ���ڣ�"+isExist(str, "baidu"));
		//System.out.println("jack�Ƿ���ڣ�"+isExist(str,"jack"));
		
		//��һ������ת���ɼ���
		List<String> list=Arrays.asList(str);
		System.out.println("baidu�Ƿ���ڣ�"+list.contains("baidu"));
		//list.add("jack");
	//	System.out.println("jack�Ƿ���ڣ�"+list.contains("jack"));
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
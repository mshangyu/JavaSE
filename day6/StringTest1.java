//遍历字符串，依次获取字符串中的每一个字符
public class StringTest1{
	public static void main(String[] args){
		//定义一个字符串
		String s="helloworld";
		
		//charAt(int index)
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		
		//通过length（）和charAt结合 可以遍历字符串
		for(int x=0;x<s.length();x++){
			System.out.println(s.charAt(x));
		}
	}
}
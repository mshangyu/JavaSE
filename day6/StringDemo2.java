public class StringDemo2{
	public static void main(String[] args){
		String s1=new String("hello");//通过new出来的就是不同的地址值了 在同一个堆中但是不在同一个位置
		String s2=new String("hello");
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2));//true
		
		String s3=new String("hello");
		String s4="hello";
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		String s5="hello";
		String s6="hello";
		System.out.println(s5==s6);//true
		System.out.println(s5.equals(s6));//true
		
		String s7="hello";
		String s8="world";
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8));//false
	
		//第二题
		String s9="hello";
		String s10="world";
		String s11="helloworld";
		//如果是字符串变量相加，先开空间 再相加存储
		System.out.println(s11==s9+s10);//false
		System.out.println(s11.equals(s9+s10));//true
		//如果是字符串常量相加，先加，在常量池里面找 ，如果有就返回常量池里面的地址，否在就创建新的存储空间
		System.out.println(s11=="hello"+"world");//true
	}
}
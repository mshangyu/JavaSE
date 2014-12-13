public class StringDemo{
	public static void main(String[] args){
		String s="hello";
		s +="world";
		System.out.println(s);  //helloworld
		
		
		String s1=new String("hello");
		String s2="hello";
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true equals ÷ÿ–¥¡À
	}
}


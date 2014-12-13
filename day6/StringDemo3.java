public class StringDemo3{
	public static void main(String[] args){
		String s="helloworld";
		System.out.println("length:"+s.length());
		
		//截取字符串指定处的长度
		System.out.println("charAt:"+s.charAt(2));
	
		//截取某个字符第一次在该字符串中出现的位置
		System.out.println("indexof:"+s.indexOf('d'));
		
		//截取某个字符在该字符串中从指定所引处开始的第一次出现的顺序
		System.out.println("indexof"+s.indexOf('w',3));
		
		//截取子串从start到末尾
		System.out.println("substring:"+s.substring(6));
		
		//截取子串 从start到end
		System.out.println("substring:"+s.substring(3,9));
	}
}
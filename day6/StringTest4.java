//键盘录入一个任意字符串 由英文组成 把该字符串的首字母大写 其他全部小写

import java.util.*;
public class StringTest4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line=sc.nextLine();
		
		//截取字符串得到第一个字符的字符串
		String s1=line.substring(0,1);
		//截取字符串得到除了第一个以后的字符串
		String s2=line.substring(1);
		//把一个大写 后面的小写
		String s3=s1.toUpperCase()+s2.toLowerCase();
		
		System.out.println(s3);
	}
}
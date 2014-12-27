
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
package java50道练习题;

import java.util.Scanner;

public class Java7统计出个数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一行字符");
		String s=sc.nextLine();
		char[] a=s.toCharArray();//转换成字符数组的形式
		//对这个字符数组进行遍历
		int yinwen=0;
		int kongge=0;
		int shuzi=0;
		int qita=0;
		for (char bb : a) {
			if (bb==' ') {
				kongge++;
				//System.out.println("空格的个数是："+kongge);
			}else if (bb<='9' && bb>='0') {
				shuzi++;
				//System.out.println("数字的个数是："+shuzi);
			} else if(bb>='a'&&bb<='z'||bb<='Z'&&bb>='A'){
				yinwen++;
				//System.out.println("英文字母的个数是："+yinwen);
			}else{
				qita++;
				//System.out.println("其他字符的个数是："+qita);
			}
		}
		System.out.println("空格的个数是："+kongge);
		System.out.println("数字的个数是："+shuzi);
		System.out.println("英文字母的个数是："+yinwen);
		System.out.println("其他字符的个数是："+qita);
		
	}

}

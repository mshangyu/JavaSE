package java50道练习题;

import java.util.Scanner;

/*题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
 * 
 * */
public class Java8键盘控制数的相加 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		
		System.out.println("请输入a的值：");
		int a=ss.nextInt();
		
		System.out.println("请输入有几个数相加：");
		int g=ss.nextInt();
		
		int s=0;
		
		for (int i = 0; i <= g; i++) {
			s=s+a;
			a=a*10+2;
		}

		System.out.println("结果是："+s);
	}   

}

/*输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 * 取得的余数作为下一轮循环的较小的数，
 * 如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。
 * */


package java50道练习题;

import java.util.Scanner;

public class Java6公约数和公倍数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个正整数");
		int m=sc.nextInt();
		System.out.println("请输入第二个正整数");
		int n=sc.nextInt();
		
		//int num=m*n/最大公约数
		int num=m*n;
		while(m>n){
			if (!(n==0)) {
				m=n;
				n=m%n;
				while (n==0) {
					System.out.println("最大公约数是："+m);
					int c=num/m;
					System.out.println("最小公倍数是："+c);
					break;
				}
			}
		}

	}

}

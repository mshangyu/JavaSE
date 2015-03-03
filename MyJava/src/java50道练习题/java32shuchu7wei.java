package java50道练习题;

import java.util.Scanner;

public class java32shuchu7wei {
	/**
	 * 【程序32】   
	 * 题目：取一个整数a从右端开始的4～7位。   
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long w=0;
		long m=n;
		long c=0;
		
		if(n<1000000){
			System.out.println("您输入的数小于7位.");
			}else{
		while(m>0){
			w++;
			c=m%10;
			if(w>=4 && w<=7){
				System.out.print(c);
			}
			m=m/10;
		}
			}
	}


	

}

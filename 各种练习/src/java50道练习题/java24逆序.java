package java50道练习题;

import java.util.Scanner;

/**
 * 【程序24】   
 * 题目：给一个不多于5位的正整数，
 * 要求：一、求它是几位数，二、逆序打印出各位数字。  
 *  //使用了长整型最多输入18位
 *///这里使用的是一种转换
public class java24逆序 {
	public static void main(String[] args) {
		//本题有两种方法 第一种用数组 把所有的数都放进去 打印出a.length 然后逆序打印输出数组 取出余数
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个不多于5位数的数");
		int n=s.nextInt();
		int wei=0;
		int m=n;
		System.out.println("逆序输出的结果为：");
		while(m>0){
			System.out.println(m%10);
			m=m/10;
			wei++;
		}
		System.out.println();
		System.out.println(n+"是一个"+wei+"数");
	}

}

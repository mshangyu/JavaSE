package java50道练习题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【程序28】   
 * 题目：对10个数进行排序  
 */
public class java28paixu {
	public static void main(String[] args) {
		//输入10数
				Scanner s=new Scanner(System.in);
				//定义一个数组
				int a[]=new int[10];
				//把输入的数装到数组
				for(int i=0;i<a.length;i++){
					a[i]=s.nextInt();
				}
				Arrays.sort(a);   //对数组里面的数据进行排序
				for(int aa:a){
					System.out.print(aa+" ");
				}
				
			}

	
}

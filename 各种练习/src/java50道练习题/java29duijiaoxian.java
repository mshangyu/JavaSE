package java50道练习题;

import java.util.Scanner;

public class java29duijiaoxian {

	//题目：求一个3*3矩阵对角线元素之和 
	//3*3矩阵坐标位置 
			/* 00 01 02
			 * 10 11 12
			 * 20 21 22
			 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < a[i].length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("你输入的三位矩阵是：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]+"");
			}
			System.out.println();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("和是："+sum);
	}

}

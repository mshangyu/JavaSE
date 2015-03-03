
/*题目：利用条件运算符的嵌套来完成此题：
 学习成绩> =90分的同学用A表示，
 60-89分之间的用B表示，60分以下的用C表示。
 * 
 * */
package java50道练习题;

import java.util.Scanner;

public class Java5条件嵌套 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("请输入学生的成绩");
		int score=sc.nextInt();
		if (score>=90) {
			System.out.println("你的成绩为A");
		}else if(score>=60) {
			System.out.println("你的成绩为B");
		}else {
			System.out.println("你的成绩为C");
		}

	}

}

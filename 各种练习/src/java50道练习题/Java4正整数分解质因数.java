/*题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
 *    程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： 
 *  (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
 * (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。   
 *(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。  
 */
package java50道练习题;

import java.util.Scanner;

public class Java4正整数分解质因数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要分解的正整数");
		int n=sc.nextInt();
		
		int k=2;
		while(n>=k){
			if (n==k) {
				System.out.println(k);
				break;  //循环之后的也要考虑  不然会一直满足n>=k  一直输出结果
			}else if (n%k==0) {
				System.out.print(k+"*");
				n=n/k;  //重复执行第一步。
			}else {
				k++;
			}
		}
		
	}

}

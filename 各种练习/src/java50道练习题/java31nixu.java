package java50道练习题;

import java.util.Scanner;

public class java31nixu {

	//题目：将一个数组逆序输出。   
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("输入30个以内整数，输入0表示输入结束！");
		int a[]=new int[30];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
			if(a[i]==0){
				for(int j=i-1;j>=0;j--){
					System.out.print(a[j]+" ");
					if(j==0){System.exit(0);}
				}
			}
		}
		
	}

	

}

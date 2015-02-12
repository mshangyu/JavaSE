package java50道练习题;

import java.util.Scanner;

public class java30charushuzu {

	/**
	 * 【程序30】   
	 * 题目：有一个已经排好序的数组。现输入一个数，
	 * 要求按原来的规律将它插入数组中。    
	 * 
	 */
	public static void main(String[] args) {
	int a[]={10,20,30,40,50,60,70,80,90,100};
		
		//新建一个数组b，比a大一个数为，为了存储放进去的数n
		int b[]=new int[a.length+1];
		
		//输入一个数n
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		if(n<a[0]){
			System.out.print(n);
			for(int aa:a){System.out.print(" "+aa);}
			
		}else if(n>a[a.length-1]){
			for(int aaa:a){System.out.print(aaa+" ");}
			System.out.print(n);
		}
		//循环查找
		else{
		for(int i=0;i<a.length-1;i++){
			while(a[i]<n && a[i+1]>n){
				
				b[i+1]=n;
				for(int j=0;j<i+1;j++){
					b[j]=a[j];
				}
				for(int k=i+1;k<a.length;k++){
					b[k+1]=a[k];
				}
				break;
				}
		}
		for(int bb:b){System.out.print(bb+" ");}
		}
	}

	

}

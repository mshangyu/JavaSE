package java50道练习题;

import java.util.Scanner;

public class java26{
public static void main(String[] args) {
	// TODO Auto-generated method stub
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

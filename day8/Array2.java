import java.util.Scanner;


public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		int z=sum(a, b);
		System.out.println(z);
	}

	
	public static int sum(int i,int j){
		return i+j;
		
	}
}

import java.util.Scanner;


public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据");
		int b=sc.nextInt();
		int z=sum(a, b);
		System.out.println(z);
	}

	
	public static int sum(int i,int j){
		return i+j;
		
	}
}

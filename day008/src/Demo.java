import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sc.nextInt();
		System.out.println("������ڶ�������");
		int b=sc.nextInt();
		
		Test hTest=new Test();
		//int g=hTest.getNum(a, b);
		//System.out.println(g);
		
		System.out.println(hTest.getNum(a, b));
		
	}

}


class Test{
	public int getNum(int a,int b){
		return a+b;
	}
}

//������.��Ա����
//������.��Ա��������
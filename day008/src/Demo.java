import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a=sc.nextInt();
		System.out.println("请输入第二个数据");
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

//对象名.成员变量
//对象名.成员方法（）
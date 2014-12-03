import java.util.*;
public class Try{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Random MyRandom=new Random();
		int A=MyRandom.nextInt(101);//定义一个随机数
		int number;
			do{
				System.out.println("请猜一下电脑生成的数");
				number=in.nextInt();//需要在循环体外定义 所以此处只是赋值
				if(number<A){
					System.out.println("小了");
				}else if(number>A){
					System.out.println("大了");
				}
			}while(number!=A);//此处的循环操作是因为 你猜的数和电脑生成的数不一样 就继续循环操作 直到相等为止
		    System.out.println("恭喜你答对了");
			
	}
}
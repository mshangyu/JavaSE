import java.util.*;
public class Add{
	public static void main(String args[]){
		int a=100;
		System.out.println(++a);
		int b=100;
		System.out.println(b++);
		int c=100;
		System.out.println(--c);
		int d=100;
		System.out.println(d--);
		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的分数");
	    int score=in.nextInt();
		System.out.println("请输入x的值");
		int x=in.nextInt();
		String type = score <60?"不及格":"及格";
		int flag=x>0?1:(x==0?0:-1);
		System.out.println("type ="+type );
		System.out.println("flag="+flag );
	
	}


}
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
		System.out.println("��������ķ���");
	    int score=in.nextInt();
		System.out.println("������x��ֵ");
		int x=in.nextInt();
		String type = score <60?"������":"����";
		int flag=x>0?1:(x==0?0:-1);
		System.out.println("type ="+type );
		System.out.println("flag="+flag );
	
	}


}
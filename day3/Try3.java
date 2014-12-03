import java.util.*;
public class Try3{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number=in.nextInt();
		for(int i=0,j=number;i<=j;i++,j--){   //约束条件一个递加一个递减
			System.out.println(i+"+"+j+"="+(i+j));//相当于3+2=5
		
		
		}
	
	
	}



}
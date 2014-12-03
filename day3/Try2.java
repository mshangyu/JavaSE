import java.util.*;
public class Try2{
	public static void main(String args[]){
		Scanner in=new Scanner (System.in);
		int sum=0;
		for(int j=0;j<5;j++){
			System.out.println("请输入第"+(j+1)+"成绩");
			int score=in.nextInt();
			sum=sum+score;
		
		
		}
		System.out.println("平均数为:"+sum/5);
	
	
	
	
	}



}
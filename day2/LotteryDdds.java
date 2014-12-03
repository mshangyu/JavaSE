import java.util;
public class LotteryDdds{
	public static void main(String args[]){
		Scanner in =new Scanner (System.in);
		
		System.out.print("你需要几位数？");
		int k=in.nextInt();
		
		System.out.print("你最多需要几位数 ");
		int n=in.nextInt();
		
		int lotteryDdds=1;
		for(int i=1;i<=k;i++)
			lotteryDdds=lotteryDdds*(n-i+1)/i;
			
		System.out.println("your ddds are 1in"+lotteryDdds+".good look");
		
	
	
	
	
	}



}
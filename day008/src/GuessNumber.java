import java.util.Scanner;


public class GuessNumber {
	public static void main(String[] args) {
		
		
		int number=(int)Math.random()*100+1;
		int count=0;
		
		int start=1;
		int end=100;
		
		
		while(true){
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入一个数据"+start+"--"+end);
			int guessnumber=scanner.nextInt();
			count++;
			if(guessnumber>number){
				System.out.println("你猜得数据大了");
				end=guessnumber;
			}else if(guessnumber<number){
				System.out.println("你猜的数据小了");
				start=guessnumber;
			}else{
				System.out.println("恭喜你"+count+"次就猜中了！");
				break;
			}
		}
	}

}

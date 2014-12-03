import java.util.*;
public class Retirement2{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in );
		
		
		
		System.out.println("HOw much money will you contribute every year");
		double payment=in.nextDouble();
		
		System.out.println("interest rate in%:");
		double interestRate=in.nextDouble();
		 
		 double balance=0;
		 int year=0;
		 
		 String input;
		 
		 do{
			balance +=payment;
			double interest=balance *interestRate/100;
			balance+=interest;
			
			year++;
			System.out.printf("after year %d,your balance is %2f%n",year ,balance);
			
			//询问是否准备退休并且输入
			System.out.print("Ready to retire (y/n)");
			input = in.next();
			
		 }
		 while(input.equals("n"));
	}
}
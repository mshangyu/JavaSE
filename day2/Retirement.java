import java.util.*;
public class Retirement{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in );
		System.out.println("how much money do you need to retire");
		double goal=in.nextDouble();
		
		System.out.println("HOw much money will you contribute every year");
		double payment=in.nextDouble();
		
		System.out.println("interest rate in%:");
		double interestRate=in.nextDouble();
		 
		 double balance=0;
		 int years=0;
		 
		 while(balance <goal ){
			balance +=payment;
			double interest=balance *interestRate/100;
			balance+=interest;
			years++;
		 }
		 
		System.out.println("you can retire in "+years +"years ");
	}
}
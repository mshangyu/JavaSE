/**
 * 
 */
package employee;


public class HourlyEmployee extends Employee {
	private double hourPay;
	private int    hours;
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HourlyEmployee(String name, int birthMonth,double hourPay,int hours) {
		super(name, birthMonth);
		// TODO Auto-generated constructor stub
		this.hourPay=hourPay;
		this.hours=hours;
	}
	@Override
	public double getSalary(int month) {
		double res=super.getSalary(month);
		if(this.hours<160){
			res=res+hourPay*hours;
		}else{
			res=res+160*hours+(hours-160)*1.5*hourPay;
		}
		return res;
	}
	
	
	


}

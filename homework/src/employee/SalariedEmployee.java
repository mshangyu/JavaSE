/**
 * 
 */
package employee;

/**
 * @author C4
 *
 */
public class SalariedEmployee extends Employee {
	private double monthSalary;//�̶���н
	/**
	 * 
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param birthMonth
	 */
	public SalariedEmployee(String name, double monthSalary, int birthMonth) {
		super(name, birthMonth);
		// TODO Auto-generated constructor stub
		this.monthSalary=monthSalary;
	}

	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)+this.monthSalary;
	}
	

}
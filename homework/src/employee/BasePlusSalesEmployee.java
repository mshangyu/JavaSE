package employee;

public class BasePlusSalesEmployee extends SalesEmployee {
	private double baseSalary;
	public BasePlusSalesEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BasePlusSalesEmployee(String name, int birthMonth, double sales,
			float percent,double baseSalary) {
		super(name, birthMonth, sales, percent);
		// TODO Auto-generated constructor stub
		this.baseSalary=baseSalary;
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return super.getSalary(month)+this.baseSalary;
	}
	

}
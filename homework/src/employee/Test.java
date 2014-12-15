package employee;

public class Test extends Employee {

	public static void main(String[] args) {
		//固定月薪员工
		SalariedEmployee se=new SalariedEmployee("google",2000,5);
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(5));
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(10));
		
		//小时工
		HourlyEmployee he=new HourlyEmployee("baidu",2,10,170);
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(2));
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(6));
		
		//无底薪销售
		SalesEmployee see=new SalesEmployee("Alibaba",3,900000.0,0.2f);
		System.out.println("name:"+see.getName()+"\tSalary:"+see.getSalary(3));
		System.out.println("name:"+see.getName()+"\tSalary:"+see.getSalary(5));
		
		//有底薪销售
		BasePlusSalesEmployee be=new BasePlusSalesEmployee("orical",4,10000.0,0.2f,8888);
		System.out.println("name"+be.getName()+"\tSalary:"+be.getSalary(4));
		System.out.println("name"+be.getName()+"\tSalary:"+be.getSalary(7));
	}

}

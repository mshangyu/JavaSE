package employee;

public class Test extends Employee {

	public static void main(String[] args) {
		//�̶���нԱ��
		SalariedEmployee se=new SalariedEmployee("google",2000,5);
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(5));
		System.out.println("name:"+se.getName()+"\tSalary:"+se.getSalary(10));
		
		//Сʱ��
		HourlyEmployee he=new HourlyEmployee("baidu",2,10,170);
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(2));
		System.out.println("name:"+he.getName()+"\tSalary:"+he.getSalary(6));
		
		//�޵�н����
		SalesEmployee see=new SalesEmployee("Alibaba",3,900000.0,0.2f);
		System.out.println("name:"+see.getName()+"\tSalary:"+see.getSalary(3));
		System.out.println("name:"+see.getName()+"\tSalary:"+see.getSalary(5));
		
		//�е�н����
		BasePlusSalesEmployee be=new BasePlusSalesEmployee("orical",4,10000.0,0.2f,8888);
		System.out.println("name"+be.getName()+"\tSalary:"+be.getSalary(4));
		System.out.println("name"+be.getName()+"\tSalary:"+be.getSalary(7));
	}

}

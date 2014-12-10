class Employee{
	 String name;//员工姓名
	 int birthmonth;//员工的生日月份
	
	public Employee(String name,int birthmonth){
		this.name=name;
		this.birthmonth=birthmonth;//构造方法初始化对象
	}
	public double getSalary(int month){
		if(month==this.birthmonth){
			return 100;      //如果为员工生日月份则增加100
		}else{
			return 0;
		}
	}
	
	

}
	
//拿固定工资的员工
class SalariedEmployee extends Employee{
	private double salary;   //月薪   这里用不用私有化都一样
	public SalariedEmployee(String name,int month, double salary){
		super(name,month);
		this.salary=salary;
	}
	public double getSalary(int month){
		return salary+super.getSalary(month);
	}
}

//按小时拿工资的员工
class HourlyEmployee extends Employee{
	 double salary;//每小时工资
	 int hour;//每月工作的小时数
	public HourlyEmployee(String name,int birthmonth,double salary,int hour){
		super(name,birthmonth);
		this.salary=salary;
		this.hour=hour;
	}
	public double getSalary(int month){
		if(hour>160){
			return(salary*160+(hour-160)*1.5*salary+super.getSalary(month));
		}else{
			return (hour*salary+super.getSalary(month));
		}
		//System.out.println(sal);
	}
}
//销售人员
class SalesEmployee extends Employee{
	 double sale;//销售额
	 double bonus;//提成率
	 public SalesEmployee(String name,int birthmonth,double sale,double bonus){
		super(name,birthmonth);
		this.sale=sale;
		this.bonus=bonus;
	}
	public double getSalary(int month){
		return(sale*bonus+super.getSalary(month));
	}
	
}

//有固定底薪的销售人员
class BasePlusSalesEmployee extends SalesEmployee{
	 double baseSalary;//底薪
	public BasePlusSalesEmployee(String name,int birthmonth,double sale,double bonus,double baseSalary){
		super(name,birthmonth,sale,bonus);
		this.baseSalary=baseSalary;
	}
	public double getSalary(int month){
		return baseSalary+super.getSalary(month);
	}
}

public class Test{
	public static void main(String[] args){
	    Employee a[] = new Employee[4];  
          
        a[0] = new SalariedEmployee("A", 2, 1000);  //2、3、4、5代表的是他们的生日
        a[1] = new HourlyEmployee("B", 3, 2000, 200);  
        a[2] = new SalesEmployee("C", 4, 50000,  0.1);  
        a[3] = new BasePlusSalesEmployee("D", 5, 50000,  0.1, 1000);  
          
        System.out.println("A的工资为" + a[0].getSalary(2));  //这里的2代表的是自己输入的那个月的工资
        System.out.println("B的工资为" + a[1].getSalary(2));  
        System.out.println("C的工资为" + a[2].getSalary(2));  
        System.out.println("D的工资为" + a[3].getSalary(2)); 
		
		//SalariedEmployee A=new SalariedEmployee();
		//System.out.println(A.getSalary("A",7,2000));
		//A.getSalary("A的工资为",7,2000);
		//HourlyEmployee B=new HourlyEmployee();
		//B.getSalary("A",2,2233.0,12);
		//SalesEmployee C=new SalesEmployee("C的工资为",3,5000,0.9);
		//C.getSalary("C的工资为",3,5000,0.9);
		//BasePlusEmployee D=new BasePlusEmployee("D的工资为",9,50000,0.9,1000);
		//D.getSalary("D的工资为",9,50000,0.9,1000);
	}
}
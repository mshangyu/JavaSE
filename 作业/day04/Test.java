class Employee{
	 String name;//Ա������
	 int birthmonth;//Ա���������·�
	
	public Employee(String name,int birthmonth){
		this.name=name;
		this.birthmonth=birthmonth;//���췽����ʼ������
	}
	public double getSalary(int month){
		if(month==this.birthmonth){
			return 100;      //���ΪԱ�������·�������100
		}else{
			return 0;
		}
	}
	
	

}
	
//�ù̶����ʵ�Ա��
class SalariedEmployee extends Employee{
	private double salary;   //��н   �����ò���˽�л���һ��
	public SalariedEmployee(String name,int month, double salary){
		super(name,month);
		this.salary=salary;
	}
	public double getSalary(int month){
		return salary+super.getSalary(month);
	}
}

//��Сʱ�ù��ʵ�Ա��
class HourlyEmployee extends Employee{
	 double salary;//ÿСʱ����
	 int hour;//ÿ�¹�����Сʱ��
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
//������Ա
class SalesEmployee extends Employee{
	 double sale;//���۶�
	 double bonus;//�����
	 public SalesEmployee(String name,int birthmonth,double sale,double bonus){
		super(name,birthmonth);
		this.sale=sale;
		this.bonus=bonus;
	}
	public double getSalary(int month){
		return(sale*bonus+super.getSalary(month));
	}
	
}

//�й̶���н��������Ա
class BasePlusSalesEmployee extends SalesEmployee{
	 double baseSalary;//��н
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
          
        a[0] = new SalariedEmployee("A", 2, 1000);  //2��3��4��5����������ǵ�����
        a[1] = new HourlyEmployee("B", 3, 2000, 200);  
        a[2] = new SalesEmployee("C", 4, 50000,  0.1);  
        a[3] = new BasePlusSalesEmployee("D", 5, 50000,  0.1, 1000);  
          
        System.out.println("A�Ĺ���Ϊ" + a[0].getSalary(2));  //�����2��������Լ�������Ǹ��µĹ���
        System.out.println("B�Ĺ���Ϊ" + a[1].getSalary(2));  
        System.out.println("C�Ĺ���Ϊ" + a[2].getSalary(2));  
        System.out.println("D�Ĺ���Ϊ" + a[3].getSalary(2)); 
		
		//SalariedEmployee A=new SalariedEmployee();
		//System.out.println(A.getSalary("A",7,2000));
		//A.getSalary("A�Ĺ���Ϊ",7,2000);
		//HourlyEmployee B=new HourlyEmployee();
		//B.getSalary("A",2,2233.0,12);
		//SalesEmployee C=new SalesEmployee("C�Ĺ���Ϊ",3,5000,0.9);
		//C.getSalary("C�Ĺ���Ϊ",3,5000,0.9);
		//BasePlusEmployee D=new BasePlusEmployee("D�Ĺ���Ϊ",9,50000,0.9,1000);
		//D.getSalary("D�Ĺ���Ϊ",9,50000,0.9,1000);
	}
}
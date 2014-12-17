package employee;

public class Employee {
	private String name;
	private double salary;
	private int birthMonth;
	
	public Employee(){}
	public Employee(String name, int birthMonth) {
		super();
		this.name = name;
		
		this.birthMonth = birthMonth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	���ݲ����·���ȷ�����ʣ������Ա�������� ��˾����⽱��100Ԫ
	public double getSalary(int month){
		if(this.birthMonth==month){
			System.out.println("ף"+this.name+"���տ���");
			return this.salary+100;
		}else{
			return this.salary;
		}
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	

	
	

}
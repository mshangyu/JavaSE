public class Employee{
	int id;
	String name;
	double salary;
	//���ص��޲ι��캯��
	
	//���캯�������ܱ��̳�
	public Employee(){
		System.out.println("������޲ι��캯��");
	}
	//һ�ι��캯��
	public Employee(int id){
		System.out.println("�����һ�ι��캯��");
		//this.id=id;
		super(id);
	}
	
	public String getName(){
		return name;
	}
	public double getsalary(){
		return salary;
	}
	
	public void info(){   //�����info������ǹ��е�
		System.out.println("id:"+id+"name:"+name+"salary:"+salary);
		System.out.println("�����info()");
	}
	
	
}
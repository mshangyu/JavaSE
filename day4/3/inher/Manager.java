public class Manager extends Employee{
	//��������
	String car;
	String office;
	
	//���췽��������Ĺ��췽�����б�����ø��๹�췽��
	public Manager(){//�����޲ι��췽��+û����ʾ���ø���Ĺ��캯�� ������Զ����ø����޲ι��췽��  �������Ҳû���޲ι��캯�� ϵͳ��Ĭ�ϸ�һ��
		System.out.println("�����޲ι��캯��");
	}
	
	//�����һ�ι��췽��
	public Manager (int id){
		
		//super(id);//����Ĺ��캯��
		System.out.println("����һ�ι��캯��");
		//this.id =id;
	}
	//����� ���ι��캯��
	 public Manager(int id,String name){//this�ڹ��캯���� ������ڵ�һλ
	 
		this(id);//thisָ��һ�ι��캯�� this������ĳ������Ҳ�����Ǵ���ĳ�����캯��
		System.out.println("�������ι��캯��");
		
		//this.id =id;
		this.name=name;
	}
	
	//���з���
	public void drive(){
		// System.out.println("name:"+name+"��"+car+"�ϰ�");
		System.out.println("super.name:"+super.name+"��"+this.car+"�ϰ�");		//name �Ǹ�������
		System.out.println("this.name:"+super.name+"��"+this.car+"�ϰ�");
	
	}
	//super:��������� 
	public void info(){
		// System.out.println("id:"+id+"name:"+name+"salary:"+salary);
		System.out.println("�����info()");
		super.info();
		System.out.println("car:"+car+"\noffice"+office);
	}
	
}
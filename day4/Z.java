
class Student{
	{
		System.out.println("���ǹ��캯��");
	}
	static{
		System.out.println("���Ǿ�̬�����");
	}
	
	void print(){
		System.out.println("������ͨ����");
	}
	
	public String name;//��ʾ��ʼ��
	
	
	private  String country;
	public void setCountry(String country){
		this.country=country;
	}
	public String getCountry(){
		return this.country;
	}
	
}

public class  Z{
	public static void main(String[] args){
		Student s=new Student();
		s.print();
		
		s.name="kk";
		System.out.println(s.name);
		
		s.setCountry("����");
		System.out.println(s.getCountry());
	}
}
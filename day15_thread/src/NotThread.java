
public class NotThread {
	public static void main(String[] args) {
		Monkey m1=new Monkey("��һ�������");
		Monkey m2=new Monkey("�ڶ��������");
		Monkey m3=new Monkey("�����������");
		
		m1.fight();
		m2.fight();
		m3.fight();

	}

}
class Monkey{
	String name;
	public Monkey(String name){
		super();
		this.name=name;
	}
	
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name+"��ܵ�"+i+"�����");
		}
	}
}
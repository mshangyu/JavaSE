



public class Fights {
	public static void main(String[] args) {
		Monkey2 m1=new Monkey2("��һ�������");
		Monkey2 m2=new Monkey2("�ڶ��������");
		Monkey2 m3=new Monkey2("�����������");
		
		m1.fight();
		m2.fight();
		m3.fight();
		
		System.out.println();

	}

}
class Monkey2{
	String name;
	public Monkey2(String name){
		super();
		this.name=name;
		
	}
	
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name+"��ܵ�"+i+"�����");
		}
	}
}
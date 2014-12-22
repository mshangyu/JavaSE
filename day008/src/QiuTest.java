
public class QiuTest {
	public static void main(String[] args) {
		Ping pp=new Ping();
		pp.setAge(12);
		pp.setName("����");
		System.out.println(pp.getAge()+pp.getName());
		pp.speak();
		pp.eat();
		pp.study();
	}

}
interface SpeakEnglish{
	public abstract void speak();
}

//����� ������
abstract class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
}

//�˶�Ա������
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	public abstract void study();
}

//������˶�Ա��
//ƹ�����˶�Ա��
class Ping extends Player implements SpeakEnglish{
	public Ping(){}
	public Ping(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("ƹ�����˶�Ա����ͼ���");
	}
	public void speak(){
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
	public void study(){
		System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
	}
}
//�����˶�Ա
class Lan extends Player{
	public Lan(){}
	public Lan(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("�����˶�Ա����ͼ���");
	}
	public void study(){
		System.out.println("�����˶�Աѧϰ��η���ͽ���");
	}
}
//����������
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
}
//ƹ�������������
class PingCoach extends Coach implements SpeakEnglish{
	public PingCoach(){}
	public PingCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("ƹ�����������ͼ���");
	}
	public void speak(){
		System.out.println("ƹ�������˵Ӣ��");
	}
	public void teach(){
		System.out.println("ƹ�������ѧϰ��η���ͽ���");
	}
}
//�������������
class LanCoach extends Coach implements SpeakEnglish{
	public LanCoach(){}
	public LanCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�����������ͼ���");
	}
	public void speak(){
		System.out.println("�������˵Ӣ��");
	}
	public void teach(){
		System.out.println("�������ѧϰ��η���ͽ���");
	}
}





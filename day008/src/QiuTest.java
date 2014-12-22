
public class QiuTest {
	public static void main(String[] args) {
		Ping pp=new Ping();
		pp.setAge(12);
		pp.setName("李响");
		System.out.println(pp.getAge()+pp.getName());
		pp.speak();
		pp.eat();
		pp.study();
	}

}
interface SpeakEnglish{
	public abstract void speak();
}

//人这个 抽象类
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

//运动员抽象类
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	public abstract void study();
}

//具体的运动员类
//乒乓球运动员类
class Ping extends Player implements SpeakEnglish{
	public Ping(){}
	public Ping(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("乒乓球运动员吃粥和鸡蛋");
	}
	public void speak(){
		System.out.println("乒乓球运动员说英语");
	}
	public void study(){
		System.out.println("乒乓球运动员学习如何发球和接球");
	}
}
//篮球运动员
class Lan extends Player{
	public Lan(){}
	public Lan(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("篮球运动员吃粥和鸡蛋");
	}
	public void study(){
		System.out.println("篮球运动员学习如何发球和接球");
	}
}
//教练抽象类
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
}
//乒乓球教练具体类
class PingCoach extends Coach implements SpeakEnglish{
	public PingCoach(){}
	public PingCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("乒乓球教练吃粥和鸡蛋");
	}
	public void speak(){
		System.out.println("乒乓球教练说英语");
	}
	public void teach(){
		System.out.println("乒乓球教练学习如何发球和接球");
	}
}
//篮球教练具体类
class LanCoach extends Coach implements SpeakEnglish{
	public LanCoach(){}
	public LanCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("篮球教练吃粥和鸡蛋");
	}
	public void speak(){
		System.out.println("篮球教练说英语");
	}
	public void teach(){
		System.out.println("篮球教练学习如何发球和接球");
	}
}





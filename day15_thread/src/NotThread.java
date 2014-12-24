
public class NotThread {
	public static void main(String[] args) {
		Monkey m1=new Monkey("第一个孙悟空");
		Monkey m2=new Monkey("第二个孙悟空");
		Monkey m3=new Monkey("第三个孙悟空");
		
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
			System.out.println(name+"打败第"+i+"个天兵");
		}
	}
}
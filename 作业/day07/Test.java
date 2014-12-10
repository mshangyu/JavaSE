interface Assaultable{
	public abstract void attack();
}

interface Mobile{
	public abstract void move();
}

abstract class Weapon implements Assaultable,Mobile{
	public abstract void attack();
	public abstract void move();
}
 
class Tank extends Weapon{
	public void attack(){
		System.out.println("进攻1啊！");
	}
	public void move(){
		System.out.println("转移阵地1");
	}
}

class WarShip extends Weapon{
	public void attack(){
		System.out.println("进攻2啊！");
	}
	public void move(){
		System.out.println("转移阵地2");
	}
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("进攻3啊！");
	}
	public void move(){
		System.out.println("转移阵地3");
	}
}

class Army{
	Weapon[] w;
	int max;
	int j=0;
	Army(int max){
		this.max=max;
		w=new Weapon[max];//用max来初始化数组w
	}
	public void addWeapon(Weapon wa){
		if(j<w.length){
			w[j]=wa;
			System.out.println("武器库加入了"+(j+1)+"个武器");
			j++;
		};//怎样将一个参数加入到数组中
	}
	public void attackAll(){//让所有武器攻击 就是将数组遍历一次
		for(int i=0;i<w.length;i++){
			w[i].attack();
		}
	}
	public void moveAll(){
		for(int i=0;i<w.length;i++){
			w[i].move();
		}
	}
	
}

public class Test{
	public static void main(String[] args){
		Army a=new Army(3);
		Tank D = new Tank();
		a.addWeapon(D);
		Flighter f=new Flighter();
		a.addWeapon(f);
		WarShip h=new WarShip();
		a.addWeapon(h);

		
		a.attackAll();
		a.moveAll();
	}
}	
	
	
	
	
	
	
	
	
 
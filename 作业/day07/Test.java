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
		System.out.println("����1����");
	}
	public void move(){
		System.out.println("ת�����1");
	}
}

class WarShip extends Weapon{
	public void attack(){
		System.out.println("����2����");
	}
	public void move(){
		System.out.println("ת�����2");
	}
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("����3����");
	}
	public void move(){
		System.out.println("ת�����3");
	}
}

class Army{
	Weapon[] w;
	int max;
	int j=0;
	Army(int max){
		this.max=max;
		w=new Weapon[max];//��max����ʼ������w
	}
	public void addWeapon(Weapon wa){
		if(j<w.length){
			w[j]=wa;
			System.out.println("�����������"+(j+1)+"������");
			j++;
		};//������һ���������뵽������
	}
	public void attackAll(){//�������������� ���ǽ��������һ��
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
	
	
	
	
	
	
	
	
 
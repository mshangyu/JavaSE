import weapon.Weapon;
import weapons.Army;
import weapons.Flighter;
import weapons.Tank;
import weapons.WarShip;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a=new Army(2);
		
		//Tank D = new Tank();
		//a.addWeapon(D);
		
		
		//Flighter f=new Flighter();
		//a.addWeapon(f);
		
		//WarShip h=new WarShip();
		//a.addWeapon(h);
		
	//	a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		
		a.attackAll();
		a.moveAll();
		
		
		//Tank tank=new Tank();
		//tank.move();
		//tank.attack();
		
		Army army=new Army(4);
		
		Weapon weapon1=new Tank();
		army.addWeapon(new Tank());
		army.addWeapon(new Flighter());
		army.addWeapon(new WarShip());
		army.addWeapon(weapon1);
		
	}


}
package weapons;

import weapon.Weapon;

public class Army {
	Weapon[] w;
	int index=0;
	public Army(int number) {
		super();
		this.w =new Weapon[number];
	}
	
	public void addWeapon(Weapon wa){
		w[index++]=wa;
	}
	public void attackAll(){
		//for(int i=0;i<w.length;i++){
			//w[i].attack();
		//}
		//用foreach来实现for循环
		for(Weapon weapon:w){
			weapon.attack();
		}
		
		
	}
	public void moveAll(){
		//for(int i=0;i<w.length;i++){
		//	w[i].move();
		//}
		for(Weapon weapon:w){
			weapon.move();
		}
	}
}

public class Test{
	public static void main(String[] args){
		Shape s=new Circle("��ɫ",3.0);
		s.setColor("��ɫ");
		//Circle f=(Circle)s;
		//f.setSides(3.0,4.0,5.0);
		
		
		//f.setRaidus(3.0);
		System.out.println("�ܳ���"+s. calPerimeter());
		System.out.println(s.getType());
			
		Shape d=new Triangle("��ɫ",6.0,8.0,10.0);
		System.out.println("�ܳ���"+d. calPerimeter());
		System.out.println(d.getType());
		
		

	}
}
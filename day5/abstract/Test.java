public class Test{
	public static void main(String[] args){
		Shape s=new Circle("红色",3.0);
		s.setColor("黄色");
		//Circle f=(Circle)s;
		//f.setSides(3.0,4.0,5.0);
		
		
		//f.setRaidus(3.0);
		System.out.println("周长是"+s. calPerimeter());
		System.out.println(s.getType());
			
		Shape d=new Triangle("黄色",6.0,8.0,10.0);
		System.out.println("周长是"+d. calPerimeter());
		System.out.println(d.getType());
		
		

	}
}
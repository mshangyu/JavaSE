
//Override ==重写==覆盖==复写==重载
public class OverrideTest{
	
	 static int add(int x,int y){   //由于下面定义了static 所以这里需要在前面加上static 
			return x+y;
	}

	static int add(int x,int y, int z){
		return x+y+z;
	}
	
	static double add(double x, double y){
		return x+y;
	}
	public static void main(String[] args){
		System.out.println(add(12,34));
		System.out.println(add(12,23,33));
		System.out.println(add(12.1,12.3));
	}
}

/*
静态static不能访问非静态的 

*/
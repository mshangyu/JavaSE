
public class MathDemo {
	public static void main(String[] args) {
	
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-12));

		System.out.println(Math.ceil(12.12));
		
		System.out.println(Math.floor(-12.23));
		
		System.out.println(Math.round(12.123f));
		
		System.out.println(Math.max(12, 54));
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.sqrt(16));
		
		for(int x=0;x<10;x++){
			System.out.println(Math.random());
		}
		System.out.println((int)(Math.random()*100)+1);
	}

}
//面试题：自己写一个功能，实现对一个float类型的数据进行四舍五入
//原理：加上1/2
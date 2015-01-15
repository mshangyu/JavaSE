package java50道练习题;
/**
 * 【程序13】   
 * 题目：一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，
 * 请问该数是多少？   
 */
public class java13完全平方数 {
	public static void main(String[] args) {
		for(double i=-100;i<100000;i++){
			//如果这个数的开方%1=0，说明这个数的开方是个整数
			if(Math.sqrt(i+100)%1==0){
				if(Math.sqrt(i+268)%1==0){
					System.out.println((int)i);
				}
			}
		}

	}

}

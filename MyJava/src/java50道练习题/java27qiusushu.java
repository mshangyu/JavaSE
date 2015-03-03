package java50道练习题;

public class java27qiusushu {
	/**
	 * 【程序27】   题目：求100之内的素数   
	 * //使用除sqrt(n)的方法求出的素数不包括2和3
	 */

	public static void main(String[] args) {
		System.out.println("100以内的素数有2、3");
		for (int i = 4; i < 101; i++) {
			boolean b=true;
			for (int j = 2; j <=Math.sqrt(i); j++) {
				if (i%j==0) {
					b=false;
					break;
				}
			}
			if (b) {
				System.out.println(i);
			}
			
		}
		
	}

}

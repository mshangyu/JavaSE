package java50道练习题;
/**   
 * 题目：一个数如果恰好等于它的因子之和，
 * 这个数就称为 "完数 "。例如6=1＋2＋3.编程    
 * 找出1000以内的所有完数。   
 */
public class java9完数例题 {
	public static void main(String[] args) {
		
		for(int i=6;i<1000;i++)
			int h=0;
			for (int j = 0; j <= i; j++) {
				if (i%j==0) {
					h=h+j;
					if (h==i) {
						System.out.println(i);
					}
				}
			}
	}

}

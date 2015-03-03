package java50道练习题;
/**
 * 题目：一球从100米高度自由落下， 每次落地后反跳回原高度的一半；再落下，求它在    
 * 第10次落地时，共经过多少米？第10次反弹多高？
 * s=299.609375
	h=0.09765625
 */
public class java10球反弹 {
	public static void main(String[] args) {
		double h=100;
		double s=0;
		for (int i = 0; i <= 10; i++) {
			if (i==1) {
				s=100;
				System.out.println(s);
			}else {
				s=s+h*2;
				System.out.println(s);
			}
			h=h/2;
			System.out.println(h);
		}

	}

}

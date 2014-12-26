/*
 * 判断是不是素数，101到200之间的素数的个数，并输出所有的素数
 * 方法：用一个数  去除2到这个数 如果可以被整除 就表明不是素数
 * 素数 ：只能被自身和2整除的数
 * */
package java50道练习题;

public class Java2求素数 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 101; i < 200; i++) {
			boolean b = true;// 标记
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b) {// 通过判断能不能被除了自身外还有其他的数整除 来确定是不是素数

				System.out.println("质数是：" + i);
				count++;
			}
		}
		
		System.out.println("次数是："+count);

	}

}

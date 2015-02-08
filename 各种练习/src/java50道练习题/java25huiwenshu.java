package java50道练习题;

import java.util.Scanner;

public class java25huiwenshu {
//【程序25】   
//	题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。  

	public static void main(String[] args) {
		// 輸入一個數，這次我們取long形
				Scanner s = new Scanner(System.in);
				System.out.println("請輸入一個數");
				long n = s.nextLong();

				// 將long轉換為String
				String ss = n + "";

				// 將String轉換為數組c
				char c[] = ss.toCharArray();
				// 進行判斷
				boolean b = false;
				for (int i = 0; i <= c.length / 2; i++) {
					if (c[i] == c[c.length - 1 - i]) {
						b = true;
					} else {
						b = false;
						break;
					}

				}

				if (b == true) {
					System.out.println(n + "是回文");
				} else {
					System.out.println(n + "不是回文");
				}

			

	}

}

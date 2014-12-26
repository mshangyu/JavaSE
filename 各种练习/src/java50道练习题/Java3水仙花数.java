/*题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
 * 因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * */
package java50道练习题;

public class Java3水仙花数 {
	public static void main(String[] args) {
		for(int x=101;x<10000;x++){
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			if (x==ge*ge*ge+shi*shi*shi+bai*bai*bai) {
				System.out.println(x);
			}
		}

	}

}

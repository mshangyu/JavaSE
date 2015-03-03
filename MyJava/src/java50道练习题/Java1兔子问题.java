/*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？   
 * 
 * */
package java50道练习题;

public class Java1兔子问题 {
	public static void main(String[] args) {
		int[] a=new int[24];
		a[0]=0;
		a[1]=1;
		a[2]=1;
		for(int i=3;i<24;i++){
			a[i]=a[i-1]+a[i-2];
			System.out.println("第"+i+"个月的兔子数量是："+a[i]);
		}
	}

}

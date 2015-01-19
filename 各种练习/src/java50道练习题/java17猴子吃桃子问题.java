package java50道练习题;
/**
 * 【程序17】   
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，
 * 当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。   
 */
public class java17猴子吃桃子问题 {
	public static void main(String[] args) {
		int a[]=new int[10];
		a[9]=1;
		
		for(int i=9;i>0;i--){
			a[i-1]=(a[i]+1)*2+1;
			if(i==1){
				System.out.println("第一天共摘了"+a[0]+"个");
			}
		}
		int i=1;
		
		//for(int aa:a){System.out.println("第"+i+++"天有"+aa+"个");}
		
		
	}

}

package java50道练习题;

public class java21前20个和 {

	/**
	 * @【程序21】   
	 * 题目：求1+2!+3!+...+20!的和   
	 */
	public static void main(String[] args) {
		int sum=0;
		for(int j=1;j<=20;j++){
			int s=1;
			for(int i=1;i<=j;i++){
				s=s*i;
			}
		}
		sum=sum+sum;
	}
	
}

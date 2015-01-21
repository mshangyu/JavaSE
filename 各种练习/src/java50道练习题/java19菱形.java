package java50道练习题;

public class java19菱形 {

	/**
	 * * 【程序19】   题目：打印出如下图案（菱形）      
	 *      *     
	 *     ***  
	 *    *****
	 *   *******  
	 *    *****   
	 *     ***  
	 *      *   
	 *
	 */
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			for(int k=3;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>0;i--){
			for(int k=3-i;k>=0;k--){
				System.out.print(" ");
			}
			for(int j=2*i-1;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

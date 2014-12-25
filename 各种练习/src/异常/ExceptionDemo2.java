/*多个异常如何处理？
 * 针对每一个异常编写一个处理代码
 * 
 * */
package 异常;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		//ArithmeticException
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能是0");
		}
		
		
		int[] arr={1,2,3};
		
		//ArrayIndexOutOfBoundsException
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}
		
		
		
		System.out.println("over");
	}

}

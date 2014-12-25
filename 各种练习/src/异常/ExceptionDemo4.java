/*注意：1、 在处理异常的时候 catch里面不能空着 否则 你就是把异常给隐藏掉了
 * 2、catch时候 如果你知道异常的名称 就写出明确的值
 * 
 * 几个常见方法：  public String getMessage():返回消息字符串
 * 			  public String toString(): 返回的异常的描述
 * 			           类名：getLocalizedMessage（）组成
 * 				 默认情况下，如果子类中没有重写getLocalizedMessage（），那么，就会返回和getMessage一样的内容
 * 			  public voidprintStackTrace（）：把异常的信息输出到控制台
 * */
package 异常;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		
		try{
			System.out.println(a/b);//一旦这里出了 问题 就会自动生成一个异常对象
									//ArithmeticException(/ by zero)
		}catch(ArithmeticException e){
			//  public String getMessage():返回消息字符串
			//System.out.println(e.getMessage());
			//System.out.println("这里是经过异常处理的");
			
			// public String toString(): 返回的异常的描述
			//System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			//public voidprintStackTrace（）：把异常的信息输出到控制台
			e.printStackTrace();
		}
		System.out.println("over");

	}

}

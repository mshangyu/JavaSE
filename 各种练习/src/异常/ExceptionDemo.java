package 异常;
/*jvm的默认处理方式：
 *   把异常的类名 异常的错误原因以及异常出现的位置等信息在控制台输出给你 以便我们可以通过这个问题来解决
 *   只要出现了问题 程序到此为止  不再往下执行
 * jvm的默认处理方案： 哪里有异常 哪里停下来
 * 我们应该手动的处理这种异常
 * 怎么处理呢？ 标准处理方案： try{
 * 							可能出问题的代码；
 * 						}catch(异常类名 变量名){ //用于捕获一个异常对象
 * 
 * 						}finally{
 * 							释放资源（io或者数据库的操作中）
 * 						}
 * 讲解的变形的格式：
 * 				 try{
 * 						可能出问题的代码；
 * 				  }catch(异常类名 变量名){ //用于捕获一个异常对象
 * 
 * 				  }
 * 
 * */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;
		
		//ArithmeticException 数学计算异常 出书不能为0
		//b=0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("这里是经过异常处理的");
		}
		System.out.println("over");
	}
}

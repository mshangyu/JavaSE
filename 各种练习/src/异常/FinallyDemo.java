/*finally是异常处理的一部分 它里面的代码永远会被执行
 *一般用于释放资源
 * 
 * */
package 异常;

public class FinallyDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		try {
			b=0;
			System.out.println(a/b);
			//IO数据库
			//打开文件
			//读写文件
			//关闭文件
			
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.exit(0);
		}finally{
			System.out.println("haha");
		}

	}

}

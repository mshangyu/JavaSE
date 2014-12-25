/*在catch里面有一个return语句 请问finally里面的代码还会执行吗？如果会，请问是在return前还是在return后面呢？
 * 前  
 * 其实，准确的说 应该是在return中间执行的
 * */
package 异常;

public class FinallyDemo2 {
	public static void main(String[] args) {
		//show();
		System.out.println(getInt());
	}

	public static int getInt(){
		int a=10;
		try {
			a=20;
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			a=30;
			return a;
			//执行return a，其实就是执行return 30 这样在内存中就形成了一个返回路径
			//但是又发现了finally 所以 就跑到 finally 里面去执行了一下。a=40
			//最后，再次返回到内存中的执行路径 return30
		}finally{
			a=40;
			//如果这里有一条执行路径，那么就从这里返回了
			return a;
		}
		//return a;
	}
	
//	public static void show() {
//		try {
//			System.out.println("AAAA");
//			System.out.println(10 / 0);
//			System.out.println("BBBBBB");
//		} catch (ArithmeticException e) {
//			System.out.println("CCCC");
//			return;
//		} finally {
//			System.out.println("DDDD");
//		}
//	}
}
/*每一个异常部分 都写一个try catch 是比较麻烦的
 * 假设： 这多个问题 我们就想出现一个就不让在继续走下一个有问题的地方
 * 怎么解决呢？ 把多个有问题的代码用一个try处理即可
 * 异常处理变形： try{
 * 
 * 			}catch(){
 * 
 * 			}catch(){
 * 
 * 			}
 * 注意： A 执行流程：
 * try里面的代码是依次执行的
 *  一旦遇到有问题的代码 就从这里和catch进行匹配
 *  一旦有一个和catch匹配成功 其他的catch就不在执行了
 *  
 *  B 多个catch的时候 异常的关系
 *    如果是平级关系 谁前谁后无所谓取决于代码的执行流程
 *    如果有子父关系 父必须在最后
 *    
 *  C  针对多个catch 的情况 讲解一个jdk7的新特性：
 *  	catch（异常1|异常2|异常3|... e）{}
 *  	注意 这个异常必须是平级关系 不能是子父关系
 * */
package 异常;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		int[] arr = { 1, 2, 3 };
		// 第一种情况
		// try {
		// System.out.println(arr[3]);
		// System.out.println(a / b);
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("数组越界异常");
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能是0");
		// }
		//
		// System.out.println("over");

		// 第二种情况
		// try {
		// System.out.println(arr[3]);
		// System.out.println(a / b);
		// // 代码还有一大堆 还可能有问题 但是我不太明确是什么问题 肿么办？
		// // 这里用exception解决
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("数组越界异常");
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能是0");
		// } catch (Exception e) {
		// System.out.println("程序出现了问题");
		// }
		//
		// System.out.println("over");

		// 第三种情况
		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// 代码还有一大堆 还可能有问题 但是我不太明确是什么问题 肿么办？
			// 这里用exception解决
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("程序出现了问题");
		}
		System.out.println("over");
	}

}

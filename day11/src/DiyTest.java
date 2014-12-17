
/*throws用在方法上，
 throw用在方法内，


*/


/*异常处理：             自动抛出
1、 runtime异常：程序员--抛出   vs JVM--自动处理
 2、checked异常：程序员--抛出  vs 程序员---手动处理
 
 checked异常处理：
 1、程序员手动处理异常之一：throws
 2、程序员手动异常处理之二：try catch finally 

程序员考虑：
1、什么时候会发生异常？
2、发生异常之后。判断发生的是什么异常  ---runtime checked
3、异常怎么处理。 根据异常类型，来考虑异常怎么处理？
	a、runtime   JVM
	b、checked：    when？什么时候去使用                                                               how？怎么去使用                                                                                                   ---某个上级解决了----终结
				---？throws====不知道如何解决的情况下        1、 函数签名：throws+checked异常类名  ----抛给调用者---调用者处理？--上级都解决不了--jvm
				---？try catch==知道怎么解决                        2、可以throws声明多个异常，提示调用者你看我出现了这些异常 ，你帮我处理
4、catch(){}  -----?
*/

//自定义checked异常：继承
class FuIndexException extends Exception{
	public FuIndexException(){}
	public FuIndexException(String message){
		super(message);
	}
	@Override
	public String toString() {             //tostring()方法也是可以复写的
		//String message=getLocalizedMessage();
		return "程序员catch处理："+this.getMessage();
	}
	
}

class Demo{
/*
	                   判断异常----------------抛出异常--------------处理异常 
runtime			              代码								jvm
checked   ================程序员处理===================
分离
 */
	
	public void run(int[] arr,int index) throws FuIndexException{
		if(arr==null){
			throw new NullPointerException("JVM：空指针异常");
		}
		if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("JVM:index大于了数组的长度");
		}else if(index<0){
			throw new FuIndexException("程序员处理：index负数");
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class DiyTest {
	public static void main(String[] args) {
		int[] array=new int[5];
		
		Demo demo=new Demo();
		//array[-12]=123;
		
		try {
			//demo.run(array,-123);
			demo.run(array, 1232);//？从哪里看抛出了什么异常
		
	
		//}catch(Exception e){     //所有的错误都包含了
		//	System.out.println(e);
		}catch (FuIndexException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString());
			System.out.println(fu.toString()+"\n"+fu.getMessage());
		}catch(NullPointerException e){
			System.out.println("进入catch语句");
			System.out.println(e);
			e.printStackTrace();
			//return;//即使有return语句依然会执行finally语句
			//System.exit(e);  //这里程序会终止掉 不会执行finally了
		}catch(Exception e){    //所有的错误都包含了（如果子类没有捕获到，父类这里会捕获到的）      //catch顺序  先catch子类 后  catch父类
			
			System.out.println(e);
		}finally{//必须执行的操作；
			System.out.println("finally");
			
		}
		System.out.println("========end========");
	}
}

import java.beans.Introspector;
/*自定义异常类：必须继承ecxeption异常，可抛性==抛给它的调用者，==throw throws关键字抛出
 实现了逻辑处理和异常处理的分离
 异常类不能访问成员变量和方法*/


class FuException extends Exception{
	public FuException(){
	}
	
	public FuException(String message) {
		super(message);//调用了父类的构造函数 进行了传参
	
	}
	
}
//演示抛出异常的流程
class Test extends {
	void run(int[] arr,int index)  {
		//自动抛出异常 jvm--new--throw--main---jvm--控制台
//		System.out.println(arr[index]);//throw newArrayIndexOutBoundsException()
//		
		//手动抛出异常
		if(arr==null){
			//异常对象 new+构造
			//throw new NullPointerException();
			throws new NullPointerException("空指针异常");
		}
		
		if(index<0){
			//throw new ArrayIndexOutOfBoundsException("下标负");  //手动抛出异常
			//手动抛出：自定义异常
			//强转不行throw (RuntimeException)new FuException("自定义的负下标异常");//抛出--jvm处理[runtime]
			//RuntimeException fuException=new FuException("自定义--负下标异常");
			throw new FuException("自定义异常");
			
		}else if(index>=arr.length){
			//throw new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException("index>=数组长度"+arr.length);
		}else{
			System.out.println(arr[index]);
		}
	}
	
} 

public class ExcepionDemo {
	/**
	 * @param args
	 * @throws FuException 
	 */
	public static void main(String[] args) throws FuException {
		//1、在main函数中直接非法  操作数组
		int[] arr=new int[5];
		//arr[5]=1232;//数组越界
		int[] array=null;
		//array[0]=12;
		
		System.out.println("========end=====");
		
		//2、调用成员方法，在成员方法中非法操作数组
		run(arr, 6);
		
		//3、其他类的成员方法中非法操作
		Test test=new Test();
		//test.run(arr,-5); //常识性
		test.run(arr,5);
		//test.run(arr,1);
		System.out.println("========end=====");
	}
	
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);
		System.out.println("========end=====");
	}
	
	
	
	

}

import java.beans.Introspector;


//演示抛出异常的流程
class Test{
	void run(int[] arr,int index){
		//自动抛出异常 jvm--new--throws
		System.out.println(arr[index]);//throw newArrayIndexOutBoundsException()

		if(index<0){
			throw new ArrayIndexOutOfBoundsException("下标负");
		}else if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("index>=数组长度"+arr.length);
		}else if(arr==null){
			throw new ArrayIndexOutOfBoundsException("空指针异常");
		}else{
			System.out.println(arr[index]);
		}
	}
	
} 

public class ExcepionDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr=new int[5];
		//arr[5]=1232;//数组越界
		int[] array=null;
		//array[0]=12;
		
		System.out.println("========end=====");
		
		Test test=new Test();
		test.run(arr,-5);
		//test.run(arr,5);
		//test.run(arr,-5);
		//test.run(arr,1);
	}

}

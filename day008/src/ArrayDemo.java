import org.omg.CORBA.PUBLIC_MEMBER;

//如果想一个类不再被外界创建对象，那么，就需要把该类的构造方法给私有
public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr={11,44,55,22,33};
		
		//遍历这个数组
		ArrayTools at=new ArrayTools();
		at.printArray(arr);
	
		
		//不想创建对象使用  怎么办呢？
		ArrayTools.printArray(arr);
	}

}

class ArrayTools{
	
	//private ArrayTools{}
	
	public static void printArray(int[] arr){
		System.out.print("[");
		
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
		
		System.out.print("]");
		
//	public static int getIndex(int[] arr, int value){
//		intdex=-1;//如果没有找到指定索引 就返回-1
//		for(intdex x=0;x<arr.length;x++){
//			if(arr[x]==value){
//				index=x;
//				break;
//			}
//		}
//		return index;
		
	}
		
		
	
}



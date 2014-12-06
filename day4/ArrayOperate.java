/**
文档注释 文档标识符
*/


/**
此类是对数组取最值 排序等操作的
@author 张三 
@version 1.0
*/
public class ArrayOperate{
	 private ArrayOperate(){
	 
		}//将这个函数私有化了  则其他类无法调用 在N里面new一个对象则无法使用这个类
	
	/**取int数组里的最大值
	@param arr 传入一个int数组
	@return返回一个int数值
	*/
	public static int max(int[] arr){  //求最大值
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
	/**取int数组里的最小值
	@param arr 传入一个int数组
	@return返回一个int数值
	*/
	public static int min(int[] arr){//求最小值
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max){
				max=arr[i];
			}
		}
		return max;
	}
	
	/**对int数组进行冒泡排序
	@param arr 传入一个int数组
	*/
	public static void maoSort(int[] arr){//冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				replace(arr,j,j+1);
			}
		}
	}
	
	/**对传入int数组里面进行选择排序
	@param arr 传入一个int数组
	*/
	public static void xuanzeSort(int[] arr){  //选择排序
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				replace(arr,i,j);//传一个数组  ij分别为下标
			}
		}
	}
	
	private static void replace(int[] arr,int a,int b){ //replace 为一个方法供上面两个调用
		if(arr[a]>arr[b]){
			int t=arr[a];
			arr[a]=arr[b];
			arr[b]=t;
		
		}
	}
	

	
}
public class N{
	public static void main(String[] args){
		int[] arr={232,43,535,343,23,43,3,4};
		int[] arr1={34,43,232,34233};
		//N a=new N();
		ArrayOperate A=new ArrayOperate();
		//System.out.println(A.max(arr));//这两个函数在一个类中 所以不用写类名 直接写函数名就可以调用了
		System.out.println(ArrayOperate.max(arr));//不通过new一个对象也可以直接访问
	}
	
	
	
	/*public static int max(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	*/

}
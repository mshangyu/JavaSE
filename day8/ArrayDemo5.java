import javax.swing.text.ChangedCharSetException;

/*需求：请写一个功能实现交换数组中的位置
 第一个和最后一个交换
 第二个和倒数第二个交换*/

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] arr={1,2,34,45,56};
		change(arr);
	}
	public static void change(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp=start;
			arr[start]=arr[end];
			arr[end]=temp;
		}
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
	
	

}

import javax.swing.text.ChangedCharSetException;

/*������дһ������ʵ�ֽ��������е�λ��
 ��һ�������һ������
 �ڶ����͵����ڶ�������*/

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] arr={1,2,36,45};
		change(arr);
	}
	public static void change(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
	
	

}
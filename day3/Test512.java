import java.util.*;
public class Test511{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr={2,3,5.7.9};
		System.out.println("请输入你要插入的值");
		int num=in.nextInt();
		arr[arr.length-1]=num;//相当于在这个数组最后面插入一个数 下表等于长度减一
		for(int i=arr.length-1;i>o;i--){
			if(arr[i]<arr[i-1]){
			
				int t=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=t;
			}else{
				break;
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);//整个结果从下标0开始输出
			}
		
		}
	}
}	
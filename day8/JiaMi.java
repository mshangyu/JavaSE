import java.util.Arrays;


public class JiaMi {
	public static void main(String[] args) {
		int number=123456;
		
		if(number<0||number>99999999){
			System.out.println("数据有误");
			return;
		}
		
		int[] arr=new int[8];   //这个数组长度为8  
		int index=0;
		
		while(number>0){    //将这个数组倒叙输出
			arr[index]=number%10;
			number/=10;
			index++;
		}
		
//		Arrays.sort(arr);
//		for(int i=7;i>=0;i--){
//			System.out.println(arr[i]);
//		}
		
		for(int x=0;x<index;x++){
			System.out.println(arr[x]);//当倒叙之后  在将这个数组遍历一次 输出
		}
		System.out.println();
		
		int x=arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=x;

		for(int x1=0;x1<index;x1++){
			System.out.println(arr[x1]);
		}
		System.out.println();
	}

}
  
import java.util.Arrays;


public class JiaMi {
	public static void main(String[] args) {
		int number=123456;
		
		if(number<0||number>99999999){
			System.out.println("��������");
			return;
		}
		
		int[] arr=new int[8];   //������鳤��Ϊ8  
		int index=0;
		
		while(number>0){    //��������鵹�����
			arr[index]=number%10;
			number/=10;
			index++;
		}
		
//		Arrays.sort(arr);
//		for(int i=7;i>=0;i--){
//			System.out.println(arr[i]);
//		}
		
		for(int x=0;x<index;x++){
			System.out.println(arr[x]);//������֮��  �ڽ�����������һ�� ���
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
  
import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


public class ArrMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,34,435,6577,7657,78};
		//��һ��������
		int max=arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		System.out.println(max);
		
		
		
		int min=arr[0];
		for(int i=1;i<arr.length;i--){
			min=arr[i];
		}
		
	}

}
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import sun.reflect.generics.tree.VoidDescriptor;


public class ArrayMin {
	public static void main(String[] args) {
		int[] arr={12,12,313,3,4,44};
		printArray(arr);
		System.out.println("...........");
		
		//int min=getMin(arr);
		//System.out.println(min);
		
		System.out.println(getMin(arr));
	}
	
	
	public static void printArray(int[] a){
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
	}
	
	public static int getMin(int[] arr1){
		int min=arr1[0];
		for(int x=1;x<arr1.length;x++){
			if(arr1[x]<min){
				min=arr1[x];
			}
		}
		return min;
	}
}

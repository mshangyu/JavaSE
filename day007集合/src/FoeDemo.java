import java.util.ArrayList;


public class FoeDemo {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};

		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		
		for(int x:arr){
			System.out.println(x);
		}
		
		String[] str={"hello","world","java"};
		for(String ss:str){
			System.out.println(ss);
		}
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for(String dd:array){
			System.out.println(dd);
		}
	}

}

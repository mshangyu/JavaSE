class ArrayDemo{
	public static void main(String[] args){
		int[] arr=new int[3];
		System.out.println(arr);
		System.out.println(arr[2]);
		
		//需求：创建一个有三个int类型元素的数组
//注意数组的元素的（编号）索引的最大值是数组的长度减1
		int[] arr1=new int[3];
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		int[] arr2=new int[]{1,2,3,4};
		for(int x=0;x<4;x++){
			System.out.println(arr2[x]);
		}
		
		int[] arr3={1,2,3,4};
		for(int x=0;x<4;x++){
			System.out.println(arr3[x]);
		}
		
		
		
	}
}
class ArrayDemo{
	public static void main(String[] args){
		int[] arr=new int[3];
		System.out.println(arr);
		System.out.println(arr[2]);
		
		//���󣺴���һ��������int����Ԫ�ص�����
//ע�������Ԫ�صģ���ţ����������ֵ������ĳ��ȼ�1
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
public class N{
	public static void main(String[] args){
		int[] arr={232,43,535,343,23,43,3,4};
		int[] arr1={34,43,232,34233};
		//N a=new N();
		ArrayOperate A=new ArrayOperate();
		//System.out.println(A.max(arr));//������������һ������ ���Բ���д���� ֱ��д�������Ϳ��Ե�����
		System.out.println(ArrayOperate.max(arr));//��ͨ��newһ������Ҳ����ֱ�ӷ���
	}
	
	
	
	/*public static int max(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	*/

}
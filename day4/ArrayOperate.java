/**
�ĵ�ע�� �ĵ���ʶ��
*/


/**
�����Ƕ�����ȡ��ֵ ����Ȳ�����
@author ���� 
@version 1.0
*/
public class ArrayOperate{
	 private ArrayOperate(){
	 
		}//���������˽�л���  ���������޷����� ��N����newһ���������޷�ʹ�������
	
	/**ȡint����������ֵ
	@param arr ����һ��int����
	@return����һ��int��ֵ
	*/
	public static int max(int[] arr){  //�����ֵ
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
	/**ȡint���������Сֵ
	@param arr ����һ��int����
	@return����һ��int��ֵ
	*/
	public static int min(int[] arr){//����Сֵ
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max){
				max=arr[i];
			}
		}
		return max;
	}
	
	/**��int�������ð������
	@param arr ����һ��int����
	*/
	public static void maoSort(int[] arr){//ð������
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				replace(arr,j,j+1);
			}
		}
	}
	
	/**�Դ���int�����������ѡ������
	@param arr ����һ��int����
	*/
	public static void xuanzeSort(int[] arr){  //ѡ������
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				replace(arr,i,j);//��һ������  ij�ֱ�Ϊ�±�
			}
		}
	}
	
	private static void replace(int[] arr,int a,int b){ //replace Ϊһ��������������������
		if(arr[a]>arr[b]){
			int t=arr[a];
			arr[a]=arr[b];
			arr[b]=t;
		
		}
	}
	

	
}
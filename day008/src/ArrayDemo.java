import org.omg.CORBA.PUBLIC_MEMBER;

//�����һ���಻�ٱ���紴��������ô������Ҫ�Ѹ���Ĺ��췽����˽��
public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr={11,44,55,22,33};
		
		//�����������
		ArrayTools at=new ArrayTools();
		at.printArray(arr);
	
		
		//���봴������ʹ��  ��ô���أ�
		ArrayTools.printArray(arr);
	}

}

class ArrayTools{
	
	//private ArrayTools{}
	
	public static void printArray(int[] arr){
		System.out.print("[");
		
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.print(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
		
		System.out.print("]");
		
//	public static int getIndex(int[] arr, int value){
//		intdex=-1;//���û���ҵ�ָ������ �ͷ���-1
//		for(intdex x=0;x<arr.length;x++){
//			if(arr[x]==value){
//				index=x;
//				break;
//			}
//		}
//		return index;
		
	}
		
		
	
}


import java.beans.Introspector;
/*�Զ����쳣�ࣺ����̳�ecxeption�쳣��������==�׸����ĵ����ߣ�==throw throws�ؼ����׳�
 ʵ�����߼��������쳣�����ķ���
 �쳣�಻�ܷ��ʳ�Ա�����ͷ���*/


class FuException extends Exception{
	public FuException(){
	}
	
	public FuException(String message) {
		super(message);//�����˸���Ĺ��캯�� �����˴���
	
	}
	
}
//��ʾ�׳��쳣������
class Test extends {
	void run(int[] arr,int index)  {
		//�Զ��׳��쳣 jvm--new--throw--main---jvm--����̨
//		System.out.println(arr[index]);//throw newArrayIndexOutBoundsException()
//		
		//�ֶ��׳��쳣
		if(arr==null){
			//�쳣���� new+����
			//throw new NullPointerException();
			throws new NullPointerException("��ָ���쳣");
		}
		
		if(index<0){
			//throw new ArrayIndexOutOfBoundsException("�±긺");  //�ֶ��׳��쳣
			//�ֶ��׳����Զ����쳣
			//ǿת����throw (RuntimeException)new FuException("�Զ���ĸ��±��쳣");//�׳�--jvm����[runtime]
			//RuntimeException fuException=new FuException("�Զ���--���±��쳣");
			throw new FuException("�Զ����쳣");
			
		}else if(index>=arr.length){
			//throw new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException("index>=���鳤��"+arr.length);
		}else{
			System.out.println(arr[index]);
		}
	}
	
} 

public class ExcepionDemo {
	/**
	 * @param args
	 * @throws FuException 
	 */
	public static void main(String[] args) throws FuException {
		//1����main������ֱ�ӷǷ�  ��������
		int[] arr=new int[5];
		//arr[5]=1232;//����Խ��
		int[] array=null;
		//array[0]=12;
		
		System.out.println("========end=====");
		
		//2�����ó�Ա�������ڳ�Ա�����зǷ���������
		run(arr, 6);
		
		//3��������ĳ�Ա�����зǷ�����
		Test test=new Test();
		//test.run(arr,-5); //��ʶ��
		test.run(arr,5);
		//test.run(arr,1);
		System.out.println("========end=====");
	}
	
	public static void run(int[] arr,int index){
		System.out.println(arr[index]);
		System.out.println("========end=====");
	}
	
	
	
	

}
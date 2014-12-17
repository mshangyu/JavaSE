
/*throws���ڷ����ϣ�
 throw���ڷ����ڣ�


*/


/*�쳣����             �Զ��׳�
1�� runtime�쳣������Ա--�׳�   vs JVM--�Զ�����
 2��checked�쳣������Ա--�׳�  vs ����Ա---�ֶ�����
 
 checked�쳣����
 1������Ա�ֶ������쳣֮һ��throws
 2������Ա�ֶ��쳣����֮����try catch finally 

����Ա���ǣ�
1��ʲôʱ��ᷢ���쳣��
2�������쳣֮���жϷ�������ʲô�쳣  ---runtime checked
3���쳣��ô���� �����쳣���ͣ��������쳣��ô����
	a��runtime   JVM
	b��checked��    when��ʲôʱ��ȥʹ��                                                               how����ôȥʹ��                                                                                                   ---ĳ���ϼ������----�ս�
				---��throws====��֪����ν���������        1�� ����ǩ����throws+checked�쳣����  ----�׸�������---�����ߴ���--�ϼ����������--jvm
				---��try catch==֪����ô���                        2������throws��������쳣����ʾ�������㿴�ҳ�������Щ�쳣 ������Ҵ���
4��catch(){}  -----?
*/

//�Զ���checked�쳣���̳�
class FuIndexException extends Exception{
	public FuIndexException(){}
	public FuIndexException(String message){
		super(message);
	}
	@Override
	public String toString() {             //tostring()����Ҳ�ǿ��Ը�д��
		//String message=getLocalizedMessage();
		return "����Աcatch����"+this.getMessage();
	}
	
}

class Demo{
/*
	                   �ж��쳣----------------�׳��쳣--------------�����쳣 
runtime			              ����								jvm
checked   ================����Ա����===================
����
 */
	
	public void run(int[] arr,int index) throws FuIndexException{
		if(arr==null){
			throw new NullPointerException("JVM����ָ���쳣");
		}
		if(index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("JVM:index����������ĳ���");
		}else if(index<0){
			throw new FuIndexException("����Ա����index����");
		}else{
			System.out.println(arr[index]);
		}
	}
}

public class DiyTest {
	public static void main(String[] args) {
		int[] array=new int[5];
		
		Demo demo=new Demo();
		//array[-12]=123;
		
		try {
			//demo.run(array,-123);
			demo.run(array, 1232);//�������￴�׳���ʲô�쳣
		
	
		//}catch(Exception e){     //���еĴ��󶼰�����
		//	System.out.println(e);
		}catch (FuIndexException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString());
			System.out.println(fu.toString()+"\n"+fu.getMessage());
		}catch(NullPointerException e){
			System.out.println("����catch���");
			System.out.println(e);
			e.printStackTrace();
			//return;//��ʹ��return�����Ȼ��ִ��finally���
			//System.exit(e);  //����������ֹ�� ����ִ��finally��
		}catch(Exception e){    //���еĴ��󶼰����ˣ��������û�в��񵽣���������Ჶ�񵽵ģ�      //catch˳��  ��catch���� ��  catch����
			
			System.out.println(e);
		}finally{//����ִ�еĲ�����
			System.out.println("finally");
			
		}
		System.out.println("========end========");
	}
}

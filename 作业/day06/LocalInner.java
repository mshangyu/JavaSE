class Outer{
	int a=123;
	private String str="geminno";
	
	void run(){    //�������������ֲ�����
		String local_var="�ֲ�����";
		final int num=1111;
		//�ֲ��ڲ���
		//private class Inner{ ��ֲ�����һ�� �����з���˵����
		//static class Inner{  �಻��ʹ��static
		class Inner{                                  //��ǰ����� ��ָrun�������
			int aaa=888;
			String str="inner class";//���ⲿ���еĳ�Ա����ͬ��
			//static String var="static var";      //���ܶ��徲̬����    
			static final String s="java";  //�ھֲ��ڲ����в���ʹ��static����
			
			void inner_run(){
				//System.out.println("�ڲ��ࣺ��Ա����"+local_var);//���ܷ��ʾֲ�����local-var �ֲ�����
				System.out.println("�ڲ��ࣺ��Ա����");
				System.out.println(a+"\t"+str);//�ܹ������ⲿ��Ա
				System.out.println(Outer.this.str);//���ʵ����ⲿ��
			}
		}
		Inner in=new Inner();
		in.inner_run();
	}//�ֲ��ڲ�������÷�Χ��run��������
}
public class LocalInner{   //��������
	public static void main(String[] args){
		Outer out=new Outer();
		out.run();
	}
}
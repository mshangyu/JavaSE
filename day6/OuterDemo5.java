

class Outer{
	public void method(){  //�ڷ����ڲ� ����һ���ڲ��� ��ʱ�Ǿֲ��ڲ���
		final int num=100;  //�ֲ�����
		
		class Inner{
			public void show(){
				System.out.println("show"+num);
			}
		}
		
		Inner i=new Inner();
		i.show();
	}

}










public class OuterDemo5{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	}
}
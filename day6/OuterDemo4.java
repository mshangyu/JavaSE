/*���һ���ڲ����Ǿ�̬�ģ�������Ҫ��ֱ�ӷ��ʣ�
���ʱ�򣬴�������ĸ�ʽ�Ϳ�ʼ�ĸ�ʽ��һ��
�ⲿ����.�ڲ����� ����=new �ⲿ����.�ڲ���������;
*/


class Outer{
	static class Inner{
		public void show(){
			System.out.println("show");
		}
		public static void show2(){
			System.out.println("show2");
		}
	}
	
	public void method(){
		Inner i=new Inner();
		i.show();
		i.show2();
	}

}




public class OuterDemo3{
	public static void main(String[] aegs){
	//��ε���show������
	//Outer o=new Outer(); ���Ե��� ͬprivateһ����
	//o.method();
	
	//��������
	//��������
	//Outer.Inner oi=new Outer().new Inner();
	
	//�ⲿ����.�ڲ����� ����=new �ⲿ����.�ڲ���������;
	Outer.Inner oi=new Outer.Inner();
	oi.show();
	oi.show2();
	
	//���󣺵���show2��û�и��򵥵ķ�ʽ ��Ϊshow2�����Ǿ�̬��
	//���ھ�̬�Ŀ���ֱ��������.������
	Outer.Inner.show2();
	
	//��̬�� ��Ϊ�˷������
	}
}
class Outer{
	//��Ա����
	int a=123;
	private String str="�ⲿ��ı���";
	
	
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run����");
		Inner in=new Inner();
		in.run();
	}
	static void static_run(){
		System.out.println("�ⲿ��static_run()");
		Outer out=new Outer().new Inner();
		out.run();
	}
	
	//��Ա�ڲ���:����ֱ��ʹ���ⲿ�൱�����еĳ�Ա����
	class Inner{
		final static int a=2;//����ֱ��ʹ�þ�̬��������
		String  str ="�ڲ���ı���";  //���ڲ��໹���ⲿ���п��Թ�����ͬ�ĳ�Ա����
		void run(){
			String str="�ֲ�����";
			System.out.println("�ڲ���run����");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);//�����ڲ���ı���
			System.out.println(Outer.this.str);//�ڲ����з���ͬ�����ⲿ��ķ���
		}
	}
}
	public  class InnerDemo{
		public static void main(String[] args){
		//�ⲿ���ʹ��
		//Outer outer=new Outer();
		//outer.run();
		
		//��Ա�ڲ���ʹ�õĵ�����λ��
		//Outer.Inner inner=(new Outer()).new Inner();
		//Outer.Inner inner=new Outer().new Inner();//��������
		//inner.run();
		
		Outer outer=new Outer();
		Outer.Inner in=out.new Inner();
		in.run();
		}
	}

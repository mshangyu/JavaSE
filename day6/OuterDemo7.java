//���� �������������

interface Inner{
	public abstract void show();
	public abstract void show2();
	//public abstract void show3();
	
}

class Outer{
	public void method(){
		//һ�������ĵ���
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();                //�������� */
		
		//��������ĵ��� ���ǱȽ��鷳
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		}.show2();  */
		
		//������Inter��ʵ�������������
		//��̬
		//һ����˵ �����÷������϶���һ���ӿ� ���ҽӿ���һ��ֻ��һ������
		Inter i=new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();
		
	}

}


public class OuterDemo7{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	
	}
}
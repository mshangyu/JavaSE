 class Cow{
	private double weight;
	//�ⲿ����������صĹ��췽��
	public Cow(){}
	public Cow(double weight){
		this.weight=weight;
	}
	//����һ���Ǿ�̬�ڲ���
	private class Cowleg{
		//�Ǿ�̬�ڲ����������Ա����
		private double length;
		private String color;
		//�Ǿ�̬�ڲ�����������ع�����
		public Cowleg(){}
		public Cowleg(double length,String color){
			this.length=length;
			this.color=color;
		}
		
		public double setLength(double length){
			this.length=length;
		}
		public double getLength(){
			return this.length;
		}
		public String setColor(String color){
			this.color=color;
		}
		public String  getColor(){
			return this.color;
		}
		
		//�Ǿ�̬�ڲ����ʵ������
		public void info(){
			System.out.println("��ǰţ����ɫ�ǣ�"+color+".���ǣ�"+weight);
		}
		
	}
	
}	
public class CowTest{
	public static void main(String[] args){
		Cowleg c1=new Cowleg(1.12,"�ڰ����");
		Cow cow=new Cow(378.9);
		cow.info();
		c1.info();
	}	
}
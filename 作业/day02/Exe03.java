public  class Exe03{
	//����ÿһ����ֵ�ͱ�������ֵ
	public static void main(String[] args){
	char a='m';
	int b=3;
	double c=2.1;
	//String d="ѧ��";
	boolean flag=true;
	float k=12.9f;
	long h=399999999000000L;
	short j=1;
	byte o=56;
	
	
	//�ӷ�
	System.out.println(b+c);
	System.out.println(h+j);
	//����
	System.out.println(b-(int)c);//��Ҫǿת �������ʧ����
	System.out.println(h-c);
	System.out.println(k-b);
	//�˷�
	System.out.println(b*(int)c);
	System.out.println(k*h);
	System.out.println(h*j);
	System.out.println(c*h);
	//����
	System.out.println(c/b);
	System.out.println(h/o);
	System.out.println(k/h);
	}

}
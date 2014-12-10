public  class Exe03{
	//创建每一种数值型变量并赋值
	public static void main(String[] args){
	char a='m';
	int b=3;
	double c=2.1;
	//String d="学生";
	boolean flag=true;
	float k=12.9f;
	long h=399999999000000L;
	short j=1;
	byte o=56;
	
	
	//加法
	System.out.println(b+c);
	System.out.println(h+j);
	//减法
	System.out.println(b-(int)c);//需要强转 否则会遗失精度
	System.out.println(h-c);
	System.out.println(k-b);
	//乘法
	System.out.println(b*(int)c);
	System.out.println(k*h);
	System.out.println(h*j);
	System.out.println(c*h);
	//除法
	System.out.println(c/b);
	System.out.println(h/o);
	System.out.println(k/h);
	}

}
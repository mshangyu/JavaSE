abstract class USB{
	public abstract void read();
	public abstract void write();
}
//接口
interface Wifi{
	void open();
	void close();
}

/*
class USB_KEY extends USB{
	//特点
	
	
	//义务
	
	//重写
}*/



public class Niming{
	public static void main(String[] args){
		//匿名内部类是一个特殊的局部内部类==子类的对象 或者 实现类的对象 [这是在局部方法里实现的]
		USB udisk=new USB(){
			//
			int a;
			//static int b;  不能有静态变量
			final static int b=2;    //常量可以
			public void read(){
				System.out.println("读取u盘");
			}                                        //匿名内部类 复写 实例化 一起完成了
			public void write(){
				System.out.println("写u盘");
			}
		};
		udisk.read();
		udisk.write();
		
		Wifi a=new Wifi(){  
			public void open(){  //报错 是因为 在接口中指定是public的
				System.out.println("打开wifi");
			}                                            //匿名内部类
			public void close(){
				System.out.println("关闭wifi");
			}
		};
		a.open();
		a.close();
		
	}
}

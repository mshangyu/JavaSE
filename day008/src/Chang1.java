
public class Chang1 {
	public static void main(String[] args) {
		Fang bb=new Fang();
		bb.setLength(20);
		bb.setWidth(30);
		System.out.println(bb.getLength()+"====="+bb.getWidth());
		//这是两种给成员变量赋值的方式。也是两种求出成员变量结果的程序
		Fang bb2=new Fang(12,24);
		System.out.println(bb2.getLength()+"---"+bb2.getWidth());
		
		System.out.println(bb.getMian());
		System.out.println(bb.getZhou());
		
	}

}

class Fang{
	private int width;
	private int length;
	
	public Fang(){}
	public Fang(int width,int length){
		this.width=width;
		this.length=length;
	}
	
	
	public void setWidth(int width){
		this.width=width;
	}
	public int getWidth(){
		return width;
	}
	public void setLength(int length){
		this.length=length;
	}
	public int getLength(){
		return length;
	}
	
	
	
	public int getMian(){
		return width*length;
	}
	public int getZhou(){
		return (width*length)*2;
	}
	
	
	
	
	
}

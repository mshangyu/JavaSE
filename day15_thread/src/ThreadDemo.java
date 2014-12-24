
/*
 * Thread:线程类 线程有自己的任务 在定义线程类的时候 需要实现：？run（）
 * 一、继承Thread类来创建：
 * 1、继承
 * 2、复写run（）：任务  //子类
 * 3、实例化:线程对象
 * 4、启动线程：start
 * */

class Monkey1 extends Thread{
	String name;

	public Monkey1(String name) {
		super();
		this.name = name;
	}
	
	public void fight(){
		for(int i = 1;i < 11 ;i++){
			System.out.println(name + "打败第" + i + "个天兵天将");
		}		
	}
	public void run(){
		fight();
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		
		Monkey1 m1 = new Monkey1("第1个小悟空");
		Monkey1 m2 = new Monkey1("第2个小悟空");
		Monkey1 m3 = new Monkey1("第3个小悟空");
		
		m1.start();
		m2.start();
		m3.start();
	}

}
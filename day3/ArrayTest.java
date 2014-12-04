//数组：存放同种数据类型的元素：下表范围[0，N-1]
//特点：随机访问能力强   长度固定  移动数据效率低
//变量：只能存放一个数据


public class ArrayTest{
	public static void main(String[] args){
		//1声明数组：没有指定数组空间，也不可以指定数组的大小
		//变量在栈空间 函数中变量：局部变量、形参
		int[] arr;   //建议使用这种
		int  arr1[];
		double d_arr[];
		//int test[10];     //声明数组时，不可以指定大小
		
		
		//初始化:创建空间+初始化值=在堆空间存储
		arr =new int[10];  //显示
		d_arr=new double[10];
		arr1 = new int[]{1,2,3};  //隐式
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("d_arr[0]="+d_arr[0]);
		
		 //声明+初始化
		String[] str=new String[5];//默认初始化：动态初始化
		Object[] obj=new Object[5];//实际元素类型是
		//数组类型的子类：
		
		
		String[] IT=new String[]{"Java","c","android","c++"};//实际元素类型
		String[] IT1=            {"Java","c","android","c++"};//简写
		//匿名数组：0引用：没有名字：当数组只使用一次的情况下
		System.out.println(
			new String[]{"apple","google","alibaba","tesla"}[2]
		 );
		//使用数组
		System.out.println("IT[0]="+arr[0]);
	


		//完成数组的遍历
		//for +数组长度
		for(int i=0;i<IT.length;i++){
			System.out.println("IT:"+IT[i]+"\t");
			
		}
			System.out.println("");
			//for each :遍历数组、集合
			for(String ele:IT){
			System.out.println("IT]"+ele);
			
			}
			System.out.println("");
			//数组拷贝
			String[] it_copy=IT;
			for(String ele:it_copy){
				System.out.println("IT]"+ele);
			
			}
			System.out.println("");
			it_copy[0]="python";
			//for (String ele:IT)
			for(String ele:IT){     //多个引用指向同一个空间[数组对象]
				System.out.println("IT]"+ele);
			
			}
			//命令行
			for (String str1:args){
				System.out.println(str1);
		
			}
			//int[] test=null;
			//System.out.println("test[0]="+test[0]);
	}		
}






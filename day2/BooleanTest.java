public class BooleanTest{
	public static void main(String args[]){
		boolean flag=true;
		//boolean flag=0;//error
		if(flag){
			System.out.println("真");
	
	
		}else{
			System.out.println("假");
	
		}
		//使用bolean和字符串进行连接运算，boolean会自动转换成字符串
		//"" 空字符串  +表示后面的默认转换成字符串类型
		String str=true +"" +"geninno";
		System.out.println("str"+str);
	}
默认整形转化成浮点型
}
import java.util.*;
public class Test511{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你要查找的学生姓名");
		String name =in.next();
		String[] arr={"张三","李四","王二麻子","小刘","壁虎"};
		boolean flag=false;//标记
		for(int i=0;i<arr.length;i++){
			if(name.equals(arr[i])){
				flag=true;
				break;
			
			}
			if(flag==true){
				System.out.println("找到了");
			}else{
				System.out.println("没有这个学员");
			}
		
		}
	}
}
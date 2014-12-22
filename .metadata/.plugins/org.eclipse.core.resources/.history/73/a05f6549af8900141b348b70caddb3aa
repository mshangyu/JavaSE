import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList array=new ArrayList();
		Student s1=new Student("白骨精",18);
		Student s2=new Student("蜘蛛精",19);
		Student s3=new Student("黑熊精",20);
		Student s4=new Student("观音姐姐",17);
		Student s5=new Student("白骨精",16);
		Student s6=new Student("白骨精",16);
		//这里使用equals 来去除重复值 重复的元素对象
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		
		ArrayList newArrayList=new ArrayList<>();
		
		for(int x=0;x<array.size();x++){
			Student s=(Student)array.get(x);
			if(!newArrayList.contains(s)){
				newArrayList.add(s);
			}
		}
		
		Iterator it=newArrayList.iterator();
		while(it.hasNext()){
			Student ss=(Student)it.next();
			System.out.println(ss);
		}

	}

}

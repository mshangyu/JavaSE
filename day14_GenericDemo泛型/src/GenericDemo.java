import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*泛型：在程序中使用〈〉》来指定具体类型
 *     可以应用在类的定义     接口定义    方法定义 集合
 * */
public class GenericDemo {
	public static void main(String[] args) {
		//TreeSet<String> tsSet=new TreeSet<String>();
		TreeSet tsSet=new TreeSet();
		tsSet.add("google");
		//tsSet.add(123);  把运行时的错误 提前到编译时 提早发现错误
//		System.out.println(tsSet);
//		for (Object string : tsSet) {
//			String ss=(String)string;
//			System.out.println(ss);
//		}
//		
//		for (String object : tsSet) {
//			System.out.println(object);
//		}
		
		
		//省去了强制类型转换的麻烦
		Iterator iterator =tsSet.iterator();
		while (iterator.hasNext()) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
		Iterator<String> iterator2=tsSet.iterator();
		while (iterator2.hasNext()) {
			//String string = (String) iterator2.next();
			System.out.println(iterator2.next());
		}
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*���ͣ��ڳ�����ʹ�á�������ָ����������
 *     ����Ӧ������Ķ���     �ӿڶ���    �������� ����
 * */
public class GenericDemo {
	public static void main(String[] args) {
		//TreeSet<String> tsSet=new TreeSet<String>();
		TreeSet tsSet=new TreeSet();
		tsSet.add("google");
		//tsSet.add(123);  ������ʱ�Ĵ��� ��ǰ������ʱ ���緢�ִ���
//		System.out.println(tsSet);
//		for (Object string : tsSet) {
//			String ss=(String)string;
//			System.out.println(ss);
//		}
//		
//		for (String object : tsSet) {
//			System.out.println(object);
//		}
		
		
		//ʡȥ��ǿ������ת�����鷳
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

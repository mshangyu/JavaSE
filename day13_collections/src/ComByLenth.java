import java.util.Comparator;


public class ComByLenth implements Comparator<String> {
	//�ַ��� �Ӷ̵���
	@Override
	public int compare(String o1, String o2) {
		
		return o1.length()-o2.length() ;
	}

	

}

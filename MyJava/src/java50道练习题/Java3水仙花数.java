/*��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ����
 * ���λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "��
 * ��Ϊ153=1�����η���5�����η���3�����η���
 * 
 * */
package java50����ϰ��;

public class Java3ˮ�ɻ��� {
	public static void main(String[] args) {
		for(int x=101;x<10000;x++){
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			if (x==ge*ge*ge+shi*shi*shi+bai*bai*bai) {
				System.out.println(x);
			}
		}

	}

}

package action;
//����
import java.util.Date;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;

import model.Goddess;
import dao.GoddessDao;

public class GoddessAction {
	private void main() throws Exception {
//		//������Ե�ǰ���ѯ�ķ���
//		GoddessDao g=new GoddessDao();
//		List<Goddess> gs=g.query();
//		for (Goddess goddess : gs) {
//			System.out.println(goddess.getUser_name()+","+goddess.getAge());
//		}
//		
		
		//������Ե������ӵķ���
		GoddessDao g=new GoddessDao();
		Goddess g1=new Goddess();
		g1.setUser_name("�ܽ���");
		g1.setAge(22);
		g1.setSex(1);
		//g1.setBrithday(new Date());
		g1.setEmail("zhoujielun@imooc.com");
		g1.setMobile("18766888866");
		g1.setCreate_user("liutao");
		g1.setUpdate_user("liutao");
		g1.setIsdel(1);
		g.addGoddess(g1);
		
//		//������Ե��Ǹ��µķ���
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("�ܽ���");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//		g1.setId(4); //�����id������������֮����Ǹ�id
//		g.updateGoddess(g1);
		
//		//������Ե���ɾ���ķ���
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("�ܽ���");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//		g1.setId(4); 
//		g.delGoddess(4);
		
		
		//�����ǲ���get����
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("�ܽ���");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//	//	g1.setId(4); //�����id������������֮����Ǹ�id
//		//������Ҫ�����Ӽ�����Ա �����ȵ���add����
//		Goddess g2=g1.get(6);
//		System.out.println(g2.toString());
		
		
		
		
		
		
		
		
		
		
	}
}

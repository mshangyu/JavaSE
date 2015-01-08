package action;
//测试
import java.util.Date;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;

import model.Goddess;
import dao.GoddessDao;

public class GoddessAction {
	private void main() throws Exception {
//		//这里测试的前面查询的方法
//		GoddessDao g=new GoddessDao();
//		List<Goddess> gs=g.query();
//		for (Goddess goddess : gs) {
//			System.out.println(goddess.getUser_name()+","+goddess.getAge());
//		}
//		
		
		//这里测试的是增加的方法
		GoddessDao g=new GoddessDao();
		Goddess g1=new Goddess();
		g1.setUser_name("周杰伦");
		g1.setAge(22);
		g1.setSex(1);
		//g1.setBrithday(new Date());
		g1.setEmail("zhoujielun@imooc.com");
		g1.setMobile("18766888866");
		g1.setCreate_user("liutao");
		g1.setUpdate_user("liutao");
		g1.setIsdel(1);
		g.addGoddess(g1);
		
//		//这里测试的是更新的方法
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("周杰伦");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//		g1.setId(4); //这里的id是上面新增加之后的那个id
//		g.updateGoddess(g1);
		
//		//这里测试的是删除的方法
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("周杰伦");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//		g1.setId(4); 
//		g.delGoddess(4);
		
		
		//这里是测试get方法
//		GoddessDao g=new GoddessDao();
//		Goddess g1=new Goddess();
//		g1.setUser_name("周杰伦");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBrithday(new Date());
//		g1.setEmail("zhoujielun@imooc.com");
//		g1.setMobile("18766558866");
//		g1.setUpdate_user("liutao");
//		g1.setIsdel(1);
//	//	g1.setId(4); //这里的id是上面新增加之后的那个id
//		//这里需要新增加几个人员 所以先调用add方法
//		Goddess g2=g1.get(6);
//		System.out.println(g2.toString());
		
		
		
		
		
		
		
		
		
		
	}
}

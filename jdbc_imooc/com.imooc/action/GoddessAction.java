package action;

import java.sql.SQLException;
import java.util.List;

import model.Goddess;
import dao.GoddessDao;

public class GoddessAction {
	private void main() throws SQLException {
		GoddessDao g=new GoddessDao();
		List<Goddess> gs=g.query();
	}
}

package Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.MailDAO;
import Dao.MailDaoFonct;
import mailClass.Mail;

public class MailServiceFonct implements MailService {
	private MailDAO md = new MailDaoFonct();
	@Override
	public List<Mail> fetchall() throws SQLException {
		List<Mail> list = new ArrayList<>();
		list=md.fetchall();
		return list;
	}

}

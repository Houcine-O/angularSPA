package Service;

import java.sql.SQLException;
import java.util.List;

import mailClass.Mail;

public interface MailService {
	public List<Mail> fetchall()throws SQLException;

}

package Dao;
import java.sql.SQLException;
import java.util.List;

import mailClass.Mail;
public interface MailDAO {
	public List<Mail> fetchall()throws SQLException;
	
}

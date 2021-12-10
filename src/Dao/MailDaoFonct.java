package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mailClass.Mail;

public class MailDaoFonct implements MailDAO {

	@Override
	public List<Mail> fetchall() {
		try {
			List<Mail> ListMail = new ArrayList<>();
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement ps = con.prepareStatement("select * from mail");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String exp = rs.getString(2);
				String dest = rs.getString(3);
				String suj = rs.getString(4);
				String obj = rs.getString(5);
				Mail nm = new Mail(id,exp,dest,suj,obj);
				ListMail.add(nm);
			}
			return ListMail;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}

}

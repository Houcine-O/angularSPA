package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Service.MailService;
import Service.MailServiceFonct;
import mailClass.Mail;


@WebServlet("/selectControl")
public class selectControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MailService mailService;
    
   public void init()throws ServletException{
	   super.init();
	   mailService = new MailServiceFonct();
   }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Mail> list=mailService.fetchall();
			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			Gson gson = new Gson();
			if(list.size()>0) {
				String jsonData = gson.toJson(list);
				out.print(jsonData);
			}
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}

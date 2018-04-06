package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.UserInformation;
import repositories.UsersInformationsRepository;

@WebServlet("/logServ")
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		
		UserInformation user = retrieveUserInformationFromRequest(request);
		UsersInformationsRepository repository = new UsersInformationsRepository();
		
		session.setAttribute("conf", user);
	}
	private UserInformation retrieveUserInformationFromRequest(HttpServletRequest request) {
		UserInformation result = new UserInformation();
		result.setName(request.getParameter("name"));
		result.setPassword(request.getParameter("psw"));
		return null;
		}
	
}

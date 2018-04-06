package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
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
		checkUser(retrieveUserInformationFromRequest(request), request, response, session);
		
		//UserInformation user = retrieveUserInformationFromRequest(request);
		//UsersInformationsRepository repository = new UsersInformationsRepository();
		
		//session.setAttribute("conf", user);
	}
	private UserInformation retrieveUserInformationFromRequest(HttpServletRequest request) {
		UserInformation result = new UserInformation();
		result.setName(request.getParameter("name"));
		result.setPassword(request.getParameter("psw"));
		return result;
	}
	private void checkUser(UserInformation user, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException, ServletException {
	        if (user.getName() == null || user.getName().isEmpty()) {
	        	response.sendRedirect("wrong.jsp");
	        }else if (user.getPassword() == null || user.getPassword().isEmpty()) {
	        	response.sendRedirect("wrong.jsp");
	        }else{
	        	UsersInformationsRepository repository = new UsersInformationsRepository();
	            if(repository.searchForUser(user.getName(), user.getPassword())) {
	            	session.setAttribute("conf", user);
	            	response.sendRedirect("userProfile.jsp");
	            } else {
	            	response.sendRedirect("wrong.jsp");
	            }  
	        }
	}
}

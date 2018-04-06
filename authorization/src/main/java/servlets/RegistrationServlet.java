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

@WebServlet("/regServ")
public class RegistrationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		/*if(session.getAttribute("conf")!=null) {
			response.getWriter().print("Jestes juz zarejestrowany!");
			return;
		}*/
		UserInformation user = retrieveUserInformationFromRequest(request);
		UsersInformationsRepository repository = new UsersInformationsRepository();
				
		session.setAttribute("conf", user);
		
		repository.add(user);
		response.sendRedirect("success.jsp");
		
	}
	private UserInformation retrieveUserInformationFromRequest(HttpServletRequest request) {
		UserInformation result = new UserInformation();
		result.setName(request.getParameter("name"));
		result.setPassword(request.getParameter("psw"));
		result.setEmail(request.getParameter("email"));
		result.setAdmin(false);
		result.setPremium(false);
		return result;
		}
}

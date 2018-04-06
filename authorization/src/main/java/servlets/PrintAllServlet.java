package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositories.UsersInformationsRepository;

@WebServlet("/printAll")
public class PrintAllServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		UsersInformationsRepository repository = new UsersInformationsRepository();
		request.setAttribute("allUsers", repository.returnArray());
		request.getRequestDispatcher("/printAll.jsp").forward(request, response);
	}

}

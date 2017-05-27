package jp.morita.spring.websample1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class MySampleservlet
 */
public class MySampleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private MyBean mybean1;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mybean", mybean1);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		mybean1.addMessage(message);
		response.sendRedirect("sample");
	}

}

package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*String newurl = request.getContextPath() + "/jsp/loginsuccess.jsp";
		String newurl2 = request.getContextPath() + "/jsp/login.jsp";*/
		String loginfailurl = request.getContextPath() + "/jsp/loginfail.jsp";
		//String newurl4 = request.getContextPath() + "/Login.jsp";
		HttpSession session = request.getSession();
		String name = request.getParameter("uname");
		String psw = request.getParameter("upsw");
		session.setAttribute("username", name);
		session.setAttribute("psw", psw);
		if (name.equals("王磊") && psw.equals("123456")) {
				RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
				rd.forward(request, response);
				/* response.setHeader("refresh", "0.1;url="+newurl2); */
			} else {
				/*
				 * RequestDispatcher rd=request.getRequestDispatcher(newurl3);
				 * rd.include(request, response);
				 */
				/* response.setHeader("refresh", "2;url="+newurl3); */
				response.setHeader("refresh", "0.1;url=" + loginfailurl);
			}
		
		Date today = new Date();
		/*String time = today.toLocaleString();*/
		int hours = today.getHours();
		/*session.setAttribute("time", time);*/
		if (hours >= 0 && hours <= 12) {
			session.setAttribute("hello", "欢迎访问我的个人网站,早上好");
		}
		if (hours >= 12 && hours <= 19) {
			session.setAttribute("hello", "欢迎访问我的个人网站,下午好");
		} else {
			session.setAttribute("hello", "欢迎访问我的个人网站,晚上好");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		String name = req.getParameter("n");
		String phone = req.getParameter("p");
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>"+name+"</h1>");
		pw.print("<h1>"+phone+"</h1>");
		}

}

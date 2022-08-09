package web_proj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		int i1 = Integer.parseInt(req.getParameter("num1"));
		int i2 = Integer.parseInt(req.getParameter("num2"));
		int k = i1+i2;
		PrintWriter out = res.getWriter();
		out.println(k);
	}
}

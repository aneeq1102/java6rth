package arjuncodes;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		out.println("result is"+k);
		
		Path filePath = Path.of("D:\\algos_temp\\text.txt");
		String content = "bing chilling";
		Files.writeString(filePath, content);
		
		
		
	}
}

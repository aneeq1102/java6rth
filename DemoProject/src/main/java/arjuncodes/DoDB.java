package arjuncodes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoDB extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		String name = req.getParameter("repname");
		int no = Integer.parseInt(req.getParameter("repno"));
		
		String uname = "root";
		String pass = "aneeq1102";
		String url = "jdbc:mysql://localhost:3306/prog";
		try {
		Class.forName("com.mysql.jd.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement ps = con.prepareStatement("insert into table Representative values(?,?)");
		ps.setInt(1, no);
		ps.setString(2, name);
		
		int count = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.beans.finder.PrimitiveWrapperMap;

public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int date1 = (int)(Math.random()*1000);
		response.setContentType("text/html , charset=UTF-8");

		java.util.Date date2 = new java.util.Date();
		response.setContentType("text/html ; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>Servlet1:"+date1+"</h3>");
		out.println("<h3>Servlet1執行結果:"+date2+"</h3>");
		out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doGet(req, resp);
	}
	
}

package com.service.api.servlet;


import java.io.IOException;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(""+ " days remaining in this year. Learn Gradle now!");
	}
}

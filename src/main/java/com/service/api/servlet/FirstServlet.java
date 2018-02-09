package com.service.api.servlet;


import java.io.IOException;
import javax.servlet.http.*;

import com.service.api.utils.DateUtils;




public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(new DateUtils().daysToNewYear() + " days remaining in this year. Learn Gradle now!");
	}
}

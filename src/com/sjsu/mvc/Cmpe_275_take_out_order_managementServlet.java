package com.sjsu.mvc;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Cmpe_275_take_out_order_managementServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}

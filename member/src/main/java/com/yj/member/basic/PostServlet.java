package com.yj.member.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "postServlet", urlPatterns = "/post-request")
public class PostServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("num1", "num1");
		String num1 = req.getParameter("num1");
		System.out.println(num1);
//		
		System.out.println("post방식");
		
	}
}

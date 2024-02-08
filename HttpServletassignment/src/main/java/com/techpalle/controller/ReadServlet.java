package com.techpalle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/read")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//read the data from Browser through Servlet
		String s = request.getParameter("tbName");
		String t = request.getParameter("tbEmail");
		String[]  r = request.getParameterValues("chksub");
		String i = request.getParameter("rdgender");
		String n = request.getParameter("ddlCity");
		
		//display the data in Browser
		PrintWriter pw = response.getWriter();
		pw.append("<h1>Welcome:</h1>");
		pw.append("<h2>Name:" + s +"</h2>");
		pw.append("<h2>Email:" + t +"</h2>");
		pw.append("<h2>Subject:" + Arrays.toString(r) +"</h2>");
		pw.append("<h2>Gender:" + i +"</h2>");
		pw.append("<h2>Location:" + n +"</h2>");
		
		
	}

}

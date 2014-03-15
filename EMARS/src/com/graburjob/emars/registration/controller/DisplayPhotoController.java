package com.graburjob.emars.registration.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.service.RegistrationService;
import com.mysql.jdbc.Blob;

/**
 * Servlet implementation class DisplayPhotoController
 */
@WebServlet("/DisplayPhotoController")
public class DisplayPhotoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayPhotoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		RegistrationService regService=new RegistrationService();
		
		Blob b = regService.getImage(email);
		response.setContentType("image/jpeg");
		try{
		response.setContentLength((int)b.length());
		InputStream is=b.getBinaryStream();
		OutputStream os=response.getOutputStream();
		byte buf[]=new byte[(int)b.length()];
		is.read(buf);
		os.write(buf);
		os.close();
		
	}
	catch (SQLException ex)
	{
		ex.printStackTrace();
	}
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

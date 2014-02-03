package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.User;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside doPost");
		RegistrationService regService = new RegistrationService();
		User user = new User();
		String email=request.getParameter("inputEmail");
		System.out.println(request.getParameter("inputEmail"));
		user.setEmail(email);
		String pwd=request.getParameter("inputPassword");
		user.setPassword(pwd);
		regService.createUser(user);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Patient_profile.jsp");
		requestDispatcher.forward(request, response);
	}

}

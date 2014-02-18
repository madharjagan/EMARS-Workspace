package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside Do Post LoginController");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RegistrationService regService = new RegistrationService();
		String role = regService.isValidUser(email,password);
		if(role.equalsIgnoreCase("P"))
		{
			PatientProfile patientProfile= regService.getPatientProfile(email);
			request.setAttribute("currentPatientProfile", patientProfile);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Patient_Home.jsp");
			requestDispatcher.forward(request, response);
			
		} else if(role.equalsIgnoreCase("D")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Search.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}

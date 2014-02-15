package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.Search;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get method ....");
	}

	/**
	 * @param String 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//All UI form fields availabble in HttpServletRequest Object
		//Get email field from HttpServletRequest object and store it in a String variable
		String email = request.getParameter("email");
		
		// getPatientProfile is a method , able to interact DAO which in turn interact with DataBase using "select name,gender,dob from patient_profile where email=jagan.sankar@gmail.com"
		RegistrationService regService = new RegistrationService();
		PatientProfile patientProfile= regService.getPatientProfile(email);
		
		if(patientProfile != null){
			request.setAttribute("patientProfile", patientProfile);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Doctors_Visit.jsp");
			requestDispatcher.forward(request, response);
		}

	
	}

}

package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class PatientProfileController
 */
@WebServlet("/PatientProfileController")
public class PatientProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientProfileController() {
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
		PatientProfile patientprofile=new PatientProfile();
		System.out.println(request.getParameter("name"));
		patientprofile.setName(request.getParameter("name"));
		patientprofile.setGender(request.getParameter("optionsRadios"));
		patientprofile.setDOB(request.getParameter("dob"));
		patientprofile.setAddress(request.getParameter("address"));
		patientprofile.setEmail(request.getParameter("email"));
		patientprofile.setContact(request.getParameter("contact"));
		regService.createPatientProfile(patientprofile);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Patient_Home.jsp");
		requestDispatcher.forward(request, response);
	}

}

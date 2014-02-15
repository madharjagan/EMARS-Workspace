package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.DoctorVisit;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class DoctorsVisitController
 */
@WebServlet("/DoctorVisitController")
public class DoctorVisitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorVisitController() {
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
		DoctorVisit visit = new DoctorVisit();
		String date=request.getParameter("date");
		System.out.println(request.getParameter("date"));
		visit.setDate(date);
		String symptoms=request.getParameter("symptoms");
		System.out.println(request.getParameter("symptoms"));
		visit.setSymptoms(symptoms);
		String medication=request.getParameter("medication");
		System.out.println(request.getParameter("medication"));
		visit.setMedication(medication);
		String report=request.getParameter("report");
		visit.setReport(report);
		int result=regService.createDoctorVisit(visit);
		if(result == 1){
			request.setAttribute("currentPatientProfile", patientprofile);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Doctors_Visit.jsp");
			requestDispatcher.forward(request, response);			
		}
	}

}

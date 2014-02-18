package com.graburjob.emars.registration.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.Doctor;
//import com.graburjob.emars.registration.model.DoctorVisit;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class DoctorController
 */
@WebServlet("/DoctorController")
public class DoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorController() {
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
		System.out.println("inside doPost");
		RegistrationService regService = new RegistrationService();
		
		PatientProfile patientprofile= (PatientProfile) request.getSession().getAttribute("patientProfile");
		System.out.println("@@@@@@@@@@@@@@@@@@"+patientprofile);
		
		Doctor doctor = new Doctor();
		
		String email = request.getParameter("email");
		doctor.setEmail(email);
		
		String date=request.getParameter("date");
		doctor.setDate(date);
		
		String symptoms=request.getParameter("symptoms");
		doctor.setSymptoms(symptoms);

		String medication=request.getParameter("medication");
		doctor.setMedication(medication);

		String report=request.getParameter("report");
		doctor.setReport(report);
		
		int result=regService.createDoctor(doctor);
		
		List<Doctor> listOfMedication = regService.getPatientMedication(email);
		
		if(result == 1){
			request.setAttribute("patientProfile", patientprofile);
			request.setAttribute("doctor",listOfMedication);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Doctor.jsp");
			requestDispatcher.forward(request, response);			
		}
	}

	}



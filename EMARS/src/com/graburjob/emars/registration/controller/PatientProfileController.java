package com.graburjob.emars.registration.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class PatientProfileController
 */
@WebServlet("/PatientProfileController")
@MultipartConfig(maxFileSize = 16177215)
public class PatientProfileController extends HttpServlet {
	private static final long serialVersionUID = -1623656324694499109L;
       
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
		InputStream inputStream = null; 
		 // obtains the upload file part in this multipart request  
        Part filePart = request.getPart("photo"); 
        if (filePart != null) {  
            // debug messages  
            System.out.println(filePart.getName());  
            System.out.println(filePart.getSize());  
            System.out.println(filePart.getContentType());  
  
            // obtains input stream of the upload file  
            inputStream = filePart.getInputStream();  
        } 
		RegistrationService regService = new RegistrationService();
		PatientProfile patientprofile=new PatientProfile();
	
		System.out.println(request.getParameter("name"));
		patientprofile.setName(request.getParameter("name"));
		patientprofile.setGender(request.getParameter("optionsRadios"));
		patientprofile.setDob(request.getParameter("dob"));
		patientprofile.setAddress(request.getParameter("address"));
		patientprofile.setEmail(request.getParameter("email"));
		patientprofile.setContact(request.getParameter("contact"));
		patientprofile.setPhoto(inputStream);
		
		int result = regService.createPatientProfile(patientprofile);
		if(result == 1)
		{
			request.setAttribute("currentPatientProfile", patientprofile);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Patient_Home.jsp");
			requestDispatcher.forward(request, response);			
		}

	}

}

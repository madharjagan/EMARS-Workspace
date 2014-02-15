package com.graburjob.emars.registration.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.service.RegistrationService;

/**
 * Servlet implementation class DoctorAppointController
 */
@WebServlet("/DoctorAppointController")
public class DoctorAppointController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorAppointController() {
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
		Appointment appoint=new Appointment();
		appoint.setName(request.getParameter("name"));
		appoint.setDate(request.getParameter("date"));
		appoint.setTime(request.getParameter("time"));
		int result = regService.getAppointment(appoint);
		if(result == 1){
			request.setAttribute("currentAppointment", appoint);
	}
	}
}

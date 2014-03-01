<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.graburjob.emars.registration.model.PatientProfile" %>
  
 <%@ page import="com.graburjob.emars.registration.model.Doctor" %>
 <%@ page import="java.util.List" %>  
 <%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Doctors_Visit</title>
<!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="screen">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css" media="screen">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
 <%
PatientProfile patientProfile = (PatientProfile) request.getAttribute("patientProfile");
request.getSession().setAttribute("patientProfile", patientProfile);
List<Doctor> listOfMedication = (ArrayList<Doctor>) request.getAttribute("doctor");
%>

<div class="container">

  <!-- row 1 -->
  <header class="row page-header">


    <div class="col-lg-4">
        <a href="index.html"><img src="images/emars_logo.png"></a>
      <div class="header">
        <h2>Apollos</h2>
      </div>
    </div>


    <div class="col-lg-8">
      <ul class="nav nav-pills pull-right">
        <li><a href="#"><h3>Home</h3></a></li>
        <li><a href="#"><h3>Profile</h3></a></li>
        <li><a href="#"><h3>Messages</h3></a></li>
      </ul>
    </div>


  </header>
</div>




<div class="container">
      <div class="row">
        <div class="col-lg-2">
        </div>
        <div class="col-lg-6">
          <div class="header">
          <h2>Doctors</h2><br /><br />
        </div>
        <form role="form"  method="post" action="DoctorController">
            <div class="control-group">
              <div class="controls">
              
              <h3><%=patientProfile.getName() %></h3>
              <h3><%=patientProfile.getGender() %></h3>
              <h3><%=patientProfile.getDob() %></h3>
             <br />
             <table class="table table-bordered">
             <%for(Doctor doctor:listOfMedication){ %>
              <tr>
              <td><%=doctor.getDate() %></td>
              <td><%=doctor.getSymptoms() %></td>
               <td><%=doctor.getMedication() %></td>
               <td><%=doctor.getReport() %></td></tr>
               <%} %>
                </table>
              </div>
            </div> 
           
            <div class="form-group">
            <input type="text" name="email" class="form-control"value=<%=patientProfile.getEmail() %>><br />
                <label for="inputDOB">Visiting Date</label>
                <input type="date" accept="date" class="form-control" id="date" name="date" placeholder="Enter date" required="required">
            </div>
            <div class="form-group">
              <label for="labelAddress">Symptoms</label>
              <textarea rows="3" class="form-control" id="address" name="symptoms"></textarea>
            </div> 
            <div class="form-group">
              <label for="labelAddress">Medication</label>
              <textarea rows="3" class="form-control" id="address" name="medication"></textarea>
            </div> 
            <div class="form-group">
              <label for="labelAddress">Report</label>
              <textarea rows="3" class="form-control" id="address" name="report"></textarea>
            </div> 

            <button type="submit" class="btn btn-primary btn-lg pull-right">Submit</button>
        </form>
      </div>
      <div class="col-lg-4">
      </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
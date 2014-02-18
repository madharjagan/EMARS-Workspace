<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.graburjob.emars.registration.model.PatientProfile" %>
 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eMARs</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <%
PatientProfile currentPatientProfile = (PatientProfile) request.getAttribute("currentPatientProfile");
%>
<div class="container">

    <!--<div class="header page-header">
        <ul class="nav nav-pills pull-right">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
        <a href="index.html"><img src="images/emars_logo.png" /></a>
    </div>
-->

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
          <li class="active"><a href="#"><h3>Home</h3></a></li>
          <li><a href="#"><h3>Profile</h3></a></li>
          <li><a href="Home.html"><h3>LogOut</h3></a></li>
        </ul>
      </div>


    </header>
  </div>
<div class="container">
    <div class="row">
      <article class="col-lg-9 pull-right">
        <form class="form-horizontal">
          <div class="control-group">

            <div class="controls">

              <h3><%=currentPatientProfile.getName() %></h3>
              <h3><%=currentPatientProfile.getGender() %></h3>
              <h3><%=currentPatientProfile.getDob() %></h3>
              <h3><%=currentPatientProfile.getAddress() %></h3>
              <h3><%=currentPatientProfile.getEmail() %></h3>
              <h3><%=currentPatientProfile.getContact() %></h3><br /><br />

              <button type="edit" class="btn btn-primary btn-lg">Edit</button>&nbsp;&nbsp;
              <a href="Doctor_Appointment.jsp"class="btn btn-primary btn-lg active pull-right"role="button">Get Appointment</a>

            </div>
          </div>
        </form>
      </article>
       <aside class="col-lg-3">
        <img src="images/round_img.jpg" alt="..." class="img-circle">
       </aside>
    </div>



    <!--<footer class="row">
        <div class="container">
          <p class="muted credit">Example courtesy <a href="http://martinbean.co.uk">Martin Bean</a> and <a href="http://ryanfait.com/sticky-footer/">Ryan Fait</a>.</p>
      </div>
    </footer>-->

</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
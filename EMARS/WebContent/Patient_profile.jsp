<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Patient_Profile</title>
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
        <h2>Patient Profile</h2><br /><br />
      </div>
        <form method="post" action="PatientProfileController" enctype="multipart/form-data">
          <div class="form-group">
            <label for="labelName">Name</label>
            <input type="text" pattern="[A-Za-z\.\s]+" class="form-control" id="name" name="name" placeholder="Enter Your Name">
          </div>
         <div class="form-group">
              <label for="inputradio">Gender</label>
                <div>
                  <input type="radio" id="radio1" name="optionsRadios" value="male">Male
                &nbsp; &nbsp;
              <input type="radio" id="radio2" name="optionsRadios" value="female">Female
            </div>
          </div>
          <div class="form-group">
            <label for="inputDOB">Date Of Birth</label>
            
            <input type="date" accept="date" class="form-control" id="dob" name="dob" placeholder="Enter your DOB">
          </div>
          <div class="form-group">
            <label for="labelAddress">Address</label>
            <textarea rows="3" class="form-control" id="address" name="address"></textarea>
          </div>  
          <div class="form-group">
            <label for="labelEmail">Email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter Your Mail ID">
          </div>
          <div class="form-group">
            <label for="labelNumber">Mobile Number</label>
            <input type="text" pattern="[0-9]{10}" class="form-control" id="contact" name="contact" >
          </div>
          <div class="form-group">
            <label for="labelNumber">Upload Image</label>
            <input type="file" name="photo" size="10" />
          </div>
          <button type="submit" class="btn btn-primary btn-lg pull-right">Next</button>
        </form>
       </div>
      <div class="col-lg-4">
      </div>
    </div>
</div>

<!--<div class="container">
  <footer class="row">
        <p class="muted credit">Example courtesy <a href="http://martinbean.co.uk">Martin Bean</a> and <a href="http://ryanfait.com/sticky-footer/">Ryan Fait</a>.</p>
  </footer>
</div>-->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
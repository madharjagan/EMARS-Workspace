
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Doctor_Apppointment</title>
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
        <li><a href="Home.html"><h3>LogOut</h3></a></li>
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
        <h2>Doctors Appointment</h2><br /><br />
      </div>
      <form role="form" method="post" action="DoctorAppointController">
        <div class="form-group">
            <label for="labelAddress">Doctor Name</label>
            <select class="form-control" name="name">
              <option>JACOB</option>
              <option>GRACE</option>
              <option>AIDEN</option>
              <option>VICTORIA</option>
              <option>DANIEL</option>
            </select>
          </div>
        <div class="form-group">
          <label for="inputDOB">Appointment Date</label>
          <input type="date" accept="date" class="form-control" id="date" name="date" placeholder="Enter date">
        </div>
        <div class="form-group">
          <label for="labelAddress">Appointment Time</label>
    <select class="form-control" name="time">
  <option>9am to 12 pm</option>
  <option>6pm to 9pm</option>
  
  </select>
  </div>
         
          


<button type="submit" class="btn btn-primary btn-lg pull-right">Submit</button>
        </form>
       </div>
      <div class="col-lg-4">
      </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
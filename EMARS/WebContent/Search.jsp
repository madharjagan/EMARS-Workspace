<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Patients_Account</title>
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
'        <h2>Patient Account</h2><br /><br />
      '      </div>
        <form role="form" method="post" action="SearchController">
          <div class="form-group">
            <label for="labelName">Search</label>
            <input type="email" name="email" class="form-control">
          </div>

<button type="submit" class="btn btn-primary btn-lg pull-right">GO</button>
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
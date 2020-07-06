
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Question Paper Generator-sLogin</title>
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css" rel="stylesheet">

<style type="text/css">
    em{
        padding: 35px;
        color: red;
        font-style: normal;
        
    }
</style>
</head>

<body>

  <!-- Start your project here-->
  <br>
  <div class="col-lg-12 text-center" style="box-shadow: 2px 7px 6px silver; ">
      <img src="http://static1.squarespace.com/static/5a3a9a1129f187a11edbd3ce/5a95b97b0852290722976797/5ab43d3370a6ad6a9cb20089/1521761592593/197717.png" class="img-responsive" height="50" width="40" >
  <h1 style="text-align: center;">Question Paper Generator</h1>
  </div>
  
  
<div class="container-fluid col-lg-7 mt-5">
<div class="card">

  <h5 class="card-header info-color white-text text-center py-4" style="background-color: #4b3e8a !important;">
    <strong>Log in</strong>
  </h5>

 <!--Body-->
 <form id="loginform">
      <div class="modal-body mb-0">
        <div class="md-form form-sm">
          <i class="fas fa-user prefix active" style="color: #4b3e8a;"></i>
          <input type="text" id="form8" class="form-control" name="email">
          <label for="form8" class="active">Username</label>
        </div>

        <div class="md-form form-sm">
          <i class="fas fa-key prefix active" style="color: #4b3e8a;"></i>
          <input type="password" id="form9" class="form-control"  name="password">
          <div style="margin-left: 95% !important;">
          <i class="fa fa-eye-slash prefix active" aria-hidden="true" id="slash" style=" color: #4b3e8a; font-size: 15px !important;"></i>
          <i class="fa fa-eye prefix active" aria-hidden="true" id="eye" style=" color: #4b3e8a; font-size: 15px !important;"></i>
          </div>
          <label for="form9" class="active">Password</label>
        </div>
<div style="text-align: center;">
        <!-- Default inline 1-->
<div class="custom-control custom-radio custom-control-inline">
    <input type="radio" class="custom-control-input" id="defaultInline1" name="inlineDefaultRadiosExample" checked>
  <label class="custom-control-label" for="defaultInline1">Instructor</label>
</div>

<!-- Default inline 2-->
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" class="custom-control-input" id="defaultInline2" name="inlineDefaultRadiosExample">
  <label class="custom-control-label" for="defaultInline2">Admin</label>
</div>
</div>
<br>
        <div class="text-center mt-1-half" >
          <button class="btn btn-info mb-2 waves-effect waves-light" style="background-color: #4b3e8a !important;">Log in <i class="fas fa-send ml-1"></i></button>
        </div>

      </div>
</form>
</div>
    <!--/.Content-->
  </div>

  <!-- SCRIPTS -->
  <!-- JQuery -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js"></script>
  <!-- /Start your project here-->
  <script type="text/javascript">
            $(document).ready(function(){

            $('#eye').hide();

            $('#show ,#slash').click(function(){
            $('#form9').attr("type","text");
            $('#slash').hide();
            $('#eye').show();
             })

             $('#hide, #eye').click(function(){
             $('#form9').attr("type","password");
             $('#eye').hide();
             $('#slash').show();
              })
              })
  </script>
  
  
  <script type="text/javascript">
   $(document).ready(function(){
       $.validator.addMethod(
        "regex",
        function(value, element, regexp) {
            var re = new RegExp(regexp);
            return this.optional(element) || re.test(value);
        },
        "Incorrect mobile no."
);
      $( "#loginform" ).validate({
        rules: {
            
            email:{
            required:true,
            regex:"^([a-zA-Z0-9_\\-\\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$"
          },

            password: {
            required: true,
            minlength: 6
            
            },

        },
        messages: {
          
          email: {
            required: "Email is required",
            regex:"Incorrect email value"
          },
          password: {
            required: "Password is required"}
        } ,

     submitHandler: function(form) {
       
 },

        errorElement: "em",
        errorPlacement: function ( error, element ) {
          // Add the `help-block` class to the error element
          error.addClass( "help-block" );

          if ( element.prop( "type" ) === "checkbox" ) {
              
            error.insertAfter( element.parent( "label" ) );
          } else {
            error.insertAfter( element );
          }
        },
        highlight: function ( element, errorClass, validClass ) {
          $( element ).parents( ".col-sm-5" ).addClass( "has-error" ).removeClass( "has-success" );
        },
        unhighlight: function (element, errorClass, validClass) {
          $( element ).parents( ".col-sm-5" ).addClass( "has-success" ).removeClass( "has-error" );
        }
      }
           
       );
    });
  </script>

  
  
</body>

</html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Question Paper Generator-sLogin</title>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
   <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
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
  <div class="col-lg-12 text-center" style="box-shadow: 2px 7px 6px silver; ">
      <img src="https://freehomedelivery.net/wp-content/uploads/2017/10/checklist-smaller1.png" class="img-responsive" height="50" width="40" >
  <h1 style="text-align: center;">Question Paper Generator</h1>
  </div>
<div class="container-fluid col-lg-7 mt-5">
<div class="card">
    <h5 class="card-header info-color white-text text-center py-4" style="background-color: #4b3e8a !important;">
    <strong>Log in</strong>
  </h5>
    <form id="loginform" method="post" >
      <div class="modal-body mb-0">
          <div class="md-form form-sm">
          <i class="fas fa-user prefix active" style="color: #4b3e8a;"></i>
          <input type="text" id="username" class="form-control" name="username">
          <label for="form8" class="active">Username</label>
          </div>
          
          <div class="md-form form-sm">
          <i class="fas fa-key prefix active" style="color: #4b3e8a;"></i>
          <input type="password" id="password" class="form-control"  name="password">
          <div style="margin-left: 95% !important;">
          <i class="fa fa-eye-slash prefix active" aria-hidden="true" id="slash" style=" color: #4b3e8a; font-size: 15px !important;"></i>
          <i class="fa fa-eye prefix active" aria-hidden="true" id="eye" style=" color: #4b3e8a; font-size: 15px !important;"></i>
          </div>
          <label for="form9" class="active">Password</label>
          </div>
          
          <div>
<div class="custom-control custom-radio float-left col-lg-2">
  <input type="radio" class="custom-control-input" id="defaultUnchecked" name="admin" value="admin">
  <label class="custom-control-label" for="defaultUnchecked">Admin</label>
</div>

<div class="custom-control custom-radio float-left">
  <input type="radio" class="custom-control-input" id="defaultChecked"  name="admin" value="instructor" >
  <label class="custom-control-label" for="defaultChecked">Instructor</label>
</div>
         </div>
          <div class="text-center mt-1-half" >
          <button class="btn btn-info mb-2 waves-effect waves-light" type="submit" style="background-color: #4b3e8a !important;" >Log in <i class="fas fa-send ml-1"></i></button>
          </div>
      </div>
   </form>
 </div>
</div>
      <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js"></script>
 
      <script type="text/javascript">
            $(document).ready(function(){

            $('#eye').hide();

            $('#show ,#slash').click(function(){
            $('#password').attr("type","text");
            $('#slash').hide();
            $('#eye').show();
             })

             $('#hide, #eye').click(function(){
             $('#password').attr("type","password");
             $('#eye').hide();
             $('#slash').show();
              })
              });
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
            username:{
            required:true,
            },
           password: {
            required: true,
            minlength: 6
            },
        },
        messages: {
          
          username: {
            required: "username is required",
           },
          password: {
            required: "Password is required"}
        } ,
     submitHandler: function(form) {
       username=$("#username").val();
       console.log(username);
        password=$("#password").val() ;
       console.log(password);
       var admin="";
        var ele = document.getElementsByName('admin'); 
            for(i = 0; i < ele.length; i++) { 
                if(ele[i].checked) 
               admin = ele[i].value; 
            } 
      console.log(admin); 
     datastring="username="+username+"&password="+password+"&admin="+admin;
     console.log(datastring);
     $.ajax({
          url:"validate_login.jsp",
          type:"post",
          data:datastring,
          success:function(result){
              console.log(result);
              res=result.trim();
              len=res.length;
              console.log(len);
              if(res.localeCompare("okadmin")===0){
              location.href="Dashboard1.jsp";
          }else if(res.localeCompare("okinstructor")===0){
              location.href="Dashboard2.jsp";
          }else{
             console.log("kuchh nahi mila");
          }
          }
      });
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


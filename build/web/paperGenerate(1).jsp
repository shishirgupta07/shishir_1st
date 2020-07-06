<%-- 
    Document   : test
    Created on : 9 Jul, 2019, 11:27:28 AM
    Author     : HP
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <title> JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Font Awesome -->
              <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/brands.min.css" integrity="sha256-u8123o+sLy8uk0Du9H0Ub+KinAoHanzGsBqDkWHY1f8=" crossorigin="anonymous" >
              <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->
              <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
              <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css" rel="stylesheet">
               <link  rel="stylesheet"  type="text/css" href="compiled.css">
               
 </head>

<body >
     <ul id="slide-out" class="side-nav fixed custom-scrollbar " style="background-color:#4b3e8a; transform: translateX(0%);">
           
          
            <li>
                <ul class="collapsible collapsible-accordion">
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-home  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                           
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-chalkboard-teacher  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-question  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                          
                           
                        </div>
                    </li>  <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-graduation-cap  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                          
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-swatchbook white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                           
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-book white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                         
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-file-alt white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                          
                        </div>
                    </li>
                </ul>
            </li>
            <!--/. Side navigation links -->
            <div class="sidenav-bg mask-strong"></div>
        </ul>
    <div class="container">
        <nav class="navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav ">
            <!-- SideNav slide-out button -->
            
                <a href="#" data-activates="slide-out" class="button-collapse " style="width:18%; color: #4b3e8a"><i class="fa fa-bars"></i></a>
            &nbsp &nbsp &nbsp
         
                <a class="navbar-brand  " style="color:#4b3e8a "  href="#"><i class="fas fa-book-reader  prefix   fa-lg  ">&nbsp &nbsp</i> 
                         course management</a>
    
                        <button type="button" class="btn   btn-rounded ml-auto"style="background-color:#4b3e8a;width: 133px; height: 35px; color:white"><i class="fas fa-sign-out-alt "></i>Logout</button>
            
            <!-- Breadcrumb-->
            
            
        </nav>
      </div>
    <div class="container" style="height: 49px;">
        
    </div>
    <div class="container"> 
              <div class="row">
                <div class="col-lg-3">
                </div>
    
               
               <div class="col-lg-9">
                         <div style="height: 33px;">
            
                         </div>
                    <br>
                      <ul class="nav nav-tabs nav-justified md-tabs" style="background-color: #4b3e8a" id="myTabJust" role="tablist">
                           <li class="nav-item">
                                <a class="nav-link active " id="home-tab-just" data-toggle="tab" href="#home-just" role="tab" aria-controls="home-just"
                                aria-selected="true">Create Question Paper Here</a>
                          </li>
                      </ul>
                            <div style="height:5px;">
    
                            </div>
                 <div class="tab-content card pt-5" id="myTabContentJust">
    
                     <div class="tab-pane fade show active" id="home-just" role="tabpanel" aria-labelledby="home-tab-just">
      
                       <!-- Material form contact -->
<div class="card">
    <h5  class="card-header white-text text-center py-4" style="background-color: #4b3e8a" >
        <strong>Create Here</strong>
    </h5>
      <div class="card-body px-lg-5 pt-0">
       <form class="text-center" style="color: #757575;" action="paperPreview.jsp">
           <div class="">
            <select class="mdb-select md-form colorful-select dropdown-ins" id="course_select" name="course_select">
                <option value="" readonly>select course</option>
 <% 
               SqlUtil.connectDatabase();
                String qry="select * from course";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
 %>
                        <option  value="<%=rs.getString("course_id")%>" selected=""><%=rs.getString("course_name")%></option>
               <%  
                        }
               %>    
            </select>
           
                  
            <select class="mdb-select md-form colorful-select dropdown-ins" id="semester_select" name="semester_select">
  <option value="" readonly>select semester</option>
            </select>
             
            <select class="mdb-select md-form colorful-select dropdown-ins" id="subject_select" name="subject_select">
  <option value="" readonly>select subject</option>
            </select>
            <select class="mdb-select md-form colorful-select dropdown-ins" name="noOfModules">
  <option value="" readonly>No of modules</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
            </select>
            <select class="mdb-select md-form colorful-select dropdown-ins" name="questionPerModule">
  <option value="" readonly>Question per module</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
            </select>
           </div>
            <div class="md-form mt-3">
                <input type="text" id="materialContactFormName" class="form-control" name="questionPaperCode">
                <label for="materialContactFormName">Question paper code</label>
            </div>

            <!-- E-mail -->
            <div class="md-form">
                <input type="text" id="materialContactFormEmail" class="form-control" name="marksPerModule">
                <label for="materialContactFormEmail">Marks per module</label>
            </div>
            
            <div class="md-form">
                <input type="text" id="materialContactFormMessage" class="form-control" name="choisePerModule">
                <label for="materialContactFormMessage">Choise per module</label>
            </div>
            <div class="md-form">
             <select class="mdb-select md-form colorful-select dropdown-ins" name="time">
  <option value="" readonly>time duration of exam</option>
  <option value="1 hour">1 hour</option>
  <option value="1+1/2 hour">1+1/2 hour</option>
  <option value="2 hour">2 hour</option>
  <option value="3 hour">3 hour</option>
            </select>
            </div>
            <!-- Copy -->
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="materialContactFormCopy" value="yes" name="check">
                <label class="form-check-label" for="materialContactFormCopy">check the box to get us ensure!</label>
            </div>

            <!-- Send button -->
            <button class="btn btn-rounded btn-block z-depth-0 my-4 waves-effect white-text" type="submit" style="background-color:#4b3e8a;">generate</button>
       
        </form>
       </div>
     </div>
</div>
<!-- Material form contact -->
                   </div>
   </div>

                    </div>
               </div>
           </div>
      </div>
       

    
    
     <!-- JQuery -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>

    
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js"></script>
<!--    <script type="text/javascript" src="./test_files/compiled.min.js.download"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
   <script type="text/javascript" src="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.11.0.min.js"></script>
    <script>
       $(".button-collapse").sideNav();
        new WOW().init();
    </script>
    <script>
        $(document).ready(function() {
       $('.mdb-select').materialSelect();
       });
        </script>
<script type="text/javascript">
     $(document).ready(function(){
         $('#course_select').change(function(){
          $('#semester_select').find('option').not(':first').remove();
                var course_id = $('#course_select').val();
                var datastring="course_id="+course_id;
                  $.ajax({
      type:"POST",
      url:"getSemester.jsp",
      data:datastring,
      success:function(result)
      {
        console.log(result);
        var obj=JSON.parse(result);
       console.log(obj);
       var end= $('#semester_select').find('option').remove().end();
       end.append('<option value="" selected disabled>Semester</option>');
            for (var i=0;i<obj.length;i++){
       end.append('<option value="'+obj[i].semid+'">'+obj[i].sem+'</option>');
   }
       }
     });
         });
          });
     </script>
     <script type="text/javascript">
    $(document).ready(function(){
         $('#semester_select').change(function(){
          $('#subject_select').find('option').not(':first').remove();
                var course_id = $('#course_select').val();
                var sem_id = $('#semester_select').val();
                var datastring={course_id:course_id,sem_id:sem_id};
                  $.ajax({
      type:"POST",
      url:"getSubjectOption.jsp",
      data:datastring,
      success:function(result)
      {
        console.log(result);
        var obj=JSON.parse(result);
       console.log(obj);
       var end= $('#subject_select').find('option').remove().end();
       end.append('<option value="" selected disabled>Subject</option>');
            for (var i=0;i<obj.length;i++){
       end.append('<option value="'+obj[i].subject_id+'">'+obj[i].subject_name+'</option>');
     }
       }
     });
         });
          });
   </script>

<div class="drag-target" style="left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>




<div class="hiddendiv common"></div>
 
       
    </body>
</html>
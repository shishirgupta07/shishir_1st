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
               <link  rel="stylesheet" type="text/css" href="dropdown.css">
  
    </head>

<body>
     <ul id="slide-out" class="side-nav fixed custom-scrollbar " style="background-color:#4b3e8a; transform: translateX(0%);">
           
          
            <li>
                <ul class="collapsible collapsible-accordion">
                    <li><a class="collapsible-header waves-effect arrow-r" href="Dashboard2.jsp"><i class="fa fa-home  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                           
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r" href="instructor_management.jsp"><i class="fa fa-chalkboard-teacher  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r" href="question_management.jsp"><i class="fa fa-question  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                          
                           
                        </div>
                    </li>  <li><a class="collapsible-header waves-effect arrow-r" href="course_management.jsp"><i class="fa fa-graduation-cap  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                          
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r" href="subject_management.jsp"><i class="fa fa-swatchbook white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                           
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r" href="unit_management.jsp"><i class="fa fa-book white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                         
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r" href="paperGenerate.jsp"><i class="fa fa-file-alt white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class="fa fa-angle-down rotate-icon"></i></a>
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
                                aria-selected="true">view Subjects</a>
                          </li>
                            <li class="nav-item">
                            <a class="nav-link" id="profile-tab-just" data-toggle="tab" href="#profile-just" role="tab" aria-controls="profile-just"
                                  aria-selected="false">add Subjects</a>
                              </li>
                    </ul>
                            <div style="height:5px;">
    
                            </div>
                 <div class="tab-content card pt-5" id="myTabContentJust">
    
                     <div class="tab-pane fade show active" id="home-just" role="tabpanel" aria-labelledby="home-tab-just">
      <!-- Editable table -->
                       <div class="card "  >
                                             <h5 style="background-color:#4b3e8a" class="card-header  text-center white-text font-weight-bold text-uppercase py-4 "  >View Subjects </h5>
                              <div class="card-body">
                                        <div id="table" class="table-editable">
                            <form class="text-center"  style="color: #757575" method="get" >
                                                <table class="table table-bordered table-responsive-md table-striped text-center">
                                                        <thead>
                                                                     <tr>
                                                                                   <th class="text-center">Subject Name</th>
                                                                                   
                                                                     </tr>
                                                        </thead>
                      
                      
   <tbody>
       <tr class="row">
                  <td class="col-lg-3" >
                    <select  class="browser-default" id="course_select" name="selectCourse">
                        <option value="" >select course</option>
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
                </td>
                 <td class="col-lg-3">
                 </td>
                <td class="col-lg-3">
                         <select class="browser-default" id="semester_select" name="selectSemester">
                          <option value="" >select semester</option> 
                         </select>
                </td>
              </tr>
             <tr id="subject_print"> 
             </tr>  
                    </tbody>
                               
        </table>
                            </form>
        </div>
     </div>
</div>
     </div>
                
                  
 <div class="tab-pane fade" id="profile-just" role="tabpanel" aria-labelledby="profile-tab-just">
            
      <!-- Material form subscription -->
        <div class="card">

                    <h5 class="card-heade  white-text text-center py-4  " style="background-color: #4b3e8a">
                    <strong>Add Subjects here</strong>
                    </h5>
         <div class="card-body px-lg-5">

  <!-- Form -->      
  <form class="text-center" id="loginform" action="subject_add.jsp" style="color: #757575" method="get" >
      <table class="table table-hover">
                <tr class="row">
                  <td class="col-lg-3" >
                    <select  class="browser-default" id="courses_select" name="selectCourse">
                        <option value="" >select course</option>
 <% 
               SqlUtil.connectDatabase();
                String qry1="select * from course";
                ResultSet rs1=SqlUtil.read(qry1);
                while(rs1.next()){
 %>
                        <option  value="<%=rs1.getString("course_id")%>" selected=""><%=rs1.getString("course_name")%></option>
               <%}%>    
                    </select>
                </td>
                 <td class="col-lg-3">
                 </td>
                <td class="col-lg-3">
                         <select class="browser-default" id="semesters_select" name="selectSemester">
                          <option value="" >select semester</option> 
                         </select>
                </td>
              </tr>
              <tr>
                  <td>
                      <div class="md-form input-group mb-3">
                      <div class="input-group-prepend">
                      <span class="input-group-text md-addon" id="inputGroupMaterial-sizing-default">enter the no of subjects you want to enter</span>
                      </div>
                      <input type="text" class="form-control" id="textField" name="subjects" aria-label="Sizing example input" aria-describedby="inputGroupMaterial-sizing-default" onkeyup="generate()">
                      </div>
                   </td>
              </tr>
              <tr>
                  <td>
                  <span id="container"></span>
                  </td>
              </tr>
             <tr>
                 <td>
           <div>
            <div class="col-lg-12">
                
                <button type="submit" name="btnSubmit"  class="btn white-text btn-rounded btn-sm my-0 btn-lg" style="background-color: #4b3e8a; width:20%;">Add</button>
             </div>
            </div>
                 </td>
            </tr>
      </table>
        </form>
       
                                         </div>
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
   
    <script>
        $(".button-collapse").sideNav();
        
        new WOW().init();
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
          $('#subject_print').find('td').remove();
                var course_id = $('#course_select').val();
                console.log(course_id);
                var sem_id = $('#semester_select').val();
                console.log(sem_id);
                var datastring={course_id:course_id,sem_id:sem_id};
                  $.ajax({
      type:"POST",
      url:"getSubject.jsp",
      data:datastring,
      success:function(result)
      {
        console.log(result);
        var end= $('#subject_print').find('td').remove().end();
       end.append(result);
   }
        
     })
     ;
 });
         });
         
   
     </script>
     <script type="text/javascript">
     $(document).ready(function(){
         $('#courses_select').change(function(){
          $('#semesters_select').find('option').not(':first').remove();
                var course_id = $('#courses_select').val();
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
       var end= $('#semesters_select').find('option').remove().end();
       end.append('<option value="" selected disabled>Semester</option>');
            for (var i=0;i<obj.length;i++){
       end.append('<option value="'+obj[i].semid+'">'+obj[i].sem+'</option>');
   }
       }
     });
         });
         
     });
     </script>
     
       
     <script>
       document.getElementById("subject_id");
   </script>
   <script>
       function generate()
       {    console.log("chalu ho gaya");
            // Number of inputs to create
            var number = document.getElementById("textField").value;
            // Container <div> where dynamic content will be placed
            var container = document.getElementById("container");
            // Clear previous contents of the container
            while (container.hasChildNodes()) {
                container.removeChild(container.lastChild);
            }
            for (i=1;i<=number;i++){
                // Append a node with a random text
                container.appendChild(document.createTextNode("subject " + (i)));
                // Create an <input> element, set its type and name attributes
                var input = document.createElement("input");
                input.type = "text";
                input.name = "textField"+i;
                container.appendChild(input);
                // Append a line break 
                container.appendChild(document.createElement("br"));
                container.appendChild(document.createElement("br"));
            }
       }
       </script>
 
 

           
                <div class="drag-target" style="left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>




<div class="hiddendiv common"></div>
 
       
    </body>
</html>
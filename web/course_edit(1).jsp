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
        <title>JSP Page</title>
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
     <ul id="slide-out" class="side-nav fixed custom-scrollbar r" style="background-color:#4b3e8a"transform: translateX(0%);">
            <!-- Logo -->
            <li>
             <br><br>
<!--                <div class="logo-wrapper waves-light waves-effect waves-light">
                    <a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#"><img src="./test_files/mdb-transparent.png" class="img-fluid flex-center"></a>
                </div>-->
            </li>
         
            <li>
<!--                <form class="search-form" role="search">
                    <div class="form-group waves-light waves-effect waves-light">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                </form>-->
            </li>
            <!--/.Search Form-->
            <!-- Side navigation links -->
            <li>
                <ul class="collapsible collapsible-accordion">
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-home  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class="fa fa-angle-down rotate-icon"></i></a>
                        
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-chalkboard-teacher  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class="fa fa-angle-down rotate-icon"></i></a>
                       
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-question  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class="fa fa-angle-down rotate-icon"></i></a>
                        
                    </li>  <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-graduation-cap  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class="fa fa-angle-down rotate-icon"></i></a>
                        
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-swatchbook white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class="fa fa-angle-down rotate-icon"></i></a>
                        
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-book white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class="fa fa-angle-down rotate-icon"></i></a>
                       
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-file-alt white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class="fa fa-angle-down rotate-icon"></i></a>
                        
                    </li>
                </ul>
            </li>
            <!--/. Side navigation links -->
            <div class="sidenav-bg mask-strong"></div>
        </ul>
    <div class="container">
        <nav class="navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav top-nav-collapse">
            <!-- SideNav slide-out button -->
            
                <a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" data-activates="slide-out" class="button-collapse black-text" style="width:18%"><i class="fa fa-bars"></i></a>
            
         
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
                            <a class="nav-link" id="profile-tab-just" data-toggle="tab" href="#profile-just" role="tab" aria-controls="profile-just"
                                  aria-selected="false">add course</a>
                              </li>
                    </ul>
                            <div style="height:5px;">
    
                            </div>
<div class="tab-content card pt-5" id="myTabContentJust">
    
               
    
     
  <div class="tab-pane fade show active" id="profile-just" role="tabpanel" aria-labelledby="profile-tab-just">
            
      <!-- Material form subscription -->
<div class="card">

    <h5 class="card-heade  white-text text-center py-4  " style="background-color: #4b3e8a">
        <strong>Add course here</strong>
    </h5>
    <!--Card content-->
    <div class="card-body px-lg-5">

        <!-- Form -->
        <form class="text-center" action="course_update.jsp" style="color: #757575;" method="post">

            <%
            String uid= request.getParameter("idc");
            System.out.println(uid);
            SqlUtil.connectDatabase();
            String sql="Select * from course where course_id='"+uid+"' ";
            System.out.println(sql);
            ResultSet rs= SqlUtil.read(sql);
           while(rs.next()){
               %>
           
            <div class="row">
            <!-- Name -->
          <div class="col-lg-4">
            <div class="md-form"> 
               
                <div class="row">
                    <i class="fas fa-stopwatch prefix " style="color: #4b3e8a"></i>   
                <input type="text" id="materialSubscriptionFormCourseName" name="course" value="<%=rs.getString("course_name")%>" class="form-control">
                <label for="materialSubscriptionFormCourseName">Course name</label>
                    </div>
            </div>
             
                </div>
            <!-- E-mai -->
             <div class="col-lg-4">
            <div class="md-form"> 
                <div class="row">
                        <i class="fas fa-stopwatch prefix" style="color: #4b3e8a"></i>
               
                
                        <input type="text" id="materialSubscriptionFormDuration" value="<%= rs.getString("course_duration")%>" name="duration" class="form-control">
                <label for="materialSubscriptionFormDuration">Duration</label>
                    </div>
            </div>
                </div>
                  <div class="col-lg-4">
            <div class="md-form"> 
                <div class="row">
                        <i class="fas fa-stopwatch prefix" style="color: #4b3e8a"></i>
               
                
                        <input type="text" id="materialSubscriptionFormcourseid" value="<%= rs.getString("course_id")%>"  name="courseid" class="form-control"  readonly>
                <label for="materialSubscriptionFormcourseid"> courseid </label>
                    </div>
            </div>
                </div>
            </div>
            <div>
            <!-- Sign in button -->
            <div class="col-lg-12">
                <button type="submit"   class="btn white-text btn-rounded btn-sm my-0 " value="update" style="background-color: #4b3e8a; width:20%;"> update </button>
            </div>
            </div>
           
               
                   <%
                                }
                   %>
        </form>
        
              
             </div>
            </div>
        <!-- Form -->

    </div>

</div>
<!-- Material form subscription -->
<!-- Default form grid -->
      
      
                  </div>
    
                     </div>
            </div>
       

    
    
     <!-- JQuery -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js"></script>
<!--    <script type="text/javascript" src="./test_files/compiled.min.js.download"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
   
    <script>

         // SideNav Initialization
        $(".button-collapse").sideNav();
        
        new WOW().init();
    
    </script><div class="drag-target" style="left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>




<div class="hiddendiv common"></div></body></html>
    </body>
</html>

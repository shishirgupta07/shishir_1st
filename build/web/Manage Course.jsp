<%-- 
    Document   : test
    Created on : 9 Jul, 2019, 11:27:28 AM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.SqlUtil"%>
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
               <link  rel="stylesheet"  type="text/css" href="compiler.css">
    
  
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
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Submit listing</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Registration form</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-chalkboard-teacher  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">For bloggers</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">For authors</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-question  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Introduction</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Monthly meetings</a>
                                </li>
                            </ul>
                        </div>
                    </li>  <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-graduation-cap  white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">FAQ</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Write a message</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-swatchbook white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">FAQ</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Write a message</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-book white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">FAQ</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Write a message</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                      <li><a class="collapsible-header waves-effect arrow-r"><i class="fa fa-file-alt white-text"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class="fa fa-angle-down rotate-icon"></i></a>
                        <div class="collapsible-body">
                            <ul>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">FAQ</a>
                                </li>
                                <li><a href="https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#" class="waves-effect">Write a message</a>
                                </li>
                            </ul>
                        </div>
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
                                <a class="nav-link active " id="home-tab-just" data-toggle="tab" href="#home-just" role="tab" aria-controls="home-just"
                                aria-selected="true">view course</a>
                          </li>
                            <li class="nav-item">
                            <a class="nav-link" id="profile-tab-just" data-toggle="tab" href="#profile-just" role="tab" aria-controls="profile-just"
                                  aria-selected="false">add course</a>
                              </li>
                    </ul>
                            <div style="height:5px;">
    
                            </div>
                 <div class="tab-content card pt-5" id="myTabContentJust">
    
                     <div class="tab-pane fade show active" id="home-just" role="tabpanel" aria-labelledby="home-tab-just">
      <!-- Editable table -->
                       <div class="card "  >
                                             <h5 style="background-color:#4b3e8a" class="card-header  text-center white-text font-weight-bold text-uppercase py-4 "  > View course and duration</h5>
                              <div class="card-body">
                                        <div id="table" class="table-editable">
                           
                                                <table class="table table-bordered table-responsive-md table-striped text-center">
                                                        <thead>
                                                                     <tr>
                                                                                   <th class="text-center">Course Name</th>
                                                                                   <th class="text-center">duration</th>
                                                                                   <th class="text-center">Option</th>
                                                                     </tr>
                                                        </thead>
                      
                      
   <tbody>
           <%
                       System.out.println("just body k bad");
    
         SqlUtil.connectDatabase();
          System.out.println("db connect k bad");
            System.out.println("2nd start");
                      
         String  qrys="Select * from coursemanagement " ;
           ResultSet rss = SqlUtil.read(qrys);
           System.out.println("2 sqlutil");
                 
           while( rss.next()){
                System.out.println("2 while");
              String course =rss. getString("course");
            String duration =rss.getString("duration");
    %>
               <tr> 
               <td>
                   <%=course %>
             </td>
               <td>
                   <%=duration%>
               </td>
           
           
                <td> 
                <span class="table-remove  white-text"><a href="edit2.jsp?idc=<%= rss.getString("courseid")%>"><button type="button" style="background-color:#4b3e8a; color:white "
                                                               class="btn-rounded btn-sm my-0 " >Update</button></a></span>&nbsp&nbsp&nbsp&nbsp&nbsp
                  <span class=" " style="width: 20px"> </span>
                  <span class="table-remove white-text"><!-- Button trigger modal -->
                       <a onclick="remove('<%= rss.getString("courseid")%>')"> <button type="button" style="background-color:#4b3e8a; color:white " class=" btn-rounded btn-sm" data-toggle="modal" data-target="#basicExampleModal">
                        Remove
                           </button></a>

                  </span>
            
          
              <%   }
               %>
               
<!-- Modal -->
<form action="remove.jsp "  method="post">
                 <div class="modal fade" id="basicExampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                                    aria-hidden="true">
                       <div class="modal-dialog" role="document">
                               <div class="modal-content">
                                       <div class="modal-header">
                                           <h3 class="modal-title" id="exampleModalLabel" style="color:black">do you want to delete?</h3>
                                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                          <span aria-hidden="true">&times;</span>
                                            </button>
                                                 </div>
                                   
                                     <div class="modal-body">
                                         <h2 style="color:black">  </h2>
                                      </div>
                                       <div class="modal-footer">
                                           <input type="hidden" id="courseid" name="cid">
                                        <button type="submit" class="btn btn-indigo btn-rounded btn-sm" data-dismiss="modal">Close</button>
                                         <button type="submit" class="btn  btn-rounded btn-sm btn-indigo">confirm</button> 
                                        </div>
                               </div>
                     </div>
                </div>
</form>
                      </td>
            
                </tr>  
                    </tbody>
                               
        
       
                </table>
           
        </div>
     </div>
</div>
<!-- Editable table --> 
    
     </div>
 <div class="tab-pane fade" id="profile-just" role="tabpanel" aria-labelledby="profile-tab-just">
            
      <!-- Material form subscription -->
        <div class="card">

                    <h5 class="card-heade  white-text text-center py-4  " style="background-color: #4b3e8a">
                    <strong>Add course here</strong>
                    </h5>
    <!--Card content-->
                    <div class="card-body px-lg-5">

        <!-- Form -->
                         <form class="text-center" style="color: #757575;" method="post">

           
                        <div class="row">
            <!-- Name -->
                            <div class="col-lg-6">
                                    <div class="md-form"> 
               
                                              <div class="row">
                                                               <i class="fas fa-stopwatch prefix " style="color: #4b3e8a"></i>   
                                                                 <input type="text" id="materialSubscriptionFormCourseName" name="course" class="form-control">
                                                                 <label for="materialSubscriptionFormCourseName">Course name</label>
                                                 </div>
                                     </div>
             
                            </div>
            <!-- E-mai -->
        <div class="col-lg-6">
            <div class="md-form"> 
                <div class="row">
                        <i class="fas fa-stopwatch prefix" style="color: #4b3e8a"></i>
               
                
                                <input type="text" id="materialSubscriptionFormDuration" name="duration" class="form-control">
                                 <label for="materialSubscriptionFormDuration">Duration</label>
                 </div>
             </div>
        </div>
     </div>
            <div>
            <!-- Sign in button -->
            <div class="col-lg-12">
                <button type="submit" name="btnSubmit"  class="btn white-text btn-rounded btn-sm my-0 btn-lg" style="background-color: #4b3e8a; width:20%;">Submit</button>
            </div>
            </div>
           
        </form>
        <% System.out.println(" niche vale if k uper he");
          
                 String  qryid="Select * from coursemanagement" ;
                 ResultSet rsid = SqlUtil.read(qryid);
                 System.out.println("sqlutil k bad");
                 int num=0;
                 String courseid=null;
            if(rsid.next()){
                   String qry2="select max(serialno) as no from coursemanagement";
                   ResultSet ps=SqlUtil.read(qry2);
                         if(ps.next()){
                              String max= ps.getString("no");
                              int big= Integer.parseInt(max);
                              big=big+1;
                              courseid="course"+big;
                               System.out.println("1 while k andar");
                         }   
            }
                        else
                         {
                           System.out.println("else vali");
                              courseid="course"+1;
                          }
      %>
      
      
      
      <%
                 if(request.getParameter("btnSubmit")!=null) {
                           String course=    request.getParameter("course");
                           String duration= request.getParameter("duration");
               System.out.println("if k andar he");
              
                 SqlUtil.connectDatabase();
                  System.out.println("db conn");
          String qry="insert into coursemanagement(course,duration,courseid) values(' " + course+" ', ' "+duration+" ',' "+ courseid+" ')";
             int rs=SqlUtil.insert(qry);
              System.out.println("insert ho gya");
                  
                    if(rs>0){
                       System.out.println("hello");
                                  }
                             
              
                            }
               

        %>
       
        
              
                                         </div>
                                </div>
                          </div>
                    </div>
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
        
        new WOW().init()
    </script>
<script>
 function  remove(id){
        document.getElementById("courseid").value=id;
        }
</script>
           
                <div class="drag-target" style="left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>




<div class="hiddendiv common"></div></body>
    </body>
</html>

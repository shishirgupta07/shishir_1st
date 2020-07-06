package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Material Design Bootstrap Template</title>\n");
      out.write("   \n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/ico\" href=\"question.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.min.css\" integrity=\"sha256-UzFD2WYH2U1dQpKDjjZK72VtPeWP50NoJjd26rnAdUI=\" crossorigin=\"anonymous\" />\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link  rel=\"stylesheet\" type=\"text/css\" href=\"compiled.css\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #middlediv{\n");
      out.write("                height: 120px;\n");
      out.write("                }\n");
      out.write("                #slide-out{\n");
      out.write("                    background-color:#4b3e8a;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("        </style>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body  class=\"\">\n");
      out.write("       \n");
      out.write("        <!-- Sidebar navigation -->\n");
      out.write("        <ul id=\"slide-out\" class=\"side-nav fixed  custom-scrollbar \" style=\"width: 240px; transform: translateX(0%)\" >\n");
      out.write("            <!-- Logo -->\n");
      out.write("           \n");
      out.write("            <!-- Side navigation links -->\n");
      out.write("            <li>\n");
      out.write("                <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\" ><i class=\"fa fa-home white-text\" sytle=\"width:10px\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Home</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-chalkboard-teacher white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Manage Instructors</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\"><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-question-circle white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Manage Questions</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-graduation-cap white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Manage Courses</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"\"><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-swatchbook white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Manage Subjects</a>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"\"><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-book white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Manage Units</a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                     <li class=\"\"><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-file-alt white-text\"></i>&nbsp;&nbsp;&nbsp;&nbsp;Papers</i></a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <!--/. Side navigation links -->\n");
      out.write("            <div class=\"sidenav-bg mask-strong\"></div>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--/. Sidebar navigation -->\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("       <nav class=\"navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav\">\n");
      out.write("            <!-- SideNav slide-out button -->\n");
      out.write("           \n");
      out.write("            \n");
      out.write("                <a href=\"#\" data-activates=\"slide-out\" class=\" button-collapse\" style=\"color:#4b3e8a; width: 17%\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                \n");
      out.write("                <a class=\"navbar-brand\" Style=\"color: #4b3e8a; \"ref=\"#\"> <i class=\"fas fa-book-reader prefix  fa-lg\"></i><b>&nbsp;&nbsp;&nbsp;&nbsp;Instructor Management</b></a>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <button type=\"button\" class=\"btn btn-rounded white-text ml-auto\" style=\"background-color:#4b3e8a\"><i class=\"fas fa-sign-out-alt\"></i>Logout</button>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("            \n");
      out.write("       </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" id=\"middlediv\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<div class=\"container\" id=\"maincontainer\"> \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("           <div class=\"col-lg-9\">   \n");
      out.write("                <div class=\"container\" id=\"container\"></div>      \n");
      out.write("\n");
      out.write("  <ul class=\"nav nav-tabs nav-justified md-tabs\" style=\"background-color:#4b3e8a;\"id=\"myTabJust\" role=\"tablist\">\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link active\" id=\"home-tab-just\" data-toggle=\"tab\" href=\"#home-just\" role=\"tab\" aria-controls=\"home-just\"\n");
      out.write("      aria-selected=\"true\">View Instructors</a>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link\" id=\"profile-tab-just\" data-toggle=\"tab\" href=\"#profile-just\" role=\"tab\" aria-controls=\"profile-just\"\n");
      out.write("      aria-selected=\"false\">Add Instructors</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("<div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\n");
      out.write("  <div class=\"tab-pane fade show active\" id=\"home-just\" role=\"tabpanel\" aria-labelledby=\"home-tab-just\">\n");
      out.write("    <!-- Editable table -->\n");
      out.write("<div class=\"card\">\n");
      out.write("  <h3 class=\"card-header text-center font-weight-bold white-text text-uppercase py-4\" id='card-header' style=\"background-color:#4b3e8a;\">View Instructor's Details</h3>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <div id=\"table\" class=\"table-editable\">\n");
      out.write("      <form method=\"post\" name=\"form\">\n");
      out.write("      <table class=\"table table-bordered table-responsive-md table-striped text-center\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th class=\"text-center\">Instructor Id</th>\n");
      out.write("            <th class=\"text-center\">Name</th>\n");
      out.write("             <th class=\"text-center\" id=\"dob\">Date of birth</th>\n");
      out.write("            <th class=\"text-center\">Email</th>\n");
      out.write("            <th class=\"text-center\">Mobile Number</th>\n");
      out.write("             <th class=\"text-center\" id=\"state\">State</th>\n");
      out.write("              <th class=\"text-center\" id=\"city\">city</th>\n");
      out.write("           \n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("           ");
 String uid=request.getParameter("id");
                               
               SqlUtil.connectDatabase();
               String qre="select * from instructor where instructor_id='"+uid+"'";
                ResultSet sr=SqlUtil.read(qre);
                              
           if( sr.next()){
      out.write("\n");
      out.write("          <tr>");
 String id=sr.getString("instructor_id");
                                    System.out.println(id);
               String str1=sr.getString("firstname"); String str2=sr.getString("lastname");
                                   System.out.println("after firstname");
                 String email=sr.getString("email");
                                   System.out.println(email);
                   String mobile=sr.getString("Mobile"); 
                    java.sql.Date sqldate=sr.getDate("dob"); 
                    Date dt= new Date(sqldate.getTime());
                    String state=sr.getString("state"); 
                    String city=sr.getString("city"); 
                                  System.out.println(city);
 
      out.write("\n");
      out.write("              <td >");
      out.print(id);
      out.write("</td>\n");
      out.write("               <td > ");
      out.print(str1+" "+str2);
      out.write("</td>\n");
      out.write("               <td >");
      out.print(dt);
      out.write("</td>\n");
      out.write("              <td >");
      out.print(email);
      out.write("</td>\n");
      out.write("              <td >");
      out.print(mobile);
      out.write(" </td>\n");
      out.write("              <td >");
      out.print(state);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(city);
      out.write("</td>\n");
      out.write("             \n");
      out.write("                       \n");
      out.write("\n");
      out.write("   \n");
      out.write("          </tr>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("          <!-- This is our clonable table line -->\n");
      out.write("         \n");
      out.write("          <!-- This is our clonable table line -->\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <!-- This is our clonable table line -->\n");
      out.write("          \n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");

   
            
               SqlUtil.connectDatabase();
                String qry="select count(*) from instructor";
                ResultSet rs=SqlUtil.count(qry);
                String instaid=null;
               if(rs.next()){
               String nos=rs.getString("count(*)");
               
               int number=Integer.parseInt(nos);
               System.out.println( number);
               
                if(number>=1){
                   number= number+1;
                 instaid="instructor@"+number;
                
               }
                else{
                instaid="instructor@"+1;
                System.out.println("1 wala");
                }
               }
        



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"tab-pane fade\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\n");
      out.write("    <!-- Material form subscription -->\n");
      out.write("<div class=\"card\">\n");
      out.write("\n");
      out.write("    <h5 class=\"card-header white-text text-center py-4\" id=\"addInstructor\" style=\"background-color:#4b3e8a\">\n");
      out.write("        <strong>Add Details of Instructor</strong>\n");
      out.write("    </h5>\n");
      out.write("\n");
      out.write("    <!--Card content-->\n");
      out.write("    <div class=\"card-body px-lg-5\">\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form  class=\"text-center\" style=\"color: white\" method=\"post\">\n");
      out.write("\n");
      out.write("           <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <i class=\"fas fa-user-edit prefix \" style=\"font-size:20px;color:#4b3e8a\"></i>\n");
      out.write("                <input type=\"text\" id=\"materialSubscriptionFormInstructor\" class=\"form-control\" value=\"");
      out.print( instaid);
      out.write("\" name=\"Instructor\" readonly>\n");
      out.write("                    <label for=\"materialSubscriptionFormInstructor\">Instructor Id</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-user prefix\" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("                <input type=\"text\" id=\"materialSubscriptionFormFirstName\"  name=\"FirstName\" class=\"form-control\" >\n");
      out.write("                    <label for=\"materialSubscriptionFormFirstName\">First Name</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div> \n");
      out.write("           <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-edit prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("                <input type=\"text\" id=\"materialSubscriptionFormLastName\" name=\"LastName\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormLastName\">Last Name</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div>     \n");
      out.write("           </div>\n");
      out.write("         <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <i class=\"fas fa-key prefix\" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("                <input type=\"password\" id=\"materialSubscriptionFormPassword\" name=\"Password\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormPassword\">Password</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-key prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("               <input type=\"password\" id=\"materialSubscriptionFormConPassword\" name=\"ConPassword\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormConPassword\">Confirm Password</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div> \n");
      out.write("        </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <i class=\"fas fa-calendar-alt prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("                <input type=\"Date\" id=\"materialSubscriptionFormDob\" name=\"Dob\" class=\"form-control\">\n");
      out.write("                <label for=\"materialSubscriptionFormDob\"></label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-envelope prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("                <input type=\"email\" id=\"materialSubscriptionFormEmail\" name=\"Email\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormEmail\">Email</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div> \n");
      out.write("        </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            <i class=\"fas fa-mobile-alt prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("               <input type=\"text\" id=\"materialSubscriptionFormMobile\" name=\"Mobile\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormMobile\">Mobile Number</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-map-marker-alt prefix \" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("               <input type=\"text\" id=\"materialSubscriptionFormState\" name=\"State\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormState\">State</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div> \n");
      out.write("        </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("               <i class=\"fas fa-city prefix\" style=\"font-size:20px;color: #4b3e8a\"></i>\n");
      out.write("              <input type=\"text\" id=\"materialSubscriptionFormCity\" name=\"City\" class=\"form-control\">\n");
      out.write("                    <label for=\"materialSubscriptionFormCity\">City</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("            <!-- Sign in button -->\n");
      out.write("            <button class=\"btn white-text btn-sm\" type=\"submit\" name=\"submit\" style=\"background-color:#4b3e8a\">Add</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <!-- Form -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<!-- Material form subscription -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("           </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        <!-- /.Navbar -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap tooltips -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        // SideNav Initialization\n");
      out.write("        $(\".button-collapse\").sideNav();\n");
      out.write("        \n");
      out.write("        new WOW().init();\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("        ");

              if(request.getParameter("submit")!=null){
              try{
                 String Instructor=    request.getParameter("Instructor");
                String FirstName=    request.getParameter("FirstName");
                String LastName=    request.getParameter("LastName");
                 String Password=    request.getParameter("Password");
                 String ConPassword=   request.getParameter("ConPassword");
                 String Dob=    request.getParameter("Dob");
                 String Email=    request.getParameter("Email");
                 String Mobile=    request.getParameter("Mobile");
                  String State=    request.getParameter("State");
                   String City=    request.getParameter("City");
                 Date dt=null;
        
         try {
             dt = new SimpleDateFormat("yyyy-mm-dd").parse(Dob);
         } catch (ParseException ex) {
      out.write("\n");
      out.write("         <h1 id='parsing'>you haven't entered date of birth</h1>\n");
      out.write("        \n");
      out.write("         ");
}
               java.sql.Date sqldate=new java.sql.Date(dt.getTime()); 
              String instructor_id=null;      
                
           
                SqlUtil.connectDatabase();
               
                String qri="insert into instructor values('"+ Instructor+"','"+FirstName+"','"+LastName+"','"+Password+"','"+sqldate+"','"+Email+"','"+Mobile+"','"+State+"','"+City+"')";
                 int no=SqlUtil.insert(qri);
                if(no>0){
                response.sendRedirect("instructor_management.jsp");
              
                
                 }
                    else{
               
      out.write("\n");
      out.write("                <h1>error in insertion</h1>\n");
      out.write("                ");
 }
                 } 
                catch (Exception e) {
      out.write("\n");
      out.write("                <h1 id=\"nullpointer\">you haven't field all the entries</h1>\n");
      out.write("                ");
}

                }
                
      out.write("\n");
      out.write(" \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

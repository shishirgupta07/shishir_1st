package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbc.SqlUtil;

public final class Manage_0020Course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("             <title>JSP Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/brands.min.css\" integrity=\"sha256-u8123o+sLy8uk0Du9H0Ub+KinAoHanzGsBqDkWHY1f8=\" crossorigin=\"anonymous\" >\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("              <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("              <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("               <link  rel=\"stylesheet\"  type=\"text/css\" href=\"compiler.css\">\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("     <ul id=\"slide-out\" class=\"side-nav fixed custom-scrollbar r\" style=\"background-color:#4b3e8a\"transform: translateX(0%);\">\n");
      out.write("            <!-- Logo -->\n");
      out.write("            <li>\n");
      out.write("             <br><br>\n");
      out.write("<!--                <div class=\"logo-wrapper waves-light waves-effect waves-light\">\n");
      out.write("                    <a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\"><img src=\"./test_files/mdb-transparent.png\" class=\"img-fluid flex-center\"></a>\n");
      out.write("                </div>-->\n");
      out.write("            </li>\n");
      out.write("         \n");
      out.write("            <li>\n");
      out.write("<!--                <form class=\"search-form\" role=\"search\">\n");
      out.write("                    <div class=\"form-group waves-light waves-effect waves-light\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    </div>\n");
      out.write("                </form>-->\n");
      out.write("            </li>\n");
      out.write("            <!--/.Search Form-->\n");
      out.write("            <!-- Side navigation links -->\n");
      out.write("            <li>\n");
      out.write("                <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-home  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Submit listing</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Registration form</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-chalkboard-teacher  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">For bloggers</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">For authors</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-question  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Introduction</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Monthly meetings</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>  <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-graduation-cap  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-swatchbook white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-book white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-file-alt white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                        <div class=\"collapsible-body\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <!--/. Side navigation links -->\n");
      out.write("            <div class=\"sidenav-bg mask-strong\"></div>\n");
      out.write("        </ul>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <nav class=\"navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav top-nav-collapse\">\n");
      out.write("            <!-- SideNav slide-out button -->\n");
      out.write("            \n");
      out.write("                <a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" data-activates=\"slide-out\" class=\"button-collapse black-text\" style=\"width:18%\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("                <a class=\"navbar-brand  \" style=\"color:#4b3e8a \"  href=\"#\"><i class=\"fas fa-book-reader  prefix   fa-lg  \">&nbsp &nbsp</i> \n");
      out.write("                         course management</a>\n");
      out.write("    \n");
      out.write("                        <button type=\"button\" class=\"btn   btn-rounded ml-auto\"style=\"background-color:#4b3e8a;width: 133px; height: 35px; color:white\"><i class=\"fas fa-sign-out-alt \"></i>Logout</button>\n");
      out.write("            \n");
      out.write("            <!-- Breadcrumb-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"container\" style=\"height: 49px;\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\"> \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("               \n");
      out.write("               <div class=\"col-lg-9\">\n");
      out.write("                         <div style=\"height: 33px;\">\n");
      out.write("            \n");
      out.write("                         </div>\n");
      out.write("                    <br>\n");
      out.write("                      <ul class=\"nav nav-tabs nav-justified md-tabs\" style=\"background-color: #4b3e8a\" id=\"myTabJust\" role=\"tablist\">\n");
      out.write("                           <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active \" id=\"home-tab-just\" data-toggle=\"tab\" href=\"#home-just\" role=\"tab\" aria-controls=\"home-just\"\n");
      out.write("                                aria-selected=\"true\">view course</a>\n");
      out.write("                          </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" id=\"profile-tab-just\" data-toggle=\"tab\" href=\"#profile-just\" role=\"tab\" aria-controls=\"profile-just\"\n");
      out.write("                                  aria-selected=\"false\">add course</a>\n");
      out.write("                              </li>\n");
      out.write("                    </ul>\n");
      out.write("                            <div style=\"height:5px;\">\n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("                 <div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\n");
      out.write("    \n");
      out.write("                     <div class=\"tab-pane fade show active\" id=\"home-just\" role=\"tabpanel\" aria-labelledby=\"home-tab-just\">\n");
      out.write("      <!-- Editable table -->\n");
      out.write("                       <div class=\"card \"  >\n");
      out.write("                                             <h5 style=\"background-color:#4b3e8a\" class=\"card-header  text-center white-text font-weight-bold text-uppercase py-4 \"  > View course and duration</h5>\n");
      out.write("                              <div class=\"card-body\">\n");
      out.write("                                        <div id=\"table\" class=\"table-editable\">\n");
      out.write("                           \n");
      out.write("                                                <table class=\"table table-bordered table-responsive-md table-striped text-center\">\n");
      out.write("                                                        <thead>\n");
      out.write("                                                                     <tr>\n");
      out.write("                                                                                   <th class=\"text-center\">Course Name</th>\n");
      out.write("                                                                                   <th class=\"text-center\">duration</th>\n");
      out.write("                                                                                   <th class=\"text-center\">Option</th>\n");
      out.write("                                                                     </tr>\n");
      out.write("                                                        </thead>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("   <tbody>\n");
      out.write("           ");

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
    
      out.write("\n");
      out.write("               <tr> \n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(course );
      out.write("\n");
      out.write("             </td>\n");
      out.write("               <td>\n");
      out.write("                   ");
      out.print(duration);
      out.write("\n");
      out.write("               </td>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("                <td> \n");
      out.write("                <span class=\"table-remove  white-text\"><a href=\"edit2.jsp?idc=");
      out.print( rss.getString("courseid"));
      out.write("\"><button type=\"button\" style=\"background-color:#4b3e8a; color:white \"\n");
      out.write("                                                               class=\"btn-rounded btn-sm my-0 \" >Update</button></a></span>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                  <span class=\" \" style=\"width: 20px\"> </span>\n");
      out.write("                  <span class=\"table-remove white-text\"><!-- Button trigger modal -->\n");
      out.write("                       <a onclick=\"remove('");
      out.print( rss.getString("courseid"));
      out.write("')\"> <button type=\"button\" style=\"background-color:#4b3e8a; color:white \" class=\" btn-rounded btn-sm\" data-toggle=\"modal\" data-target=\"#basicExampleModal\">\n");
      out.write("                        Remove\n");
      out.write("                           </button></a>\n");
      out.write("\n");
      out.write("                  </span>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("              ");
   }
               
      out.write("\n");
      out.write("               \n");
      out.write("<!-- Modal -->\n");
      out.write("<form action=\"remove.jsp \"  method=\"post\">\n");
      out.write("                 <div class=\"modal fade\" id=\"basicExampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("                                    aria-hidden=\"true\">\n");
      out.write("                       <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                               <div class=\"modal-content\">\n");
      out.write("                                       <div class=\"modal-header\">\n");
      out.write("                                           <h3 class=\"modal-title\" id=\"exampleModalLabel\" style=\"color:black\">do you want to delete?</h3>\n");
      out.write("                                           <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                                 </div>\n");
      out.write("                                   \n");
      out.write("                                     <div class=\"modal-body\">\n");
      out.write("                                         <h2 style=\"color:black\">  </h2>\n");
      out.write("                                      </div>\n");
      out.write("                                       <div class=\"modal-footer\">\n");
      out.write("                                           <input type=\"hidden\" id=\"courseid\" name=\"cid\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-indigo btn-rounded btn-sm\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                         <button type=\"submit\" class=\"btn  btn-rounded btn-sm btn-indigo\">confirm</button> \n");
      out.write("                                        </div>\n");
      out.write("                               </div>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("</form>\n");
      out.write("                      </td>\n");
      out.write("            \n");
      out.write("                </tr>  \n");
      out.write("                    </tbody>\n");
      out.write("                               \n");
      out.write("        \n");
      out.write("       \n");
      out.write("                </table>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("<!-- Editable table --> \n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write(" <div class=\"tab-pane fade\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\n");
      out.write("            \n");
      out.write("      <!-- Material form subscription -->\n");
      out.write("        <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-heade  white-text text-center py-4  \" style=\"background-color: #4b3e8a\">\n");
      out.write("                    <strong>Add course here</strong>\n");
      out.write("                    </h5>\n");
      out.write("    <!--Card content-->\n");
      out.write("                    <div class=\"card-body px-lg-5\">\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("                         <form class=\"text-center\" style=\"color: #757575;\" method=\"post\">\n");
      out.write("\n");
      out.write("           \n");
      out.write("                        <div class=\"row\">\n");
      out.write("            <!-- Name -->\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"md-form\"> \n");
      out.write("               \n");
      out.write("                                              <div class=\"row\">\n");
      out.write("                                                               <i class=\"fas fa-stopwatch prefix \" style=\"color: #4b3e8a\"></i>   \n");
      out.write("                                                                 <input type=\"text\" id=\"materialSubscriptionFormCourseName\" name=\"course\" class=\"form-control\">\n");
      out.write("                                                                 <label for=\"materialSubscriptionFormCourseName\">Course name</label>\n");
      out.write("                                                 </div>\n");
      out.write("                                     </div>\n");
      out.write("             \n");
      out.write("                            </div>\n");
      out.write("            <!-- E-mai -->\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <i class=\"fas fa-stopwatch prefix\" style=\"color: #4b3e8a\"></i>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                                <input type=\"text\" id=\"materialSubscriptionFormDuration\" name=\"duration\" class=\"form-control\">\n");
      out.write("                                 <label for=\"materialSubscriptionFormDuration\">Duration</label>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("            <div>\n");
      out.write("            <!-- Sign in button -->\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <button type=\"submit\" name=\"btnSubmit\"  class=\"btn white-text btn-rounded btn-sm my-0 btn-lg\" style=\"background-color: #4b3e8a; width:20%;\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("        ");
 System.out.println(" niche vale if k uper he");
          
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
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      ");

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
               

        
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("              \n");
      out.write("                                         </div>\n");
      out.write("                                </div>\n");
      out.write("                          </div>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- JQuery -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap tooltips -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"./test_files/compiled.min.js.download\"></script>-->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("   \n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("         // SideNav Initialization\n");
      out.write("        $(\".button-collapse\").sideNav();\n");
      out.write("        \n");
      out.write("        new WOW().init()\n");
      out.write("    </script>\n");
      out.write("<script>\n");
      out.write(" function  remove(id){\n");
      out.write("        document.getElementById(\"courseid\").value=id;\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("           \n");
      out.write("                <div class=\"drag-target\" style=\"left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hiddendiv common\"></div></body>\n");
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

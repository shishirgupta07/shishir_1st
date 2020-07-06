package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.SqlUtil;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("         <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/brands.min.css\" integrity=\"sha256-u8123o+sLy8uk0Du9H0Ub+KinAoHanzGsBqDkWHY1f8=\" crossorigin=\"anonymous\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Material Design Bootstrap -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link  rel=\"stylesheet\"  type=\"text/css\" href=\"compiler.css\">\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("     <ul id=\"slide-out\" class=\"side-nav fixed custom-scrollbar r\" style=\"background-color:#4b3e8a\"transform: translateX(0%);\">\r\n");
      out.write("            <!-- Logo -->\r\n");
      out.write("            <li>\r\n");
      out.write("             <br><br>\r\n");
      out.write("<!--                <div class=\"logo-wrapper waves-light waves-effect waves-light\">\r\n");
      out.write("                    <a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\"><img src=\"./test_files/mdb-transparent.png\" class=\"img-fluid flex-center\"></a>\r\n");
      out.write("                </div>-->\r\n");
      out.write("            </li>\r\n");
      out.write("         \r\n");
      out.write("            <li>\r\n");
      out.write("<!--                <form class=\"search-form\" role=\"search\">\r\n");
      out.write("                    <div class=\"form-group waves-light waves-effect waves-light\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>-->\r\n");
      out.write("            </li>\r\n");
      out.write("            <!--/.Search Form-->\r\n");
      out.write("            <!-- Side navigation links -->\r\n");
      out.write("            <li>\r\n");
      out.write("                <ul class=\"collapsible collapsible-accordion\">\r\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-home  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Home<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Submit listing</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Registration form</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-chalkboard-teacher  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Instruction<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">For bloggers</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">For authors</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-question  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Question<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Introduction</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Monthly meetings</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>  <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-graduation-cap  white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Course<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-swatchbook white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Subject<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-book white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Manage Units<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                      <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-file-alt white-text\"></i>&nbsp&nbsp&nbsp&nbsp&nbsp Papers<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                        <div class=\"collapsible-body\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" class=\"waves-effect\">Write a message</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <!--/. Side navigation links -->\r\n");
      out.write("            <div class=\"sidenav-bg mask-strong\"></div>\r\n");
      out.write("        </ul>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <nav class=\"navbar fixed-top navbar-toggleable-md white navbar-expand-lg scrolling-navbar double-nav top-nav-collapse\">\r\n");
      out.write("            <!-- SideNav slide-out button -->\r\n");
      out.write("            \r\n");
      out.write("                <a href=\"https://mdbootstrap.com/live/_MDB/index/docs/skins/white-skin.html#\" data-activates=\"slide-out\" class=\"button-collapse black-text\" style=\"width:18%\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                <a class=\"navbar-brand  \" style=\"color:#4b3e8a \"  href=\"#\"><i class=\"fas fa-book-reader  prefix   fa-lg  \">&nbsp &nbsp</i> \r\n");
      out.write("                         course management</a>\r\n");
      out.write("    \r\n");
      out.write("                        <button type=\"button\" class=\"btn   btn-rounded ml-auto\"style=\"background-color:#4b3e8a;width: 133px; height: 35px; color:white\"><i class=\"fas fa-sign-out-alt \"></i>Logout</button>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Breadcrumb-->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </nav>\r\n");
      out.write("         </div>\r\n");
      out.write("    <div class=\"container\" style=\"height: 49px;\">\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\"> \r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3\">\r\n");
      out.write("                         </div>\r\n");
      out.write("    \r\n");
      out.write("               \r\n");
      out.write("                <div class=\"col-lg-9\">\r\n");
      out.write("                         <div style=\"height: 33px;\">\r\n");
      out.write("            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                      <ul class=\"nav nav-tabs nav-justified md-tabs\" style=\"background-color: #4b3e8a\" id=\"myTabJust\" role=\"tablist\">\r\n");
      out.write("                           <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link active \" id=\"home-tab-just\" data-toggle=\"tab\" href=\"#home-just\" role=\"tab\" aria-controls=\"home-just\"\r\n");
      out.write("                                aria-selected=\"true\">view course</a>\r\n");
      out.write("                          </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" id=\"profile-tab-just\" data-toggle=\"tab\" href=\"#profile-just\" role=\"tab\" aria-controls=\"profile-just\"\r\n");
      out.write("                                  aria-selected=\"false\">add course</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                            <div style=\"height:5px;\">\r\n");
      out.write("    \r\n");
      out.write("                            </div>\r\n");
      out.write("<div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\r\n");
      out.write("    \r\n");
      out.write("                <div class=\"tab-pane fade show active\" id=\"home-just\" role=\"tabpanel\" aria-labelledby=\"home-tab-just\">\r\n");
      out.write("      <!-- Editable table -->\r\n");
      out.write("      <div class=\"card \"  >\r\n");
      out.write("          <h5 style=\"background-color:#4b3e8a\" class=\"card-header  text-center white-text font-weight-bold text-uppercase py-4 \"  > View course and duration</h5>\r\n");
      out.write("                  <div class=\"card-body\">\r\n");
      out.write("                       <div id=\"table\" class=\"table-editable\">\r\n");
      out.write("                            <form method=\"post\">\r\n");
      out.write("                                <table class=\"table table-bordered table-responsive-md table-striped text-center\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                 <tr>\r\n");
      out.write("                        <th class=\"text-center\">Course Name</th>\r\n");
      out.write("                    <th class=\"text-center\">duration</th>\r\n");
      out.write("                    <th class=\"text-center\">Option</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                      \r\n");
      out.write("         \r\n");
      out.write("        <tbody>\r\n");
      out.write("            ");

                
            String idc= request.getParameter("idc");
           SqlUtil.connectDatabase();
         String  qrys="Select * from coursemanagement where id="+idc ;
           ResultSet rss = SqlUtil.read(qrys);
           System.out.println("2 sqlutil");
             String id =rss.getString("courseid");    
           while( rss.next()){
                
      out.write("\r\n");
      out.write("               \r\n");
      out.write("<input type=\"text\" name=\"idc\" value=\"");
      out.print(rss.getString("courseid") );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"course\" value=\"");
      out.print(rss.getString("course") );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"duration\" value=\"");
      out.print(rss.getString("duration") );
      out.write("\">\r\n");
      out.write("<input type=\"submit\" placeholder=\"update\" >\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          ");

                    }
               {
              String course =rss. getString("course");
            String duration =rss.getString("duration");
    
      out.write("\r\n");
      out.write("               <tr> \r\n");
      out.write("               <td>\r\n");
      out.write("                   ");
      out.print(course );
      out.write("\r\n");
      out.write("             </td>\r\n");
      out.write("               <td>\r\n");
      out.write("                   ");
      out.print(duration);
      out.write("\r\n");
      out.write("               </td>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("                </tr>\r\n");
      out.write("              ");
   }
}     catch (SQLException ex) {
          Logger.getLogger(update_jsp.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(update_jsp.class.getName()).log(Level.SEVERE, null, ex);
      }
               
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("        </tbody>\r\n");
      out.write("                               \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </table>\r\n");
      out.write("       </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Editable table --> \r\n");
      out.write("    \r\n");
      out.write("     </div>\r\n");
      out.write("  <div class=\"tab-pane fade\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\r\n");
      out.write("            \r\n");
      out.write("      <!-- Material form subscription -->\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("\r\n");
      out.write("    <h5 class=\"card-heade  white-text text-center py-4  \" style=\"background-color: #4b3e8a\">\r\n");
      out.write("        <strong>Add course here</strong>\r\n");
      out.write("    </h5>\r\n");
      out.write("    <!--Card content-->\r\n");
      out.write("    <div class=\"card-body px-lg-5\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Form -->\r\n");
      out.write("        <form class=\"text-center\" style=\"color: #757575;\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            <!-- Name -->\r\n");
      out.write("          <div class=\"col-lg-6\">\r\n");
      out.write("            <div class=\"md-form\"> \r\n");
      out.write("               \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <i class=\"fas fa-stopwatch prefix \" style=\"color: #4b3e8a\"></i>   \r\n");
      out.write("                <input type=\"text\" id=\"materialSubscriptionFormCourseName\" name=\"course\" class=\"form-control\">\r\n");
      out.write("                <label for=\"materialSubscriptionFormCourseName\">Course name</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("             \r\n");
      out.write("                </div>\r\n");
      out.write("            <!-- E-mai -->\r\n");
      out.write("             <div class=\"col-lg-6\">\r\n");
      out.write("            <div class=\"md-form\"> \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                        <i class=\"fas fa-stopwatch prefix\" style=\"color: #4b3e8a\"></i>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                        <input type=\"text\" id=\"materialSubscriptionFormDuration\" name=\"duration\" class=\"form-control\">\r\n");
      out.write("                <label for=\"materialSubscriptionFormDuration\">Duration</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("            <!-- Sign in button -->\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <button type=\"submit\" name=\"btnSubmit\"  class=\"btn white-text btn-rounded btn-sm my-0 btn-lg\" style=\"background-color: #4b3e8a; width:20%;\">Submit</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("        </form>\r\n");
      out.write("        ");
 System.out.println(" niche vale if k uper he");
          
                 if(request.getParameter("btnSubmit")!=null) {
       
                           String course=    request.getParameter("course");
                           String duration= request.getParameter("duration");
               System.out.println("if k andar he");
              
    
    
        try{
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("             </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!-- Form -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Material form subscription -->\r\n");
      out.write("<!-- Default form grid -->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("                  </div>\r\n");
      out.write("    \r\n");
      out.write("                     </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div> \r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <!-- JQuery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap tooltips -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap core JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- MDB core JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\r\n");
      out.write("<!--    <script type=\"text/javascript\" src=\"./test_files/compiled.min.js.download\"></script>-->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("         // SideNav Initialization\r\n");
      out.write("        $(\".button-collapse\").sideNav();\r\n");
      out.write("        \r\n");
      out.write("        new WOW().init();\r\n");
      out.write("    \r\n");
      out.write("    </script><div class=\"drag-target\" style=\"left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"hiddendiv common\"></div></body></html>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } 
catch (Throwable t) {
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
}
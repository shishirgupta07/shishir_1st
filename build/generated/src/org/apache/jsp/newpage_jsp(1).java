package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class newpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.min.css\" integrity=\"sha256-UzFD2WYH2U1dQpKDjjZK72VtPeWP50NoJjd26rnAdUI=\" crossorigin=\"anonymous\" />\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write(" <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write(" <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
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
      out.write("                .column{\n");
      out.write("                   height: 20px;\n");
      out.write("                    width: 100px;  \n");
      out.write("                }\n");
      out.write("                .form-control{\n");
      out.write("                    height: 20px;\n");
      out.write("                    width: 100px;\n");
      out.write("                }\n");
      out.write("                #course_id{\n");
      out.write("                   height: 20px;\n");
      out.write("                    width: 100px;    \n");
      out.write("                }\n");
      out.write("   </style>\n");
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
      out.write("    <div class=\"container\">\n");
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
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\" id=\"middlediv\">\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\" id=\"maincontainer\"> \n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-3\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-9\">   \n");
      out.write("            <div class=\"container\" id=\"\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("            <form id=\"form\">\n");
      out.write("              <table class=\"table table-hover\">\n");
      out.write("                <tr class=\"row\">\n");
      out.write("                   <td class=\"column\">\n");
      out.write("                      <select  id=\"course_id\">\n");
      out.write("                          <option  disabled=\"\" value=\"\" selected=\"\">select course</option>\n");
      out.write("    ");
 
               SqlUtil.connectDatabase();
                String qry="select * from courses";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
    
      out.write("\n");
      out.write("                           <option  value=\"");
      out.print(rs.getString("id"));
      out.write("\" selected=\"\">");
      out.print(rs.getString("course_name"));
      out.write("</option>\n");
      out.write("    ");
}
      out.write("    \n");
      out.write("                       </select>\n");
      out.write("                     </td>\n");
      out.write("                     <td class=\"column\">\n");
      out.write("                        <select  name=\"subject\" >\n");
      out.write("                           <option value=\"\">select subject</option>\n");
      out.write("                        </select>\n");
      out.write("                     </td>\n");
      out.write("                     <td class=\"column\">\n");
      out.write("                         <select  name=\"unit\">\n");
      out.write("                            <option value=\"\">select unit</option>  \n");
      out.write("                         </select>\n");
      out.write("                     </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>\n");
      out.write("                      <input type=\"submit\" name=\"submit\">\n");
      out.write("                   </td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap tooltips -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js\"></script>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("    ");
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

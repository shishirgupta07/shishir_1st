package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbc.SqlUtil;

public final class edit2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/brands.min.css\" integrity=\"sha256-u8123o+sLy8uk0Du9H0Ub+KinAoHanzGsBqDkWHY1f8=\" crossorigin=\"anonymous\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link  rel=\"stylesheet\"  type=\"text/css\" href=\"compiler.css\">\n");
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
      out.write("         </div>\n");
      out.write("    <div class=\"container\" style=\"height: 49px;\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\"> \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                         </div>\n");
      out.write("    \n");
      out.write("               \n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                         <div style=\"height: 33px;\">\n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("                    <br>\n");
      out.write("                      <ul class=\"nav nav-tabs nav-justified md-tabs\" style=\"background-color: #4b3e8a\" id=\"myTabJust\" role=\"tablist\">\n");
      out.write("                          \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" id=\"profile-tab-just\" data-toggle=\"tab\" href=\"#profile-just\" role=\"tab\" aria-controls=\"profile-just\"\n");
      out.write("                                  aria-selected=\"false\">click here to add course</a>\n");
      out.write("                              </li>\n");
      out.write("                    </ul>\n");
      out.write("                            <div style=\"height:5px;\">\n");
      out.write("    \n");
      out.write("                            </div>\n");
      out.write("<div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\n");
      out.write("    \n");
      out.write("               \n");
      out.write("    \n");
      out.write("     \n");
      out.write("  <div class=\"tab-pane fade show active\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\n");
      out.write("            \n");
      out.write("      <!-- Material form subscription -->\n");
      out.write("<div class=\"card\">\n");
      out.write("\n");
      out.write("    <h5 class=\"card-heade  white-text text-center py-4  \" style=\"background-color: #4b3e8a\">\n");
      out.write("        <strong>Add course here</strong>\n");
      out.write("    </h5>\n");
      out.write("    <!--Card content-->\n");
      out.write("    <div class=\"card-body px-lg-5\">\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form class=\"text-center\" action=\"update2.jsp\" style=\"color: #757575;\" method=\"post\">\n");
      out.write("\n");
      out.write("            ");

            String uid= request.getParameter("idc");
            System.out.println(uid);
            SqlUtil.connectDatabase();
            String sql="Select * from coursemanagement where courseid='"+uid+"' ";
            System.out.println(sql);
            ResultSet rs= SqlUtil.read(sql);
           while(rs.next()){
               
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <!-- Name -->\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form\"> \n");
      out.write("               \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-stopwatch prefix \" style=\"color: #4b3e8a\"></i>   \n");
      out.write("                <input type=\"text\" id=\"materialSubscriptionFormCourseName\" name=\"course\" value=\"");
      out.print(rs.getString("course"));
      out.write("\" class=\"form-control\">\n");
      out.write("                <label for=\"materialSubscriptionFormCourseName\">Course name</label>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("            <!-- E-mai -->\n");
      out.write("             <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <i class=\"fas fa-stopwatch prefix\" style=\"color: #4b3e8a\"></i>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                        <input type=\"text\" id=\"materialSubscriptionFormDuration\" value=\"");
      out.print( rs.getString("duration"));
      out.write("\" name=\"duration\" class=\"form-control\">\n");
      out.write("                <label for=\"materialSubscriptionFormDuration\">Duration</label>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"md-form\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <i class=\"fas fa-stopwatch prefix\" style=\"color: #4b3e8a\"></i>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                        <input type=\"text\" id=\"materialSubscriptionFormcourseid\" value=\"");
      out.print( rs.getString("courseid"));
      out.write("\"  name=\"courseid\" class=\"form-control\"  readonly>\n");
      out.write("                <label for=\"materialSubscriptionFormcourseid\"> courseid </label>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            <!-- Sign in button -->\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <button type=\"submit\"   class=\"btn white-text btn-rounded btn-sm my-0 \" value=\"update\" style=\"background-color: #4b3e8a; width:20%;\"> update </button>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("                   ");

                                }
                   
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("        <!-- Form -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- Material form subscription -->\n");
      out.write("<!-- Default form grid -->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("                  </div>\n");
      out.write("    \n");
      out.write("                     </div>\n");
      out.write("            </div>\n");
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
      out.write("        new WOW().init();\n");
      out.write("    \n");
      out.write("    </script><div class=\"drag-target\" style=\"left: 0px; touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hiddendiv common\"></div></body></html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Material Design Bootstrap -->\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("<link  rel=\"stylesheet\"  type=\"text/css\" href=\"compiler.css\">\n");
      out.write("<style>\n");
      out.write("    #class{\n");
      out.write("       height: 62px;\n");
      out.write("    }\n");
      out.write("    #rowa{\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                   <!-- As a link -->\n");
      out.write("                <nav class=\"navbar navbar-dark example z-depth-3\"  id=\"rowa\">\n");
      out.write("                    <a class=\"navbar-brand text-default \"   href=\"#\"><i class=\"fas fa-book-reader  prefix   fa-lg  \"></i> \n");
      out.write("                         course management</a>\n");
      out.write("    \n");
      out.write("                        <button type=\"button\" class=\"btn btn-default btn-rounded ml-auto\"><i class=\"fas fa-sign-out-alt \"></i>Logout</button>\n");
      out.write("                </nav>\n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                         </div>\n");
      out.write("    \n");
      out.write("               \n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                         <div style=\"height: 33px;\">\n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("                    <br>\n");
      out.write("                      <ul class=\"nav nav-tabs nav-justified md-tabs\" id=\"myTabJust\" role=\"tablist\">\n");
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
      out.write("<div class=\"tab-content card pt-5\" id=\"myTabContentJust\">\n");
      out.write("    \n");
      out.write("                <div class=\"tab-pane fade show active\" id=\"home-just\" role=\"tabpanel\" aria-labelledby=\"home-tab-just\">\n");
      out.write("      <!-- Editable table -->\n");
      out.write("                <div class=\"card \" >\n");
      out.write("                             <h5 class=\"card-header default-color text-center white-text font-weight-bold text-uppercase py-4 \" id=\"class\"> View course and duration</h5>\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                       <div id=\"table\" class=\"table-editable\">\n");
      out.write("                                <table class=\"table table-bordered table-responsive-md table-striped text-center\">\n");
      out.write("                    <thead>\n");
      out.write("                 <tr>\n");
      out.write("                        <th class=\"text-center\">Course Name</th>\n");
      out.write("                    <th class=\"text-center\">duration</th>\n");
      out.write("                    <th class=\"text-center\">Option</th>\n");
      out.write("                </tr>\n");
      out.write("                      </thead>\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"pt-3-half\" contenteditable=\"true\">Guerra Cortez</td>\n");
      out.write("            <td class=\"pt-3-half\" contenteditable=\"true\">45</td>\n");
      out.write("            <td>\n");
      out.write("              <span class=\"table-remove\"><button type=\"button\"\n");
      out.write("                  class=\"btn btn-default btn-rounded btn-sm my-0\">Update</button></span>\n");
      out.write("                  <span class=\"table-remove\"><button type=\"button\"\n");
      out.write("                  class=\"btn btn-default  btn-rounded btn-sm my-0\">Remove</button></span>\n");
      out.write("            \n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Editable table --> \n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write("  <div class=\"tab-pane fade\" id=\"profile-just\" role=\"tabpanel\" aria-labelledby=\"profile-tab-just\">\n");
      out.write("            \n");
      out.write("      <!-- Material form subscription -->\n");
      out.write("<div class=\"card\">\n");
      out.write("\n");
      out.write("    <h5 class=\"card-heade default-color white-text text-center py-4 \">\n");
      out.write("        <strong>Add course here</strong>\n");
      out.write("    </h5>\n");
      out.write("    <!--Card content-->\n");
      out.write("    <div class=\"card-body px-lg-5\">\n");
      out.write("\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form class=\"text-center\" style=\"color: #757575;\">\n");
      out.write("\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("            <!-- Name -->\n");
      out.write("            <div class=\"md-form mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <i class=\"fas fa-ad prefix grey-text\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                <input type=\"text \" id=\"materialSubscriptionFormPasswords\" class=\"form-control\">\n");
      out.write("                \n");
      out.write("                <label  for=\"materialSubscriptionFormPasswords\">Course Name</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            <!-- E-mai -->\n");
      out.write("             <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"md-form\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <i class=\"fas fa-stopwatch prefix grey-text\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                \n");
      out.write("                <input type=\"email\" id=\"materialSubscriptionFormEmail\" class=\"form-control\">\n");
      out.write("                <label for=\"materialSubscriptionFormEmail\">Duration</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Sign in button -->\n");
      out.write("             <button type=\"button\"\n");
      out.write("                  class=\"btn btn-default btn-rounded btn-sm my-0 btn-lg\">Submit</button>\n");
      out.write("            \n");
      out.write("        </form>\n");
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
      out.write("      </div>          \n");
      out.write("        </div>\n");
      out.write("        <!-- JQuery -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<!-- Bootstrap tooltips -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- MDB core JavaScript -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.3/js/mdb.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"./test_files/compiled.min.js.download\"></script>\n");
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
      out.write("<div class=\"hiddendiv common\"></div>\n");
      out.write("    \n");
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

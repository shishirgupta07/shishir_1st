package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nilesh_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- SideNav slide-out button -->\r\n");
      out.write("<a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("<!--/. SideNav slide-out button -->\r\n");
      out.write("\r\n");
      out.write("<!-- Sidebar navigation -->\r\n");
      out.write("<ul id=\"slide-out\" class=\"side-nav fixed sn-bg-1 custom-scrollbar\">\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <li>\r\n");
      out.write("        <div class=\"logo-wrapper waves-light\">\r\n");
      out.write("            <a href=\"#\"><img src=\"https://mdbootstrap.com/img/logo/mdb-transparent.png\" class=\"img-fluid flex-center\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!--/. Logo -->\r\n");
      out.write("    <!--Social-->\r\n");
      out.write("    <li>\r\n");
      out.write("        <ul class=\"social\">\r\n");
      out.write("            <li><a class=\"icons-sm fb-ic\"><i class=\"fa fa-facebook\"> </i></a></li>\r\n");
      out.write("            <li><a class=\"icons-sm pin-ic\"><i class=\"fa fa-pinterest\"> </i></a></li>\r\n");
      out.write("            <li><a class=\"icons-sm gplus-ic\"><i class=\"fa fa-google-plus\"> </i></a></li>\r\n");
      out.write("            <li><a class=\"icons-sm tw-ic\"><i class=\"fa fa-twitter\"> </i></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!--/Social-->\r\n");
      out.write("    <!--Search Form-->\r\n");
      out.write("    <li>\r\n");
      out.write("        <form class=\"search-form\" role=\"search\">\r\n");
      out.write("            <div class=\"form-group waves-light\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!--/.Search Form-->\r\n");
      out.write("    <!-- Side navigation links -->\r\n");
      out.write("    <li>\r\n");
      out.write("        <ul class=\"collapsible collapsible-accordion\">\r\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-chevron-right\"></i> Submit blog<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                <div class=\"collapsible-body\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">Submit listing</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">Registration form</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-hand-pointer-o\"></i> Instruction<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                <div class=\"collapsible-body\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">For bloggers</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">For authors</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-eye\"></i> About<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                <div class=\"collapsible-body\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">Introduction</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">Monthly meetings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-envelope-o\"></i> Contact me<i class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                <div class=\"collapsible-body\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <!--/. Side navigation links -->\r\n");
      out.write("    <div class=\"sidenav-bg mask-strong\"></div>\r\n");
      out.write("</ul>\r\n");
      out.write("<!--/. Sidebar navigation -->");
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

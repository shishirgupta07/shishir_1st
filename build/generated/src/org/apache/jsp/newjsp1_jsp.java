package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Material Design Bootstrap Template</title>\n");
      out.write("   <link  rel=\"stylesheet\" type=\"text/css\" href=\"compiled.css\">\n");
      out.write(" </head>\n");
      out.write(" <body  class=\"\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <form id=\"form\">\n");
      out.write("              <table class=\"table table-hover\">\n");
      out.write("                <tr class=\"row\">\n");
      out.write("                   <td class=\"column\">\n");
      out.write("              \n");
      out.write("<select id=\"course_id\" class=\"mdb-select md-form colorful-select dropdown-ins\" >\n");
      out.write("  <option value=\"\" >select course</option>\n");
      out.write(" ");
 
               SqlUtil.connectDatabase();
                String qry="select * from courses";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
    
      out.write("\n");
      out.write("    <option  value=\"");
      out.print(rs.getString("id"));
      out.write("\" selected=\"\">");
      out.print(rs.getString("course_name"));
      out.write("</option>\n");
      out.write("    ");
}
      out.write("    \n");
      out.write("</select>\n");
      out.write("\n");
      out.write("                   </td>\n");
      out.write("                     <td class=\"column\" id=\"subject_id\">\n");
      out.write("                       <select class=\"mdb-select md-form colorful-select dropdown-ins\">\n");
      out.write("                       <option value=\"\">select subject</option> \n");
      out.write("                       </select>\n");
      out.write("\n");
      out.write("                     </td>\n");
      out.write("                     <td class=\"column\">\n");
      out.write("                       <select class=\"mdb-select md-form colorful-select dropdown-ins\">\n");
      out.write("                        <option value=\"\">select unit</option>  \n");
      out.write("                       </select>\n");
      out.write("\n");
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
      out.write("      <script type=\"text/javascript\" src=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.8.10.min.js\"></script>\n");
      out.write("\n");
      out.write("     <script>\n");
      out.write("     $(document).ready(function() {\n");
      out.write("$('.mdb-select').materialSelect();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("        $(\"#course_id\").on(\"change\",function(){\n");
      out.write("            var course_id=$(\"#course_id\").val();\n");
      out.write("            $.ajax({\n");
      out.write("                    url:\"subject1.jsp\",\n");
      out.write("                    data:{course_id: course_id},\n");
      out.write("                    method: \"post\",\n");
      out.write("                    success:function(data)\n");
      out.write("                    {\n");
      out.write("                        $(\"#subject_id\").html(data);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("   </script>    \n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("    \n");
      out.write("\n");
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

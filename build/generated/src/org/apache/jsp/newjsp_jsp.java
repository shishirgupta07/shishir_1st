package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form id=\"form\">\n");
      out.write("    <table class=\"table table-hover\">\n");
      out.write("        <tr class=\"row\">\n");
      out.write("            <td class=\"column\">\n");
      out.write("     <select class=\"form-control\" id=\"course_id\">\n");
      out.write("     <option   value=\"\" >select course</option>\n");
      out.write("    ");
 
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
      out.write("    </select>\n");
      out.write("            </td>\n");
      out.write("            <td class=\"column\" id=\"subject_id\">\n");
      out.write("                <select class=\"form-control\" name=\"subject\" >\n");
      out.write("                    <option value=\"\">select subject</option>\n");
      out.write("                </select>\n");
      out.write("           </td>\n");
      out.write("            <td class=\"column\" id=\"unit_name\">\n");
      out.write("            <select class=\"form-control\" name=\"unit\">\n");
      out.write("                   <option value=\"\">select unit</option>  \n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("             <input type=\"submit\" name=\"submit\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <div id=\"error\"></div>\n");
      out.write("    <div id=\"success\"></div>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#course_id\").on(\"change\",function(){\n");
      out.write("            var course_id=$(\"#course_id\").val();\n");
      out.write("            $.ajax({\n");
      out.write("                    url:\"subject.jsp\",\n");
      out.write("                    data:{course_id: course_id},\n");
      out.write("                    method: \"post\",\n");
      out.write("                    succecss:function(data)\n");
      out.write("                    {\n");
      out.write("                        $(\"#subject_id\").html(data);\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#submit\").on(\"click\",function(){\n");
      out.write("                var course_id=$(\"#course_id\").val();\n");
      out.write("                var subject_id=$(\"#subject\").val();\n");
      out.write("                var unit_name=$(\"#unit\").val();\n");
      out.write("                \n");
      out.write("                if(course_id===\"\"||course_id===null)\n");
      out.write("                {\n");
      out.write("                    $(\"#error\").html(\"all field are mandetory.\");\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                     $(\"#error\").html(\"\");\n");
      out.write("                     $.ajax({\n");
      out.write("                         url:\"outputText\",\n");
      out.write("                         method:\"post\",\n");
      out.write("                         data:{course_id:course_id,subject_id:subject_id,unit_name:unit_name},\n");
      out.write("                         success:function(data)\n");
      out.write("                         {\n");
      out.write("                             $(\"#success\").html(data);\n");
      out.write("                             $(\"#form\").trigger(\"reset\");\n");
      out.write("                         }\n");
      out.write("             \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("     });\n");
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

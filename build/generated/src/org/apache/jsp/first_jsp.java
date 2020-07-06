package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbc.SqlUtil;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link  rel=\"stylesheet\" type=\"text/css\" href=\"compiled.css\">\n");
      out.write("    <link  rel=\"stylesheet\" type=\"text/css\" href=\"compiled2.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("     <style type=\"text/css\" >\n");
      out.write("         \n");
      out.write("         select{\n");
      out.write("             color: #f39c12;\n");
      out.write("    box-shadow: none;\n");
      out.write("    border: 0 !important;\n");
      out.write("    background: #2c3e50;\n");
      out.write("    position: relative;\n");
      out.write("    flex: 1;\n");
      out.write("    padding: 0 .5em;\n");
      out.write("    color: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: flex;\n");
      out.write("    width: 20em;\n");
      out.write("    height: 3em;\n");
      out.write("    line-height: 3;\n");
      out.write("    background: #4b3e8a;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border-radius: .25em;\n");
      out.write("    background-image: none;\n");
      out.write("\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         \n");
      out.write("     </style>\n");
      out.write("    </head>\n");
      out.write(" <body  class=\"\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("            <form id=\"form\">\n");
      out.write("              <table class=\"table table-hover\">\n");
      out.write("                <tr class=\"row\">\n");
      out.write("                   <td class=\"column\">\n");
      out.write("                    </td>\n");
      out.write("                     <td class=\"column\" >\n");
      out.write("          <select  class=\"browser-default\" id=\"course_select\">\n");
      out.write("         <option value=\"\" >select course</option>\n");
      out.write(" ");
 
               SqlUtil.connectDatabase();
                String qry="select * from course";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
    
      out.write("\n");
      out.write("    <option  value=\"");
      out.print(rs.getString("courseid"));
      out.write("\" selected=\"\">");
      out.print(rs.getString("course"));
      out.write("</option>\n");
      out.write("    ");
}
      out.write("    \n");
      out.write("            </select>\n");
      out.write("                     </td>\n");
      out.write("                    <td class=\"column\">\n");
      out.write("                         <select class=\"browser-default\" id=\"subject_select\">\n");
      out.write("                          <option value=\"\" >select subject</option> \n");
      out.write("                         </select>\n");
      out.write("                     </td>\n");
      out.write("                     <td class=\"column\" >\n");
      out.write("                       <select class=\"browser-default\" id=\"unit_select\">\n");
      out.write("                        <option value=\"\" >select unit</option>  \n");
      out.write("                       </select>\n");
      out.write("\n");
      out.write("                     </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>\n");
      out.write("                      <input type=\"submit\" name=\"submit\">\n");
      out.write("                   </td>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      <script type=\"text/javascript\" src=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.8.10.min.js\"></script>\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("     $(document).ready(function(){\n");
      out.write("         $('#course_select').change(function(){\n");
      out.write("          $('#subject_select').find('option').not(':first').remove();\n");
      out.write("                var course_id = $('#course_select').val();\n");
      out.write("                var datastring=\"course_id=\"+course_id;\n");
      out.write("                  $.ajax({\n");
      out.write("      type:\"POST\",\n");
      out.write("      url:\"getSubjects1.jsp\",\n");
      out.write("      \n");
      out.write("      data:datastring,\n");
      out.write("      success:function(result)\n");
      out.write("      {\n");
      out.write("        console.log(result)\n");
      out.write("        var obj=JSON.parse(result);\n");
      out.write("       console.log(obj)\n");
      out.write("       var end= $('#subject_select').find('option').remove().end();\n");
      out.write("       end.append('<option value=\"\" selected disabled>Subject</option>');\n");
      out.write("            for (var i=0;i<obj.length;i++){\n");
      out.write("       end.append('<option value=\"'+obj[i].sid+'\">'+obj[i].sname+'</option>');\n");
      out.write("            }\n");
      out.write("       }\n");
      out.write("     });\n");
      out.write("         });\n");
      out.write("         \n");
      out.write("     });\n");
      out.write("   </script>\n");
      out.write("   </script>    \n");
      out.write("\n");
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

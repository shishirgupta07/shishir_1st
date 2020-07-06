package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbcpackage.SqlUtil;
import java.sql.ResultSet;

public final class getQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
                String subject_id=request.getParameter("subject_id");
                System.out.println(subject_id);
                String unit_id=request.getParameter("unit_id");
                System.out.println(unit_id);
                SqlUtil.connectDatabase();
                String query="select * from subject_unit_question,question where subject_unit_question.question_id=question.question_id and subject_id="+subject_id+" and unit_id="+unit_id+"";
                ResultSet rs=SqlUtil.read(query);
                System.out.println("hellohhj"); 
                if(rs.next()){
                         do{
                    
      out.write("\n");
      out.write("                    <tr class=\"\">\n");
      out.write("                    <td class=\"col-lg-6\">\n");
      out.write("                        ");
      out.print(rs.getString("value"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"col-lg-2\">\n");
      out.write("                        ");
      out.print(rs.getString("marks"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"col-lg-2\">\n");
      out.write("                        ");
      out.print(rs.getString("level"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"col-lg-2\">\n");
      out.write("                        ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"col-lg-2\">\n");
      out.write("                       <a href=\"question_remove.jsp?question_id=");
      out.print(rs.getString("question_id"));
      out.write("\"><button type=\"button\" style=\"background-color:#4b3e8a; color:white \"\n");
      out.write("                                                               class=\"btn-rounded btn-sm my-0\" >delete</button></a>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }while(rs.next());
        }
        else{
      out.println("no data found");
               }
                
        

      out.write('\n');
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

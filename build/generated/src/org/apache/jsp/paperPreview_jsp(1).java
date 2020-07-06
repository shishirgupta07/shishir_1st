package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;

public final class paperPreview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

         String courseid=request.getParameter("course_select");
                       String semester=request.getParameter("semester_select");
                        String subjectid=request.getParameter("subject_select");
                           int noOfModule=Integer.parseInt(request.getParameter("noOfModule"));
                           int questionPerModule=Integer.parseInt(request.getParameter("questionPerModule"));
                           String questionPaperCode=request.getParameter("questionPaperCode");
                           int marksPerModule=Integer.parseInt(request.getParameter("marksPerModule"));                           
                           String choisePerModule =request.getParameter("choisePerModule");
                           String time=request.getParameter("time");
                           int totalMarks=noOfModule*marksPerModule;
                            SqlUtil.connectDatabase();
                            
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container d\" style=\"padding: 25px\">\n");
      out.write("                <div class=\"container row\" style=\"text-align: center\">\n");
      out.write("                    ");

                        String courseName="";
                    String qry1="select (course_name) from course where course_id='"+courseid+"'";
                    ResultSet rs1=SqlUtil.read(qry1);
                    if(rs1.next()){
                        courseName=rs1.getString("course_name");
                    }
                    
      out.write("\n");
      out.write("                    <h3 class=\"col-lg-5\">");
      out.print(courseName);
      out.write("></h3><h3 class=\"col-lg-5\">");
      out.print(semester);
      out.write("</h3>semester\n");
      out.write("                    <h2 class=\"col-lg-12\">Choise Based Grading System(CBGS)</h2>\n");
      out.write("                    ");

                        String subjectName="";
                    String qry2="select (subject_name) from subject where subject_id='"+subjectid+"'";
                    ResultSet rs2=SqlUtil.read(qry2);
                    if(rs2.next()){
                        subjectName=rs1.getString("subject_name");
                    } 
                        
      out.write("\n");
      out.write("                                <h3 class=\"col-lg-12\">Subject:-");
      out.print(subjectName);
      out.write("</h3>\n");
      out.write("                                <h4 class=\"col-lg-2\">");
      out.print(totalMarks);
      out.write("&nbsp;Marks</h4><h4 class=\"col-lg-8\">Paper code :-");
      out.print(questionPaperCode);
      out.write("</h4>&nbsp;<h4 class=\"col-lg-2\">");
      out.print(time);
      out.write("&nbsp;</h4>                       \n");
      out.write("                             </div> \n");
      out.write("                             <div class=\"container\" style=\"\">\n");
      out.write("                                 \n");
      out.write("                             </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

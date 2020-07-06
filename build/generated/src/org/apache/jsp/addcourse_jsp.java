package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbc.SqlUtil;

public final class addcourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");


                            //  System.out.println("form submitted");
                            String courseid=    request.getParameter("courseid");
                            System.out.println(courseid);
                           String course=    request.getParameter("course");
                           int duration= Integer.parseInt(request.getParameter("duration"));
                            //System.out.println("if k andar he");
              
                 SqlUtil.connectDatabase();
                  //   System.out.println("db conn");
              
                 String qry="insert into course(course,duration,courseid) values(' " + course+" ', ' "+duration+" ',' "+ courseid+" ')";
                 int rs=SqlUtil.insert(qry);
                 System.out.println("insert ho gya");
                  
                    int i=1;
                    String query="";
                  for( ;i<=duration;i++)
                    {
                        query="insert into semester(courseid,duration) values(' "+courseid+" ',' "+i+" ')";
                        
                        SqlUtil.insert(query);
                    }
                  if(rs>0 && i>duration){
                       System.out.println("hello");
                       
                       
      out.write("\n");
      out.write("                       <script> document.location.href=\"course_manage.jsp\";</script>\n");
      out.write("                                    ");
  } 
      out.write("\n");
      out.write("                  \n");
      out.write("                 \n");
      out.write(" %>\n");
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

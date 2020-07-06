package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import jdbcpackage.SqlUtil;
import java.util.Date;

public final class add_005finstructor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   ");

              try{
                 String Instructor=    request.getParameter("Instructor");
                 System.out.println(Instructor);
                String FirstName=    request.getParameter("FirstName");
                System.out.println(FirstName);
                String LastName=    request.getParameter("LastName");
                System.out.println(LastName);
                 String Password=    request.getParameter("Password");
                 System.out.println(Password);
                 String ConPassword=   request.getParameter("ConPassword");
                 System.out.println(ConPassword);
                 String Dob=    request.getParameter("Dob");
                 System.out.println(Dob);
                 String Email=    request.getParameter("Email");
                 System.out.println(Email);
                 String Mobile=    request.getParameter("Mobile");
                 System.out.println(Mobile);
                  String State=    request.getParameter("State");
                  System.out.println(State);
                   String City=    request.getParameter("City");
                   System.out.println(City);
                
                   Date dt= new SimpleDateFormat("yyyy-mm-dd").parse(Dob);;
       java.sql.Date sqldate=new java.sql.Date(dt.getTime()); 
                SqlUtil.connectDatabase();
                System.out.println(sqldate);
                String qri="insert into instructor(instructor_id,firstname,lastname,dob,email,mobile,state,city) values('"+ Instructor+"','"+FirstName+"','"+LastName+"','"+sqldate+"','"+Email+"','"+Mobile+"','"+State+"','"+City+"')";
                System.out.println(qri); 
                int no=SqlUtil.insert(qri);
                System.out.println(no);
                
                if(no>0){ 
      out.write("\n");
      out.write("                <script> document.location.href=\"instructor_management.jsp\"; </script>\n");
      out.write("                   ");
 }
                    else{
               
      out.write("\n");
      out.write("                <h1>you have not entered all the fields</h1>\n");
      out.write("                ");
 }
                  }catch(Exception e){
      out.write("\n");
      out.write("                  <h1>\n");
      out.write("                      you haven't field all the entries\n");
      out.write("                  </h1>\n");
      out.write("\n");
      out.write("                   ");
} 
      out.write("\n");
      out.write("              ");
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

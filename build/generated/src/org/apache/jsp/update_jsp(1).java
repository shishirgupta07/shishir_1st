package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jdbcpackage.SqlUtil;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 try{
    String id=request.getParameter("Instructor");
 String firstname=request.getParameter("Firstname");
 String lastname=request.getParameter("Lastname");
String email=request.getParameter("Email");
   
    String mobile=request.getParameter("Mobile");
     String state=request.getParameter("State");
      String city=request.getParameter("City");
  String date=request.getParameter("Dob");
   Date dt=null;
    System.out.println(date);
         System.out.println("date par");
         System.out.println("after date par"+date);
             dt = new SimpleDateFormat("yyyy-mm-dd").parse(date);
         System.out.println("parsing ke baad");
             java.sql.Date sqldate=new java.sql.Date(dt.getTime());
             System.out.println("gettime ke bad");
             System.out.println(sqldate);
            /*SimpleDateFormat sdfday=new SimpleDateFormat("dd");
              SimpleDateFormat sdfmonth=new SimpleDateFormat("MM");
               SimpleDateFormat sdfyear=new SimpleDateFormat("YYYY");
               String day=sdfday.format(sqldate);
               String month=sdfmonth.format(sqldate);
               String year=sdfyear.format(sqldate);
               String fullDate="day"+"-"+"month"+"-"+"year";
              System.out.println(fullDate);*/
    SqlUtil.connectDatabase();
    String qry="update instructor set firstname='"+firstname+"',lastname='"+lastname+"',dob='"+sqldate+"',email='"+email+"',mobile='"+mobile+"',state='"+state+"',city='"+city+"' where instructor_id='"+id+"' ";
   SqlUtil.update(qry);
}
catch(Exception e){
System.out.println(e);
}
   
      out.write("<script>\n");
      out.write("       alert(\"data is updated\");\n");
      out.write("</script>\n");
response.sendRedirect("instructor_management.jsp");
    
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

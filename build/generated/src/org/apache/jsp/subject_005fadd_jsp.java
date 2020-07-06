package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbcpackage.SqlUtil;

public final class subject_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            try{
                int n=0;
        String courseid=request.getParameter("selectCourse");
        String sem=request.getParameter("selectSemester");
        int no=Integer.parseInt(request.getParameter("subjects"));
        String[] subject = new String[no];
        System.out.println(courseid);
        System.out.println(sem);
        System.out.println(no);
        for(int i=1;i<=no;i++){
            subject[i]=request.getParameter("textField"+i);
            System.out.println(subject[i]);
        }
        SqlUtil.connectDatabase();
        String[] qry=new String[no];
        for(int i=1;i<=no;i++){
        qry[i]="insert into subject(subject_name) values('"+subject[i]+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        System.out.println(n);
        for(int i=1;i<=no;i++){
        qry[i]="select (subject_id) from subject where subject_name='"+subject[i]+"'";
        }
        ResultSet[] rs=null;
        for(int i=1;i<=no;i++){
        rs[i]=SqlUtil.read(qry[i]);
        }
        for(int i=1;i<=no;i++){
        qry[i]="insert into course_subject values('"+courseid+"','"+sem+"','"+rs[i].getString("subject_id")+"')";
        n=SqlUtil.insert(qry[i]);
        }
        System.out.println(n);
        response.sendRedirect("subject_management.jsp");
            }
            catch(Exception e){
              out.println("error in jsp page"+e);
              
            } 
 
 
                              
        
      out.write("\n");
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

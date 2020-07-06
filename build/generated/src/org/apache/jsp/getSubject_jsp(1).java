package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbcpackage.SqlUtil;
import java.sql.ResultSet;

public final class getSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
                //String course_id=request.getParameter("course_id");
                //String sem_id=request.getParameter("sem_id");
                String course_id="2";
                String sem_id="2";
                System.out.println(course_id);
                System.out.println(sem_id);
                SqlUtil.connectDatabase();
                String query="select * from course_subject where course_id="+course_id+" and semester="+sem_id+"";
                System.out.println(query);     
                ResultSet rs=SqlUtil.read(query);
                System.out.println(rs);
                String[] id=new String[10];
                int i=0;
                while(rs.next()){
                    id[i]=rs.getString("subject_id");
                    i++;
                        }
                ResultSet[] rs1=new ResultSet[i];
                String[] qry=new String[i];
                for(int j=0;j<i;j++){
                    qry[j]="select * from subject where subject_id='"+id[j]+"'";
                }
                for(int j=0;j<i;j++){
                    rs1[j]=SqlUtil.read(qry[j]);
                if(rs1[j].next()){
                    
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs1[j].getString("subject_name"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"course_edit.jsp?idc=");
      out.print( rs1[j].getString("subject_id"));
      out.write("\"><button type=\"button\" style=\"background-color:#4b3e8a; color:white \"\n");
      out.write("                                                               class=\"btn-rounded btn-sm my-0 \" >delete</button></a>\n");
      out.write("                    </td>\n");
      out.write("                    ");

                        }
        else{
      out.println("no data found");
               }
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

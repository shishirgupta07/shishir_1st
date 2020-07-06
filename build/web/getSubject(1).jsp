
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
                String course_id=request.getParameter("course_id");
                String sem_id=request.getParameter("sem_id");
                SqlUtil.connectDatabase();
                String query="select * from course_subject,subject where course_subject.subject_id=subject.subject_id and course_id="+course_id+" and semester="+sem_id+"";
                ResultSet rs=SqlUtil.read(query);
                System.out.println("hellohhj"); 
                %>
                <tr class="">
                    <td class="col-lg-12">
                        Subject Name
                    </td>
                    <td class="col-lg-12">
                        delete
                    </td>
                </tr>
                 <%
                if(rs.next()){
                         do{
                    %>
                    <tr class="">
                    <td class="col-lg-12">
                        <%=rs.getString("subject_name")%>
                    </td>
                    <td class="col-lg-12">
                       <a href="subject_remove.jsp?subject_id=<%= rs.getString("subject_id")%>"><button type="button" style="background-color:#4b3e8a; color:white "
                                                               class="btn-rounded btn-sm my-0" >delete</button></a>
                    </td>
                    </tr>
                    <%
                        }while(rs.next());
        }
        else{
      out.println("no data found");
               }
                
        
%>


<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
                String course_id=request.getParameter("course_id");
                String sem_id=request.getParameter("sem_id");
                String subject_id=request.getParameter("subject_id");
                SqlUtil.connectDatabase();
                String query="select * from subject_unit,unit where subject_unit.unit_id=unit.unit_id and subject_id="+subject_id+"";
                ResultSet rs=SqlUtil.read(query);
                System.out.println("hellohhj"); 
                %>
                <tr class="">
                    <td class="col-lg-5">
                        Unit Number
                    </td>
                    <td class="col-lg-5">
                        Unit Name
                    </td>
                    <td class="col-lg-5">
                        delete
                    </td>
                </tr>
                <%
                if(rs.next()){
                         do{
                    %>
                    <tr class="">
                    <td class="col-lg-5">
                        <%=rs.getString("unit_number")%>
                    </td>
                    <td class="col-lg-5">
                        <%=rs.getString("unit_name")%>
                    </td>
                    <td class="col-lg-2">
                       <a href="unit_remove.jsp?unit_id=<%= rs.getString("unit_id")%>"><button type="button" style="background-color:#4b3e8a; color:white "
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

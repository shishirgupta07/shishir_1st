
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
                String subject_id=request.getParameter("subject_id");
                System.out.println(subject_id);
                String unit_id=request.getParameter("unit_id");
                System.out.println(unit_id);
                SqlUtil.connectDatabase();
                String query="select * from subject_unit_question,question where subject_unit_question.question_id=question.question_id and subject_id="+subject_id+" and unit_id="+unit_id+"";
                ResultSet rs=SqlUtil.read(query);
                System.out.println("hellohhj"); 
                %>
                <tr class="">
                    <td class="col-lg-6">
                        question
                    </td>
                    <td class="col-lg-2">
                        marks
                    </td>
                    <td class="col-lg-2">
                        level
                    </td>
                    <td class="col-lg-2">
                        category
                    </td>
                     <td class="col-lg-2">
                        delete
                    </td>
                </tr>
                <%
                if(rs.next()){
                         do{
                    %>
                    <tr class="">
                    <td class="col-lg-6">
                        <%=rs.getString("value")%>
                    </td>
                    <td class="col-lg-2">
                        <%=rs.getString("marks")%>
                    </td>
                    <td class="col-lg-2">
                        <%=rs.getString("level")%>
                    </td>
                    <td class="col-lg-2">
                        <%=rs.getString("category")%>
                    </td>
                    <td class="col-lg-2">
                       <a href="question_remove.jsp?question_id=<%=rs.getString("question_id")%>"><button type="button" style="background-color:#4b3e8a; color:white "
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

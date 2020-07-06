<%-- 
    Document   : addcourse
    Created on : 15 Oct, 2019, 6:18:35 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%
                            int maxNo=0;
                             System.out.println("form submitted");
                           String course=request.getParameter("course");
                           int duration= Integer.parseInt(request.getParameter("duration"));
                            System.out.println("if k andar he");
              
                 SqlUtil.connectDatabase();
                    System.out.println("db conn");
              
                 String qry="insert into course(course_name,course_duration) values('"+course+"','"+duration+"')";
                 int rs=SqlUtil.insert(qry);
                 System.out.println("insert ho gya");
                 String qry1="select max(course_id) from course";
                 ResultSet sr=SqlUtil.read(qry1);
                 if(sr.next()){
                      maxNo=sr.getInt("max(course_id)");
                 }
                  System.out.println(duration);
                    int i=0;
                    String query="";
                  for( i=1;i<=duration;i++)
                    {
                        query="insert into course_semester(course_id,semester) values('"+maxNo+"','"+i+"')";
                        SqlUtil.insert(query);
                    }
                  if(rs>0 && i>duration){
                       System.out.println("hello");
                       
                       %>
                       <script> document.location.href="course_management.jsp";</script>
                                    <%  } %>
                  
                 
 %>

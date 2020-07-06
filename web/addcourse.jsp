<%-- 
    Document   : addcourse
    Created on : 15 Oct, 2019, 6:18:35 PM
    Author     : HP
--%>

<%@page import="jdbc.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%

                             System.out.println("form submitted");
                            String courseid=    request.getParameter("courseid");
                            System.out.println(courseid);
                           String course=    request.getParameter("course");
                           int duration= Integer.parseInt(request.getParameter("duration"));
                            System.out.println("if k andar he");
              
                 SqlUtil.connectDatabase();
                    System.out.println("db conn");
              
                 String qry="insert into course(course,duration,courseid) values(' " + course+" ', ' "+duration+" ',' "+ courseid+" ')";
                 int rs=SqlUtil.insert(qry);
                 System.out.println("insert ho gya");
                  System.out.println(duration);
                    int i=0;
                    String query="";
                  for( i=1;i<=duration;i++)
                    {
                        query="insert into semester(courseid,semester) values(' "+courseid+" ',' "+i+" ')";
                        
                        SqlUtil.insert(query);
                    }
                  if(rs>0 && i>duration){
                       System.out.println("hello");
                       
                       %>
                       <script> document.location.href="course_manage.jsp";</script>
                                    <%  } %>
                  
                 
 %>

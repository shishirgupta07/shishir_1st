<%-- 
    Document   : update2
    Created on : 16 Jul, 2019, 3:04:40 PM
    Author     : HP
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbc.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        String idc=request.getParameter("courseid");
String course=request.getParameter("course");
String duration=request.getParameter("duration");
System.out.println(course);
System.out.println(duration);
     
     try{
    SqlUtil.connectDatabase();
    String qry="update course set course='"+course+"',duration='"+duration+"' where courseid='"+idc+" ' ";
    System.out.println(qry);
   int i=SqlUtil.update(qry);
   
   if(i>0)
   {
       out.print("update successfully");
       response.sendRedirect("course_manage.jsp");
   }
   else{
       out.print("problem in update");
   }
   
 
     }
     catch(Exception e){
         System.out.println(e);
     }

%>
    </body>
</html>

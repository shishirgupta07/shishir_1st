<%-- 
    Document   : update2
    Created on : 16 Jul, 2019, 3:04:40 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
        String idc=request.getParameter("courseid");
String course=request.getParameter("course");
int duration=Integer.parseInt(request.getParameter("duration"));

System.out.println(course);
System.out.println(duration);
     
     try{
    SqlUtil.connectDatabase();
     String qry1="select * from course where course_id='"+idc+"'";
     ResultSet rs=SqlUtil.read(qry1);
     int sem=0;
     if(rs.next()){
     sem=rs.getInt("course_duration");
     System.out.println(sem);
     }
    String qry="update course set course_name='"+course+"',course_duration='"+duration+"' where course_id='"+idc+"'";
    System.out.println(qry);
   int i=SqlUtil.update(qry);
   if(duration!=sem){
        String qry2="delete from course_semester where course_id='"+idc+"'"; 
        SqlUtil.update(qry2);
        for(int j=1;j<=duration;j++){
        qry2="insert into course_semester(course_id,semester) values('"+idc+"','"+j+"')";; 
        SqlUtil.update(qry2);
       } 
       }
    response.sendRedirect("course_management.jsp");
    
   }
     catch(Exception e){
         System.out.println(e);
     }

%>
    </body>
</html>

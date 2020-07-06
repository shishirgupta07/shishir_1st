<%-- 
    Document   : remove
    Created on : 15 Jul, 2019, 7:21:20 PM
    Author     : HP
--%>

<%@page import="jdbcpackage.SqlUtil"%>
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
           String id= request.getParameter("cid");
           System.out.println(id);
           
            SqlUtil.connectDatabase();
           System.out.println(id);
        String qry="delete  from course where course_id ='"+id+"' ";
        System.out.println(qry);
        int del1=SqlUtil.update(qry);
        if(del1>0)
     response.sendRedirect("course_management.jsp");
   %> 

   
            
    </body>
</html>

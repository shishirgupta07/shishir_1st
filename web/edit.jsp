<%-- 
    Document   : edit
    Created on : 17 Jul, 2019, 11:08:03 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="update2.jsp" method="post">
            <%
            String uid= request.getParameter("idc");
            System.out.println(uid);
            SqlUtil.connectDatabase();
            String sql="Select * from coursemanagement where courseid='"+uid+"' ";
            System.out.println(sql);
            ResultSet rs= SqlUtil.read(sql);
           while(rs.next()){
               %>
               <table>
                <%   System.out.println(rs.getString("course"));%>
                   <td> <input type="text" name="course" value="<%=rs.getString("course")%>">
                       
                   </td>
                   
                   <td> <input type="text" name="duration" value="<%= rs.getString("duration")%>">
                       
                   </td>
                   
                   <td> <input type="text" name="courseid" value="<%= rs.getString("courseid")%>" readonly >
                       
                   </td>
                   <td>
                       <input type="submit" value="update">
                   </td>
               </table>
                
               
                   <%
                                }
                   %>
        </form>
        
        
    </body>
</html>

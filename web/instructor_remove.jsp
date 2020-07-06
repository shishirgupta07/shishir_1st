<%-- 
    Document   : remove
    Created on : 14 Jul, 2019, 7:17:26 PM
    Author     : HP
--%>

<%@page import="jdbcpackage.SqlUtil"%>
<% String id=request.getParameter("textId");
System.out.println(id);
try{
    SqlUtil.connectDatabase();
    String qry="delete from instructor where instructor_id='"+id+"'";
    System.out.println(qry);
   int del=SqlUtil.update(qry);
   System.out.println(del);
}catch(Exception e){
   System.out.println(e);        
}
   %>
<%response.sendRedirect("instructor_management.jsp");
    %>
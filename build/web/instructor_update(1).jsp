<%-- 
    Document   : update
    Created on : 15 Jul, 2019, 10:25:44 AM
    Author     : HP
--%>

<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="jdbcpackage.SqlUtil"%>
<% try{
    String id=request.getParameter("Instructor");
 String firstname=request.getParameter("FirstName");
 String lastname=request.getParameter("LastName");
String email=request.getParameter("Email");
   System.out.println(email);
    String mobile=request.getParameter("Mobile");
     String state=request.getParameter("State");
      String city=request.getParameter("City");
  String date=request.getParameter("Dob");
   Date dt=null;
    System.out.println(date);
         System.out.println("date par");
         System.out.println("after date par");
             dt = new SimpleDateFormat("yyyy-mm-dd").parse(date);
         System.out.println("parsing ke baad date"+dt);
             java.sql.Date sqldate=new java.sql.Date(dt.getTime());
             System.out.println("gettime ke bad");
             System.out.println(sqldate);
            /*SimpleDateFormat sdfday=new SimpleDateFormat("dd");
              SimpleDateFormat sdfmonth=new SimpleDateFormat("MM");
               SimpleDateFormat sdfyear=new SimpleDateFormat("YYYY");
               String day=sdfday.format(sqldate);
               String month=sdfmonth.format(sqldate);
               String year=sdfyear.format(sqldate);
               String fullDate="day"+"-"+"month"+"-"+"year";
              System.out.println(fullDate);*/
    SqlUtil.connectDatabase();
    String qry="update instructor set first_name='"+firstname+"',last_name='"+lastname+"',date_of_birth='"+sqldate+"',email='"+email+"',mobile_number='"+mobile+"',state='"+state+"',city='"+city+"' where instructor_id='"+id+"' ";
   SqlUtil.update(qry);
    %><script>
       alert("data is updated");
</script>
<%response.sendRedirect("instructor_management.jsp");
    
}
catch(Exception e)
{
System.out.println(e);
}
%>
  
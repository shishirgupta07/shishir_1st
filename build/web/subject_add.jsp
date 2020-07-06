<%-- 
    Document   : add_subject
    Created on : Dec 30, 2019, 8:00:04 PM
    Author     : HP
--%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
            int n=0,maxNo=0;
        String courseid=request.getParameter("selectCourse");
        String sem=request.getParameter("selectSemester");
        int no=Integer.parseInt(request.getParameter("subjects"));
        String[] subject = new String[no+1];
      
        System.out.println(courseid);
        System.out.println(sem);
        System.out.println(no);
        for(int i=1;i<=no;i++){
            
            subject[i]=request.getParameter("textField"+i);
            System.out.println(subject[i]);
        }
        SqlUtil.connectDatabase();
        String[] qry=new String[no+1];
        for(int i=1;i<=no;i++){
        qry[i]="insert into subject(subject_name) values('"+subject[i]+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        String qry1="select max(subject_id) from subject";
        ResultSet rs=SqlUtil.read(qry1);
        if(rs.next()){
            maxNo=rs.getInt("max(subject_id)");
        }
        for(int i=1;i<=no;i++){
        qry[i]="insert into course_subject values('"+courseid+"','"+sem+"','"+(maxNo-no+i)+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        System.out.println(n);
        response.sendRedirect("subject_management.jsp");
            
            
           
            
 
                              
        %>
    </body>
</html>

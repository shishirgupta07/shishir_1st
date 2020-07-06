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
        String semid=request.getParameter("selectSemester");
        String subjectid=request.getParameter("selectSubject");
        int no=Integer.parseInt(request.getParameter("units"));
        String[] unitname = new String[no+1];
        String[] unitno = new String[no+1];
        System.out.println(courseid);
        System.out.println(semid);
        System.out.println(no);
        for(int i=1;i<=no;i++){
            unitname[i]=request.getParameter("unitField"+i);
            unitno[i]=request.getParameter("noField"+i);
            System.out.println(unitname[i]);
        }
        SqlUtil.connectDatabase();
        String[] qry=new String[no+1];
        for(int i=1;i<=no;i++){
        qry[i]="insert into unit(unit_name,unit_number) values('"+unitname[i]+"','"+unitno[i]+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        String qry1="select max(unit_id) from unit";
        ResultSet rs=SqlUtil.read(qry1);
        if(rs.next()){
            maxNo=rs.getInt("max(unit_id)");
        }
        for(int i=1;i<=no;i++){
        qry[i]="insert into subject_unit values('"+subjectid+"','"+(maxNo-no+i)+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        System.out.println(n);
        response.sendRedirect("unit_management.jsp");
        %>
    </body>
</html>

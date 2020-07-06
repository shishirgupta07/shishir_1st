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
       String subjectid=request.getParameter("selectSubject");
       String unitid=request.getParameter("selectUnit");
        int no=Integer.parseInt(request.getParameter("questions"));
        String[] value = new String[no+1];
        String[] marks = new String[no+1];
        String[] level = new String[no+1];
        String[] category = new String[no+1];
        System.out.println(subjectid);
        System.out.println(unitid);
        System.out.println(no);
        for(int i=1;i<=no;i++){
            value[i]=request.getParameter("questionField"+i);
            marks[i]=request.getParameter("marksField"+i);
            level[i]=request.getParameter("levelField"+i);
            category[i]=request.getParameter("categoryField"+i);
        }
        SqlUtil.connectDatabase();
        String[] qry=new String[no+1];
        for(int i=1;i<=no;i++){
        qry[i]="insert into question(value,marks,level,category) values('"+value[i]+"','"+marks[i]+"','"+level[i]+"','"+category[i]+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        String qry1="select max(question_id) from question";
        ResultSet rs=SqlUtil.read(qry1);
        if(rs.next()){
            maxNo=rs.getInt("max(question_id)");
        }
        for(int i=1;i<=no;i++){
        qry[i]="insert into subject_unit_question values('"+subjectid+"','"+unitid+"','"+(maxNo-no+i)+"')";
        }
        for(int i=1;i<=no;i++){
        n=SqlUtil.insert(qry[i]);
        }
        System.out.println(n);
        response.sendRedirect("question_management.jsp");
        %>
    </body>
</html>

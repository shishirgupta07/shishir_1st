<%-- 
    Document   : paperPreview
    Created on : Jan 8, 2020, 9:21:52 AM
    Author     : HP
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .d{ 
                border-color: black;
		border-style: solid;
		border-radius: 20px;
                width:1000px;
                margin-left: 125px;
            }
        </style>
    </head>
    <body>
        <%
         String courseid=request.getParameter("course_select");
         System.out.println(courseid);
                       String semester=request.getParameter("semester_select");
                       System.out.println(semester);
                        String subjectid=request.getParameter("subject_select");
                        System.out.println(subjectid);
                           int noOfModule=Integer.parseInt(request.getParameter("noOfModules"));
                           System.out.println(noOfModule);
                           int questionPerModule=Integer.parseInt(request.getParameter("questionPerModule"));
                           System.out.println(questionPerModule);
                           String questionPaperCode=request.getParameter("questionPaperCode");
                           System.out.println(questionPaperCode);
                           int marksPerModule=Integer.parseInt(request.getParameter("marksPerModule"));
                           System.out.println(marksPerModule);                           
                           String choisePerModule=request.getParameter("choisePerModule");
                           System.out.println(choisePerModule); 
                           String time=request.getParameter("time");
                           System.out.println(time);
                           int totalMarks=noOfModule*marksPerModule;
                           System.out.println(totalMarks);
                            SqlUtil.connectDatabase();
                            if(request.getParameter("check")==null){
                            out.println("please check that given box");
                            }else{
        %>
        <div class="container">
            <div class="container d" style="padding: 25px">
                <div class="container row" style="text-align: center">
                    <%  
                        String courseName="";
                    String qry1="select (course_name) from course where course_id="+courseid+"";
                    System.out.println(qry1);
                    ResultSet rs1=SqlUtil.read(qry1);
                    if(rs1.next()){
                        courseName=rs1.getString("course_name");
                        System.out.println(courseName);
                    }
                    %>
                   
                    <h3 ><%=courseName%>   <%=semester%>   semester</h3>
                   
                    <h2 class="col-lg-12">Choise Based Grading System(CBGS)</h2>
                    <%
                        String subjectName="";
                    String qry2="select (subject_name) from subject where subject_id="+subjectid+"";
                    System.out.println(qry2);
                    ResultSet rs2=SqlUtil.read(qry2);
                    if(rs2.next()){
                        subjectName=rs2.getString("subject_name");
                        System.out.println(subjectName);
                    } 
                        %>
                                <h3 class="col-lg-12">Subject:-<%=subjectName%></h3>
                                </div> 
                             <div class="container row" style="">
                                 <h4 class="col-lg-2">Total Marks: <%=totalMarks%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Paper code: <%=questionPaperCode%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time: <%=time%></h4>                       
                                 <h4 class="col-lg-2">Note:  1)Attempt all the questions.</h4>
                                 <h4 class="col-lg-2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2)All questions carry equal marks.</h4>
                                 <h4 class="col-lg-2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3)All parts of each question to be are attempted at one place.</h4>
                             </div>
                                 <div class="container row" style="">
                                     <%
                                         String[] unitid=new String[10];
                                     String qry3="select * from subject_unit where subject_id="+subjectid+"";
                                     ResultSet rs3=SqlUtil.read(qry3);
                                     System.out.println("1");
                                     int i=0;
                                     while(rs3.next()){
                                         unitid[i]=rs3.getString("unit_id");
                                         i++;
                                     }
                                     System.out.println("2");
                                     for(i=0;i<noOfModule;i++){
                                         List<String> question= new ArrayList();
                                         String qry4="select * from subject_unit_question,question where subject_unit_question.question_id=question.question_id and subject_id="+subjectid+" and unit_id="+unitid[i]+"";
                                         System.out.println(qry4);
                                         ResultSet rs4=SqlUtil.read(qry4);
                                         while(rs4.next()){
                                             question.add(rs4.getString("value"));
                                          }
                                         System.out.println(question.size());
                                         Random rd=new Random();
                                         %>
                                         <p><%=i+1%>)Module</p>
                                         <%
                                         for(int k=0;k<questionPerModule;k++){
                                         int no=rd.nextInt(question.size());
                                         System.out.println(no);
                                         %>
                                         <p><%=k+1%>) <%=question.get(no)%></p>       
                                         <%
                                             }
                                     }
                                     %>
                                 </div>
                                 <div class="" style="text-align: center;">
                                 <button style="background-color:#4b3e8a;color:white;width:50x;height:30px;border-radius: 20px;" onclick="window.print()">Download</button>
                                 </div>
            </div>
        </div>
                                     <%
                                     }
                                     %>
    </body>
</html>

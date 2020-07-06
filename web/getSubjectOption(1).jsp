
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%
             String course_id=request.getParameter("course_id");
                String sem_id=request.getParameter("sem_id");
                SqlUtil.connectDatabase();
                String query="select * from course_subject,subject where course_subject.subject_id=subject.subject_id and course_id="+course_id+" and semester="+sem_id+"";
                 ResultSet rs=SqlUtil.read(query);
                JSONArray jsonArray = new JSONArray();
                System.out.println("hellohhj");  
                while(rs.next())
                {
                    System.out.println("hepology");     
                    JSONObject json=new JSONObject();
                    System.out.println(query);     
                 json.put("subject_id",rs.getString("subject_id"));
                 System.out.println(query);     
                 json.put("subject_name",rs.getString("subject_name"));
                 System.out.println(query);     
                 jsonArray.add(json);
                 System.out.println(jsonArray);
                        }
         out.println(jsonArray);
            %>
   

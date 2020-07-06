


<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.util.HashMap"%>
<%@page import="jdbc.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    
        
       
    <% HashMap<Integer,String> map=new HashMap<Integer,String>();
                String id=request.getParameter("course_id");
                System.out.println(id);
                int course_id=Integer.parseInt(id);
                System.out.println(course_id);
                String query="select * from subjects where course_id='"+course_id+"'";
                 System.out.println(query);     
                ResultSet rs=SqlUtil.read(query);
                
                JSONArray jsonArray = new JSONArray();
                
                while(rs.next()){
                    JSONObject json=new JSONObject();
                 json.put("sid",rs.getInt("id"));
                 json.put("sname",rs.getString("subject_name"));
                
                 jsonArray.add(json);
                        }
         out.println(jsonArray);
        
                 %>

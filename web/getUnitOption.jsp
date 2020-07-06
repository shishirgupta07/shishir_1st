
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%
             String subject_id=request.getParameter("subject_id");
                SqlUtil.connectDatabase();
                String query="select * from subject_unit,unit where subject_unit.unit_id=unit.unit_id and subject_id="+subject_id+"";
                 ResultSet rs=SqlUtil.read(query);
                JSONArray jsonArray = new JSONArray();
                System.out.println("hellohhj");  
                while(rs.next())
                {
                    System.out.println("hepology");     
                    JSONObject json=new JSONObject();
                    System.out.println(query);     
                 json.put("unit_id",rs.getString("unit_id"));
                 System.out.println(query);     
                 json.put("unit_name",rs.getString("unit_name"));
                 System.out.println(query);     
                 jsonArray.add(json);
                 System.out.println(jsonArray);
                        }
         out.println(jsonArray);
            %>
   

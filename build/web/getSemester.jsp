<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<% try{
                String id=request.getParameter("course_id");
                System.out.println(id);
               
                String query="select * from course_semester where course_id='"+id+"'";
                System.out.println(query);     
                ResultSet rs=SqlUtil.read(query);
                JSONArray jsonArray = new JSONArray();
                System.out.println("hellohhj");  
                while(rs.next())
                {
                    System.out.println("hepology");     
                    JSONObject json=new JSONObject();
                    System.out.println(query);     
                 json.put("semid",rs.getString("semester"));
                 System.out.println(query);     
                 json.put("sem",rs.getString("semester"));
                 System.out.println(query);     
                 jsonArray.add(json);
                 System.out.println(jsonArray);
                        }
         out.println(jsonArray);
}
catch(Exception e){
    System.out.println(e);
}
%>



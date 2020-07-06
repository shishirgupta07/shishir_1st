


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.util.Date"%>

   <%
              try{
                 String Instructor=    request.getParameter("Instructor");
                 System.out.println(Instructor);
                String FirstName=    request.getParameter("FirstName");
                System.out.println(FirstName);
                String LastName=    request.getParameter("LastName");
                System.out.println(LastName);
                 String Password=    request.getParameter("Password");
                 System.out.println(Password);
                 String ConPassword=   request.getParameter("ConPassword");
                 System.out.println(ConPassword);
                 String Dob=    request.getParameter("Dob");
                 System.out.println(Dob);
                 String Email=    request.getParameter("Email");
                 System.out.println(Email);
                 String Mobile=    request.getParameter("Mobile");
                 System.out.println(Mobile);
                  String State=    request.getParameter("State");
                  System.out.println(State);
                   String City=    request.getParameter("City");
                   System.out.println(City);
                
                   Date dt= new SimpleDateFormat("yyyy-mm-dd").parse(Dob);;
       java.sql.Date sqldate=new java.sql.Date(dt.getTime()); 
                SqlUtil.connectDatabase();
                System.out.println(sqldate);
                String qri="insert into instructor(instructor_id,first_name,last_name,date_of_birth,email,mobile_number,state,city) values('"+Instructor+"','"+FirstName+"','"+LastName+"','"+sqldate+"','"+Email+"','"+Mobile+"','"+State+"','"+City+"')";
                System.out.println(qri); 
                int no=SqlUtil.insert(qri);
                System.out.println(no);
                
                if(no>0){ %>
                <script> document.location.href="instructor_management.jsp"; </script>
                   <% }
                    else{
               %>
                <h1>you have not entered all the fields</h1>
                <% }
                  }catch(Exception e){%>
                  <h1>
                      you haven't field all the entries
                  </h1>

                   <%} %>
              
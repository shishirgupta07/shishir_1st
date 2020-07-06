<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.SqlUtil"%>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Material Design Bootstrap Template</title>
    <link  rel="stylesheet" type="text/css" href="compiled.css">
    <link  rel="stylesheet" type="text/css" href="compiled2.css">
     <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
     <style type="text/css" >
         
         select{
             color: #f39c12;
    box-shadow: none;
    border: 0 !important;
    background: #2c3e50;
    position: relative;
    flex: 1;
    padding: 0 .5em;
    color: #fff;
    cursor: pointer;
    display: flex;
    width: 20em;
    height: 3em;
    line-height: 3;
    background: #4b3e8a;
    overflow: hidden;
    border-radius: .25em;
    background-image: none;

         }
         
         
     </style>
    </head>
 <body  class="">
      <div class="container">
            <form id="form">
              <table class="table table-hover">
                <tr class="row">
                   <td class="column">
                    </td>
                     <td class="column" >
          <select  class="browser-default" id="course_select">
         <option value="" >select course</option>
 <% 
               SqlUtil.connectDatabase();
                String qry="select * from course";
                ResultSet rs=SqlUtil.read(qry);
                while(rs.next()){
    %>
    <option  value="<%=rs.getString("courseid")%>" selected=""><%=rs.getString("course")%></option>
    <%}%>    
            </select>
                     </td>
                    <td class="column">
                         <select class="browser-default" id="subject_select">
                          <option value="" >select subject</option> 
                         </select>
                     </td>
                     <td class="column" >
                       <select class="browser-default" id="unit_select">
                        <option value="" >select unit</option>  
                       </select>

                     </td>
                </tr>
                <tr>
                   <td>
                      <input type="submit" name="submit">
                   </td>
                   
                   
                </tr>
              </table>
            </form>
          
        </div>
      <script type="text/javascript" src="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.8.10.min.js"></script>
    
<script type="text/javascript">
     $(document).ready(function(){
         $('#course_select').change(function(){
          $('#subject_select').find('option').not(':first').remove();
                var course_id = $('#course_select').val();
                var datastring="course_id="+course_id;
                  $.ajax({
      type:"POST",
      url:"getSubjects1.jsp",
      
      data:datastring,
      success:function(result)
      {
        console.log(result)
        var obj=JSON.parse(result);
       console.log(obj)
       var end= $('#subject_select').find('option').remove().end();
       end.append('<option value="" selected disabled>Subject</option>');
            for (var i=0;i<obj.length;i++){
       end.append('<option value="'+obj[i].sid+'">'+obj[i].sname+'</option>');
            }
       }
     });
         });
         
     });
   </script>
   </script>    

   </body>
</html>
    


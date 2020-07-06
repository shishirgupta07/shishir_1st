
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbcpackage.SqlUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class outputText extends HttpServlet{
  PrintWriter out;
public String course_name,subject_name;
  @Override
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
   out=response.getWriter();
 String course_id=request.getParameter("course_id");
 String subject_id=request.getParameter("subject_id");
 String unit_name=request.getParameter("unit_name");
 try{
     SqlUtil.connectDatabase();
     String query="select course_name from courses where id="+course_id+"";
     ResultSet rs=SqlUtil.read(query);
     if(rs.next()){
         course_name=rs.getString(1);
     }
     String query1="select subject_name from subjects where id="+subject_id+"";
     ResultSet rs1=SqlUtil.read(query1);
     if(rs1.next()){
         course_name=rs.getString(1);
     }
     out.println("your selected course"+course_name+"");
     out.println("your selected subject"+subject_name+"");
     out.println("your selected unit"+unit_name+"");
   }
 catch(Exception e){
     out.println(e);
 }
 
}
}
    


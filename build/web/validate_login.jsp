<%-- 
    Document   : validate_login
    Created on : Dec 18, 2019, 1:34:54 PM
    Author     : HP
--%>
<%@page import="jdbcpackage.SqlUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <%
                String username=request.getParameter("username");
                String password=request.getParameter("password");
                String admin=request.getParameter("admin");
                SqlUtil.connectDatabase();
                int flag=0;
                if(admin.equals("instructor")){
                String qry="select * from login";
                    ResultSet rs1 = SqlUtil.read(qry);
                    while(rs1.next()) {
                       if(username.equals(rs1.getString("id"))&&password.equals(rs1.getString("password"))){
                              out.println("okinstructor");
                              flag=1;
                          }
                    }
                }else {
                    String qry="select * from login";
                    ResultSet rs2 = SqlUtil.read(qry);
                    while(rs2.next()) {
                       if(username.equals(rs2.getString("id"))&&password.equals(rs2.getString("password"))){
                                out.println("okadmin");
                                flag=1;
                          }
                    }
                    }
               if(flag==0){
                   out.println("notok");
                    }
                      %>
package jdbc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class SqlUtil {
   final static String USERNAME="root";
  final static String PASSWORD="Root";
  final static String DBNAME="coursemanage";
  final static String DBURL="jdbc:mysql://localhost:3306/"+DBNAME;
  static Connection conn;
  static Statement stmt;
 public static void connectDatabase() throws ClassNotFoundException,SQLException{
      Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
    stmt=conn.createStatement();
  }
  
 public static int insert(String qry) throws SQLException{
      int rs=-1;
   if(qry!=null) {
      rs= stmt.executeUpdate(qry);
   }  
   return rs;
  }
 public static int update(String qry) throws SQLException{
      int rs=-1;
   if(qry!=null) {
      rs= stmt.executeUpdate(qry);
   }  
   return rs;
  }
 public static int delete(String qry) throws SQLException{
      int rs=-1;
   if(qry!=null) {
      rs= stmt.executeUpdate(qry);
   }  
   return rs;
  }
  public static ResultSet read(String qry) throws SQLException{
        ResultSet rs=null;
        if (qry!=null) {
           rs= stmt.executeQuery(qry);
        }
        return rs;
    }
    public static void close() throws SQLException{
        if(stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}

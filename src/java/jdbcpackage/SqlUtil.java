package jdbcpackage;

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
  final static String PASSWORD="root";
  final static String DBNAME="qpg";
  final static String DBURL="jdbc:mysql://localhost:3306/"+DBNAME;
  static Connection conn;
  static Statement stmt;
  static public void connectDatabase() throws ClassNotFoundException,SQLException{
      Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
    stmt=conn.createStatement();
  }
  
  static public int insert(String qry) throws SQLException{
      int rs=-1;
   if(qry!=null) {
      rs= stmt.executeUpdate(qry);
   }  
   return rs;
  }
  static public int update(String qry) throws SQLException{
      int rs=-1;
   if(qry!=null) {
      rs= stmt.executeUpdate(qry);
   }  
   return rs;
  }
  static public ResultSet count(String qry) throws SQLException{
      ResultSet rs=null;
   if(qry!=null) {
      rs= stmt.executeQuery(qry);
   }  
   return rs;
  }
 
   static public ResultSet read(String qry) throws SQLException{
        ResultSet rs=null;
        if (qry!=null) {
           rs= stmt.executeQuery(qry);
        }
        return rs;
    }
    static public void close() throws SQLException{
        if(stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}

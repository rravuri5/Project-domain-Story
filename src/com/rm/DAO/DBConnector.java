package com.rm.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
  DBConnector db;
  static Connection con;
  private DBConnector() throws ClassNotFoundException,SQLException{
	  if(con==null)
		  Class.forName("com.mysql.jdbc.Driver");
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","mani");
  
  }
  public static Connection getConnection() throws ClassNotFoundException,SQLException {
	  new DBConnector();
	  return con;
  }
}

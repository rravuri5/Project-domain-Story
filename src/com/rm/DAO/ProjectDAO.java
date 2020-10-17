package com.rm.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rm.model.Project;

public class ProjectDAO {
  Connection con;
  public boolean insertProject(Project p) {
	try {
		con=DBConnector.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into project values(?,?,?,?)");
		pst.setInt(1, p.getId());
		pst.setString(2,p.getTitle());
		pst.setString(2,p.getDescription());
		pst.setString(4,p.getDomain());
		pst.execute();
		return true;
	}catch (SQLException e)  {
		e.printStackTrace();
		
	}catch (ClassNotFoundException e)  {
		e.printStackTrace();
		
	}
	return false;
	
	
	
	
	
	
	
	
	
  }
}

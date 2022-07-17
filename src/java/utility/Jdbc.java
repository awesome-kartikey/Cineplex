package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public Jdbc() 
    {
    }
    
    public static Connection getConnection() 
    {
          String url = "jdbc:mysql://localhost:3307/";
          String dbName = "ostc";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "mysql";
          Connection conn = null;
          try {
          Class.forName(driver).newInstance();
          conn = DriverManager.getConnection(url+dbName,userName,password);
          } 
          catch (Exception e) 
          {
      		System.out.println("ERROR in getConnection : " + e);
        	  e.printStackTrace();
          }
          return conn;
    }

    public static Statement getStatement(Connection con)
    {
    	Statement  stmt = null;
    	try
    	{
		  stmt = con.createStatement();
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR in getStatement : " + e);    		
    		
    	}
		  
        return stmt;
    }
    
    public static ResultSet executeQuery( Statement stmt, String sql)
    {
    	ResultSet rs = null;
    	try
    	{
		  rs = stmt.executeQuery(sql);
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR in executeQuery : " + e);
    	}
		  
        return rs;
    }
    public static int executeUpdate( Statement stmt, String sql)
    {
    	int n=0;
    	try
    	{
		  n = stmt.executeUpdate(sql);
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR in executeUpdate : " + e);
    	}
		  
        return n;
    }
	public static boolean closeConn(Connection con)
	{
		try
		{
			con.close();
			return true;
		}catch(Exception e)
		{
			System.out.println("ERROR in closeConn : " + e);
		}
		return false;
	}
	
	public static boolean closeStatement(Statement s)
	{
		try
		{
			s.close();
			return true;
		}catch(Exception e)
		{
			System.out.println("ERROR in closeStmt : " + e);
		}
		return false;
	}
	
	public static boolean closeResultSet(ResultSet rs)
	{
		try
		{
			rs.close();
			return true;
		}catch(Exception e)
		{
			System.out.println("ERROR in closeResultSet : " + e);
		}
		return false;
	}
	
    
    
}




    <%@ page import="utility.*"%>
    <%@ page import="java.sql.*" %>

<%!

	String getCityList()
	{
                String sql = "Select * from city";				
                Connection con = Jdbc.getConnection();
                Statement stmt = Jdbc.getStatement(con);
                ResultSet rs=Jdbc.executeQuery(stmt,sql);

		String clist="";
		try 
		{
			while(rs.next())
			{		
				clist = clist+"<option value="+ rs.getInt("cid")+">"+rs.getString("cname")+"</option>";
			}
		}
		catch(Exception e)
		{
			//out.print("ERROR Getting City List :" + e);
		}
		return clist;		
	}

	String getShowTimingList(int hid, int mid)
	{
                String sql = "Select * from slots where hid="+hid+" and mid="+ mid;				
                Connection con = Jdbc.getConnection();
                Statement stmt = Jdbc.getStatement(con);
                ResultSet rs=Jdbc.executeQuery(stmt,sql);

		String clist="";

		try 
		{

			while(rs.next())
			{		
				clist = clist+"<option value="+rs.getInt("slot")+">"+rs.getInt("slot")+"</option>";
			}
		}
		catch(Exception e)
		{
			//out.print("ERROR Getting City List : "+e);
		}
		return clist;		
	}
	String getCategorySubMenu()
	{
                String sql = "Select * from category";				
                Connection con = Jdbc.getConnection();
                Statement stmt = Jdbc.getStatement(con);
                ResultSet rs=Jdbc.executeQuery(stmt,sql);

		String clist="";
		try 
		{
			while(rs.next())
			{		
				clist = clist+"<HR color=green><a href=DisplayCategoryMovie.jsp?catid="+rs.getInt("catid")+" style=\"color:white;text-decoration:none;\">"+rs.getString("catname")+"</a>";
			}
				
		}
		catch(Exception e)
		{
			//out.print("ERROR Getting Category Sub Menu List : "+e);
		}
		return clist;		
	}
	
	
%>

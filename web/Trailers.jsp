<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@ page import="utility.*"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  type="text/css" href="css.css">	
    </HEAD>
	<BODY>
	
            <%@include file="helper.jsp" %>
            <%@include file="header.jsp" %>
            <%
			ArrayList<String> movieList = new ArrayList<String>(2);
			boolean recFound=false;
			int i=0;
			
			try 
			{
				
				String sql = "Select * from movies m";	
                                    
                                Connection con = Jdbc.getConnection();
                                Statement stmt = Jdbc.getStatement(con);
                                ResultSet rs=Jdbc.executeQuery(stmt,sql);
                                
				while(rs.next()) 
				{		
					movieList.add(rs.getString("mname"));								
                                        movieList.add(rs.getString("img"));								
                                        movieList.add(rs.getString("director"));								
                                        movieList.add(rs.getString("producer"));								
                                        movieList.add(rs.getString("cast"));								
                                        movieList.add(rs.getString("language"));								
                                        movieList.add(rs.getString("rdate"));	
                                        
					recFound = true;
					i++;
				}				
			}
			catch(Exception e)
			{
				out.print("ERROR Booking : "+e);
			}
			
		%>	
		<br><br><br>
		
				
		<div id=outer>
			<div style="float:center;">Movie Trailors</div>
		</div>
		
			<% 
				if(!recFound)
				{
			%>
				<div id=inner>No Matching Record Not Found</div>
			<%					
				}
				else
				{
			%>
			
					<div id=outer>
			<%
					for(i=0;i<movieList.size();i++)
					{
			%>
						
							<div id=inner>
									<Img src="<%=movieList.get(i)%>" width=200 height=200>
							</div>
					<% } %>
					</div>
			%>					
		
		
	</BODY>
</HTML>
<%@include file="helper.jsp" %>
<div class="menu" style="background-color:red;">
	<div  id="mdiv" style="float:left;">
		Book Movie
		
		<div  id="sdiv">
			<HR color=green>
			<?php include "SelectCityForBooking.php"; ?>
		</div>		
	</div>
	<div id="mdiv"  style="float:left;">
		Upcomming Movies
		<div  id="sdiv">
			<HR color=green>
			<a href="DisplayUpcomming.jsp?indid=1" style="color:white;text-decoration:none;">Bollywood Movies</a>
			<HR color=green>
			<a href="DisplayUpcomming.jsp?indid=2" style="color:white;text-decoration:none;">Hollywood Movies</a>
		</div>		
	</div>
	<div id="mdiv"  style="float:left;">
		Running Movies
		<div  id="sdiv">
			<HR color=green>
			<?php include "SelectCity.php"; ?>
		</div>		
	</div>
	<div id="mdiv"  style="float:left;">
		Movies by Category
		<div  id="sdiv">			
			<%=getCategorySubMenu()%>
		</div>		
	</div>
	
</div>


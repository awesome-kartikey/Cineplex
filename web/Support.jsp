
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"  type="text/css" href="css.css">	
    </HEAD>
    <BODY>
	
		<%@include file="header.jsp" %>
		<br><br><br>
		<div id=outer>
			Support Center		
		</div>
		
		<div id=outer>
			<div id=inner>Support through mail : support@cineplex.com</div>
			<div id=inner>Support through call : 011-223344, 223345, 223346, 223347</div>
		</div>
		<div id=outer>
			<div style="float:left;margin-left:15px;">
				<div>Name</div>
				<div><input style="width:310px" type=text name=txtName></div>
				<div>Email</div>
				<div><input style="width:310px" type=text name=txtEmail></div>			
				<div>Issue</div>
				<div>
					<select style="width:310px" name=sltIssue>
						<option>Booking related issues</option>
						<option>Cinema related issues</option>
						<option>Ticket related issues</option>
						<option>Payment related issues</option>
						<option>Service related issues</option>
						<option>Offer related issues</option>
						<option>Gift Card related issues</option>					
						<option>Other issues</option>					
					</select>
				</div>
				<div>Message</div>
				<div><textarea rows=5 cols=40></textarea></div>	
				<div><input type=Submit name=btnSubmit style="background-color:grey;width:310px"></div>			
			</div>
			<div style="float:left;margin-left:20px;width:70%;">
				
					<div>Knowledge Base</div>
					<hr color=red>
					<div  style="color:yellow;">Frequently Asked Questions</div>
					<br><br>
					<div><tab><tab>1.	What steps are to be followed to book tickets ?</div><br>
					<div><tab><tab>2.	Is the site secured in terms of online payments ?</div><br>
					<div><tab><tab>3.	What steps are to be followed to cancel tickets ?</div><br>
					<div><tab><tab>4.	My account is debited with ticket amount but ticket information mail not received</div><br>
					<div><tab><tab>5.	What is Gift Card? How I can get it ?</div><br>
					
			</div>
			
		</div>

	</body>
</html>

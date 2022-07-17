package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.*;
import java.sql.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



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
	
	

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/SignUp.jsp");
    _jspx_dependants.add("/SignIn.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/helper.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("\t<HEAD>\n");
      out.write("\t\t<link rel=\"stylesheet\"  type=\"text/css\" href=\"css.css\">\t\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tbody {font: normal 0.9em Arial;color:#222;}\n");
      out.write("\t\t\theader {display:block; font-size:1.2em;margin-bottom:100px;}\n");
      out.write("\t\t\theader a, header span {\n");
      out.write("\t\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\t\tpadding: 4px 8px;\n");
      out.write("\t\t\t\tmargin-right: 10px;\n");
      out.write("\t\t\t\tborder: 2px solid #000;\n");
      out.write("\t\t\t\tbackground: #DDD;\n");
      out.write("\t\t\t\tcolor: #000;\n");
      out.write("\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\theight: 20px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\theader span {background:white;}\n");
      out.write("\t\t\ta {color: #1155CC;}\n");
      out.write("                        li{\n");
      out.write("                            display: inline-block;\n");
      out.write("                            border:0px solid white;\n");
      out.write("                        }\n");
      out.write("                        img{\n");
      out.write("                            width:250px;height:220px;\n");
      out.write("                        }\n");
      out.write("                        .img11{\n");
      out.write("                            transform: perspective(500px)  translateX(1px) translateZ(30px) rotateY(20deg); \n");
      out.write("                        }\n");
      out.write("                        .img1{\n");
      out.write("                            transform: perspective(500px) translateX(-1px) translateZ(-30px) rotateY(-20deg); \n");
      out.write("                        }\n");
      out.write("                        .img3{\n");
      out.write("                             transform: perspective(500px) translateX(-1px) translateZ(-30px) rotateY(-20deg); \n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("\t\t</style>\n");
      out.write("                <SCRIPT>\n");
      out.write("                    function slider()\n");
      out.write("                        {\n");
      out.write("                          a=document.getElementById(\"s1\").src;\n");
      out.write("                          document.getElementById(\"s1\").src=   document.getElementById(\"s2\").src;\n");
      out.write("                          document.getElementById(\"s2\").src=   document.getElementById(\"s3\").src;\n");
      out.write("                          document.getElementById(\"s3\").src=   document.getElementById(\"s4\").src;\n");
      out.write("                          document.getElementById(\"s4\").src=   document.getElementById(\"s5\").src;\n");
      out.write("                          \n");
      out.write("                          document.getElementById(\"s5\").src=a;\n");
      out.write("                          \n");
      out.write("                          setTimeout(slider,10000);\n");
      out.write("                        }\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\t</HEAD>\n");
      out.write("\t<BODY onload=\"slider();\">\n");
      out.write("            ");
      out.write("<div style=\"width:100%;\">\n");
      out.write("\t<div  id=\"hdiv\" style=\"float:left;background-color:red;width:30%;\">\n");
      out.write("\t\tFor You 24 x 7 : 1800 111 9999\n");
      out.write("\t</div>\n");
      out.write("\t<div  id=\"hdiv\" style=\"float:left;background-color:green;width:35%;\">\n");
      out.write("\t\t<a href=\"Home.jsp\" style=\"color:white;text-decoration:none;\">Home</a> | \n");
      out.write("\t\t<a href=\"Trailers.jsp\" style=\"color:white;text-decoration:none;\">Trailers</a> | \n");
      out.write("\t\t<a href=\"Support.jsp\" style=\"color:white;text-decoration:none;\">Support</a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div   id=\"hdiv\" style=\"float:left;background-color:red;width:30%;\">\n");
      out.write("\t\t<a href=\"GiftCards.jsp\" style=\"color:white;text-decoration:none;\">Gift Cards</a> | \n");
      out.write("\t\t<a href=\"Offers.jsp\" style=\"color:white;text-decoration:none;\">Offers</a> | \n");
      out.write("\t\t<a class=signup href=\"#\" style=\"color:white;text-decoration:none;\">Sign Up |\n");
      out.write("\t\t\t");
      out.write("<form class=frmSignUp action=\"storeCust.jsp\" method=\"post\">\n");
      out.write("<div id=\"fdiv\">\n");
      out.write("\t<p style=\"margin-left:10;\">\n");
      out.write("\tName\n");
      out.write("\t<BR><input type=text name=txtName size=32>\n");
      out.write("\t<BR><BR>Contact\t\t\t\n");
      out.write("\t<BR><input type=text name=txtContact size=32>\n");
      out.write("\t<BR><BR>Email Address\n");
      out.write("\t<BR><input type=text name=txtEmail size=32>\n");
      out.write("\t<BR><BR>Password\n");
      out.write("\t<BR><input type=text name=txtPass size=32>\n");
      out.write("\t<BR><BR>Confirm Password\n");
      out.write("\t<BR><input type=text name=txtCPass size=32>\n");
      out.write("\t\n");
      out.write("\t<HR  width=95%>\n");
      out.write("\t\t<input type=submit name=btnSubmit size=30 style=\"background-color:grey;margin-left:10;width:250\">\n");
      out.write("\t<HR  width=95%>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<a class=signin href=\"#\" style=\"color:white;text-decoration:none;\">Sign In\n");
      out.write("                    ");
      out.write("<form class=frmSignIn action=\"validate.jsp\" method=POST>\n");
      out.write("\t<div  id=\"fdiv\">\n");
      out.write("\t\t<p align=left style=\"margin-left:10px\"> \n");
      out.write("\t\t\tEmail \n");
      out.write("\t\t\t<BR><input type=\"text\" name=\"txtEmail\" size=\"24\"/> \n");
      out.write("\t\t\t<BR><BR>Password                                             \n");
      out.write("\t\t\t<BR><input type=\"text\" name=\"txtPass\" size=\"24\"/> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<HR  width=95%>\n");
      out.write("\t\t\t\t<input type=submit name=btnSubmit value=\"Login\" style=\"background-color:grey;width:200;\">\n");
      out.write("\t\t\t<HR  width=95%>\t\t\t\t\t\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\t\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            <!--start-->\n");
      out.write("    <div style=\"padding:40px 0;\">\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <img id=\"s1\" class=\"img1\" src=\"homeSlider/1.jpg\">\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img  id=\"s2\" class=\"img3\" src=\"homeSlider/2.jpg\">\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img  id=\"s3\" class=\"img1\" src=\"homeSlider/3.jpg\">\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img  id=\"s4\"  class=\"img3\" src=\"homeSlider/4.jpg\">\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <img id=\"s5\" class=\"img1\" src=\"homeSlider/5.jpg\">\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--end-->\n");
      out.write("            ");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"menu\" style=\"background-color:red;\">\n");
      out.write("\t<div  id=\"mdiv\" style=\"float:left;\">\n");
      out.write("\t\tBook Movie\n");
      out.write("\t\t\n");
      out.write("\t\t<div  id=\"sdiv\">\n");
      out.write("\t\t\t<HR color=green>\n");
      out.write("\t\t\t<?php include \"SelectCityForBooking.php\"; ?>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"mdiv\"  style=\"float:left;\">\n");
      out.write("\t\tUpcomming Movies\n");
      out.write("\t\t<div  id=\"sdiv\">\n");
      out.write("\t\t\t<HR color=green>\n");
      out.write("\t\t\t<a href=\"DisplayUpcomming.jsp?indid=1\" style=\"color:white;text-decoration:none;\">Bollywood Movies</a>\n");
      out.write("\t\t\t<HR color=green>\n");
      out.write("\t\t\t<a href=\"DisplayUpcomming.jsp?indid=2\" style=\"color:white;text-decoration:none;\">Hollywood Movies</a>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"mdiv\"  style=\"float:left;\">\n");
      out.write("\t\tRunning Movies\n");
      out.write("\t\t<div  id=\"sdiv\">\n");
      out.write("\t\t\t<HR color=green>\n");
      out.write("\t\t\t<?php include \"SelectCity.php\"; ?>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"mdiv\"  style=\"float:left;\">\n");
      out.write("\t\tMovies by Category\n");
      out.write("\t\t<div  id=\"sdiv\">\t\t\t\n");
      out.write("\t\t\t");
      out.print(getCategorySubMenu());
      out.write("\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</BODY>\n");
      out.write("</HTML>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

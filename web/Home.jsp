
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<HTML>
	<HEAD>
		<link rel="stylesheet"  type="text/css" href="css.css">	
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<style>
			body {font: normal 0.9em Arial;color:#222;}
			header {display:block; font-size:1.2em;margin-bottom:100px;}
			header a, header span {
				display: inline-block;
				padding: 4px 8px;
				margin-right: 10px;
				border: 2px solid #000;
				background: #DDD;
				color: #000;
				text-decoration: none;
				text-align: center;
				height: 20px;
			}
			header span {background:white;}
			a {color: #1155CC;}
                        li{
                            display: inline-block;
                            border:0px solid white;
                        }
                        img{
                            width:250px;height:220px;
                        }
                        .img11{
                            transform: perspective(500px)  translateX(1px) translateZ(30px) rotateY(20deg); 
                        }
                        .img1{
                            transform: perspective(500px) translateX(-1px) translateZ(-30px) rotateY(-20deg); 
                        }
                        .img3{
                             transform: perspective(500px) translateX(-1px) translateZ(-30px) rotateY(-20deg); 
                        }
                        
		</style>
                <SCRIPT>
                    function slider()
                        {
                          a=document.getElementById("s1").src;
                          document.getElementById("s1").src=   document.getElementById("s2").src;
                          document.getElementById("s2").src=   document.getElementById("s3").src;
                          document.getElementById("s3").src=   document.getElementById("s4").src;
                          document.getElementById("s4").src=   document.getElementById("s5").src;
                          
                          document.getElementById("s5").src=a;
                          
                          setTimeout(slider,10000);
                        }
                </script>

	</HEAD>
	<BODY onload="slider();">
            <%@include  file="header.jsp" %>
            <!--start-->
    <div style="padding:40px 0;">
        <div>
            <div>
                <ul>
                    <li>
                        <img id="s1" class="img1" src="homeSlider/1.jpg">
                    </li>
                    <li>
                        <img  id="s2" class="img3" src="homeSlider/2.jpg">
                    </li>
                    <li>
                        <img  id="s3" class="img1" src="homeSlider/3.jpg">
                    </li>
                    <li>
                        <img  id="s4"  class="img3" src="homeSlider/4.jpg">
                    </li>
                    <li>
                        <img id="s5" class="img1" src="homeSlider/5.jpg">
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--end-->
            <%@include  file="menu.jsp" %>
		
	</BODY>
</HTML>

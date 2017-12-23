<!-- 
/***********************************************************
*													
*														
*	项目名称：				
*	子系统名：			
*	功能名称：	
*	完成人员：					
*	完成时间：					
*								
*									
************************************************************/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
   
    <title>小型图书资料管理系统登录</title>
    <link href="CSS/style.css" rel="stylesheet">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body background="images/3.jpg" bgcolor="#eeeeee">
  <image src="../images/3.jpg"  width="660" height="230"
     alt="图书资料管理系统" />
     
  <!-- 注意下面一定要用user.username和user.userpass -->
<form method="post" action="login.action" name="frm">
	
<h3 align="center">
   <font color="#FF3399" size="+3" face="微软雅黑">
      
        WELCOME TO THE MINILIBRARY 
   </font>   
<p></p>
<p> 
<font color="#0033FF" size="+1" face="微软雅黑">
	   USERNAME： <input type="text" size="30" name="user.username" value="admin"><br/>
	   <p>
	   PASSWORD： <input type="password" size="30" name="user.userpass" value="123456"><br/>
	   <p>
	  <input type="submit" value="Login" name="login">
	  <input type="reset" value="Reset" name="reset">
	  <br/><br/>
	  <p>
	  
      Copyright@ 2009-2017 LiaoNing Normal University
</h3>
	</form>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加图书</title>
</head>
<body background="images/8.gif">
<form method="post" action="addTitlemanageTitlesAction.action">
<h3 align="center">
   <font color="#FF3399" size="+3" face="微软雅黑">
 
<br>
书名：
<input type="text" name="book.title" value="解忧杂货铺">
<br>
作者：
<input type="text" name="book.author" value="东野圭吾">
 
<br>
<input type="submit" name = "sumbit" value = "增加图书">
</font>
</h3>

</form>
</body>
</html>
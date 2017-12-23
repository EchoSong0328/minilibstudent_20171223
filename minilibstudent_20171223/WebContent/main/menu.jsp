<!-- 
/***********************************************************
*                         
*                           
* 项目名称：         
* 子系统名：     
* 功能名称： 
* 完成人员：         
* 完成时间：         
*               
*                 
************************************************************/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><head><title></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <script language="JavaScript" type="text/JavaScript">
  	function showMenu(id){
  		var menu = "menu_" + id;
  		var item=document.getElementById(menu);
  		for(i=1;i<=6;i++){
  			document.getElementById("menu_0" + i).style.display="none";
  		}
  		item.style.display = "block";
  	}
  </script>

</head>

<body>
  <!--  -->
  
  <font color="#0033FF" size="+1" face="微软雅黑">
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%"><tr>
  <td onClick="showMenu('01');" align="center">图书管理</td>
  </tr></table>
  <table border="0" id="menu_01" style="display:block;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href= "../book/AddBook.jsp"  target="main" title="增加图书">增加图书</a></td></tr>
    <tr><td align="center"><a href="../book/QueryBook.jsp" target="main" title="查询图书">查询图书</a></td></tr>
     
  </table>
  
  <!-- -->
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%"><tr>
  <td  onClick="showMenu('02');" align="center">书目管理</td>
  </tr></table>
  <table border="0" id="menu_02" style="display:none;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href="../code/AddPress.jsp" target="main" title="增加出版社">增加出版社</a></td></tr>
    <tr><td align="center"><a href="../code/QueryPress.jsp" target="main" title="查询出版社">查询出版社</a></td></tr>
    <tr><td align="center"><a href="../code/AddType.jsp" target="main" title="增加图书分类">增加图书分类</a></td></tr>
    <tr><td align="center"><a href="../code/QueryType.jsp" target="main" title="查询图书分类">查询图书分类</a></td></tr>
    <tr><td align="center"><a href="../code/AddUserType.jsp" target="main" title="增加用户类型">增加图书分类</a></td></tr>
    <tr><td align="center"><a href="../code/QueryUserType.jsp" target="main" title="查询用户类型">查询图书分类</a></td></tr>
  </table>
  <!--  -->
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%"><tr>
  <td onClick="showMenu('03');" align="center">借阅管理</td>
  </tr></table>
  <table border="0" id="menu_03" style="display:none;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href="../core/AddBorrow.jsp" target="main" title="添加借书">添加借书</a></td></tr>
    <tr><td align="center"><a href="../core/QueryBorrow.jsp" target="main" title="查询借书">查询借书</a></td></tr>
  </table>
  
  <!-- -->  
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%"><tr>
  <td  onClick="showMenu('04');" align="center">领导功能</td>
  </tr></table>
  <table border="0" id="menu_04" style="display:none;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href="#" target="main" title="#">#</a></td></tr>
  </table>


  <!-- --> 
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%" height="12%"><tr>
  <td onClick="showMenu('05');" align="center">读者功能</td>
  </tr></table>
  <table border="0" id="menu_05" style="display:none;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href="#" target="main" title="#">#</a></td></tr>
  </table>
  
  <!-- -->
  <table border="0" bgcolor="#f0f0f0" width="100%" height="12%"><tr>
  <td  onClick="showMenu('06');" align="center">用户管理</td>
  </tr></table>
  <table border="0" id="menu_06" style="display:none;" bgcolor="" width="100%" height="12%">
    <tr><td align="center"><a href="../user/AddUser.jsp" target="main" title="增加用户">增加用户</a></td></tr>
    <tr><td align="center"><a href="../user/QueryUser.jsp" target="main" title="查询用户">查询用户</a></td></tr>
  </table>

  
</body>
</font>
</html>

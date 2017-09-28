<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user.jsp' starting page</title>
    
  </head>
  
  <body>
    	<form action="${pageContext.request.contextPath }/user/modifyUser.action" method="post">
    		<input name="id" type="hidden" value=${user.id }>
    		用户名:<input type="text" value="${user.username}" name="username"><br>
    		密码:<input type="text" value = "${user.password }" name="password"><br>
    		<input type="submit" value="确认">
    	</form>
  </body>
</html>

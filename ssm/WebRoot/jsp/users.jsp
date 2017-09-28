<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title></title>

<style type="text/css">

	.a{
		width:400px;
		margin:100 auto;
	}
</style>
</head>
<body>
	<!-- bootstrap -->
	<div class="a">
		<table border=1>
			<tr>
				<td>用户名称</td>
				<td>用户性别</td>
				<td>用户密码</td>
				<td>用户操作</td>
			</tr>
			<c:forEach items="${users }" var="user">
				<tr>
					<td>${user.username }</td>
					<td>${user.sex }</td>
					<td>${user.password }</td>
					<td><a href="${pageContext.request.contextPath}/user/deleteUserById.action?id=${user.id}">删除</a> <a href="${pageContext.request.contextPath}/user/queryUserById.action?id=${user.id}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

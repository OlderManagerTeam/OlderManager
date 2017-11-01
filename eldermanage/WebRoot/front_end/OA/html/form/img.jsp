<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'img.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div id="newscontent"></div>

	<script type="text/javascript" src="../../js/wangEditor.min.js"></script>
	<script type="text/javascript">
		var E = window.wangEditor
		var newscontent = new E('#newscontent')
		//newscontent.customConfig.debug = true;
		//newscontent.customConfig.uploadImgShowBase64 = true
		//newscontent.customConfig.debug=true;
		newscontent.customConfig.uploadImgServer = 'http://localhost:8080/eldermanage/v1/common/uploadImg.action';
		newscontent.customConfig.uploadFileName = 'file';
		newscontent.customConfig.uploadImgHeaders = {
			'Accept' : 'multipart/form-data'
		};
	
		newscontent.create()
	</script>




</body>
</html>

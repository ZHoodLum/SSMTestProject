<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getjsp(){
		location.href="http://localhost:8089/movebooking/getjsp.action";
	}
</script>
</head>
<body style="text-align: center;">
<h2>登陆界面</h2>
	<form action="${pageContext.request.contextPath}/users/login.action" method="post">
	<table style="margin: 0 auto;margin-top:100px;">
		<tr>
			<td>账号：</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="password"></td>
		</tr>
		
	</table>
	<table style="margin: 0 auto;margin-top:100px;">
		<tr>
			<td><input type="submit" value="登陆" ></td>
			<td><input type="button" value="预约" onclick="getjsp()"></td>
		</tr>
	</table>
	
</form>
</body>
</html>
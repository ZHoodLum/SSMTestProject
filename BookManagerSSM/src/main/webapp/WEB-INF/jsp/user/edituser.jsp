<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/update.action" method="post">
		<table>
			<tr>
				<td>编号：<input type="text" name="id" value="${user.id }"></td></tr>
				<tr><td>名称：<input type="text" name="username" value="${user.username }"></td></tr>
				<tr><td>密码：<input type="text" name="password" value="${user.password }"></td></tr>
			<tr>
			<td colspan="2"> <input type="submit" value="提交"></td>
			</tr>	
		</table>
	</form>
</body>
</html>
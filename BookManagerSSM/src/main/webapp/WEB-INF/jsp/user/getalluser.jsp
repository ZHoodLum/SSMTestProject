<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(id){
		var b = confirm("是否删除？");
		if(b){
			location.href="${pageContext.request.contextPath}/user/delete.action?id="+id;
		}
	}
	
	function getadd(){
		location.href="${pageContext.request.contextPath}/user/getadd.action"
	}
</script>
</head>
<body>
	<table border="1" width="600">
		<tr>
			<td><input type="button" value="添加用户" onclick="getadd()"></td>
		</tr>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td><a href="javascript:del(${user.id})">删除</a></td>
				<td><a href="${pageContext.request.contextPath}/user/edituser.action?id=${user.id}">编辑</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
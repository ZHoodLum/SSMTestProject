<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		location.href="${pageContext.request.contextPath}/emp/getadd.action";
	}
</script>
</head>
<body>
	<table border="1" width="600" style="text-align: center;">
	<c:forEach items="${list}" var="emp">
		<tr>
			<td>${emp.empId }</td>
			<td>${emp.ename }</td>
			<td>${emp.egender == 1?"男":"女" }</td>
			<td>${emp.dept.dname}</td>
			<td><a href="${pageContext.request.contextPath }/emp/edit.action?empId=${emp.empId}">编辑</a></td>
			<td><a href="${pageContext.request.contextPath }/emp/edit.action?empId=${emp.empId}">删除</a></td>
		</tr>
	</c:forEach>
		<tr>
			<td  colspan="6">
				<input type="submit"  value="添加商品" onclick="add()">
			</td>
		</tr>
	</table>
</body>
</html>
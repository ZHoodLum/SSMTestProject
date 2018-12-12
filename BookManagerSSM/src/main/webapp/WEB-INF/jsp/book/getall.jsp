<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del(id){
		var b = confirm("是否删除？");
		if(b){
			location.href="${pageContext.request.contextPath}/book/del.action?id="+id;
		}
	}
	
	function getadd(){
		location.href="${pageContext.request.contextPath}/book/getadd.action";
	}
</script>
</head>
<body>
	<table border="1" width="600">
		<tr colspan="2">
			<td><input type="button" value="添加图书" onclick="getadd()"></td>
		</tr>
		<c:forEach items="${list}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.author}</td>
				<td>${book.publish}</td>
				<td><fmt:formatDate value="${book.publishDate}" pattern="yyy-MM-dd"/></td>
				<td>${book.page}</td>
				<td>${book.price}</td>
				<td>${book.content}</td>
				<td><a href="javascript:del(${book.id})">删除</a></td>
				<td><a href="${pageContext.request.contextPath}/book/edit.action?id=${book.id}">编辑</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
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
	<form action="${pageContext.request.contextPath}/book/update.action" method="post">
		<table>
			<tr>
				<td>图书编号：<input type="text" name="id" value="${book.id }"></td></tr>
				<tr><td>图书名称：<input type="text" name="name" value="${book.name }"></td></tr>
				<tr><td>图书出版社：<input type="text" name="publish" value="${book.publish }"></td></tr>
				<tr><td>作者：<input type="text" name="author" value="${book.author }"></td></tr>
				<tr><td>图书出版日期：<input type="text" name="publishDate" value='<fmt:formatDate value="${book.publishDate}" pattern="yyy-MM-dd"/>'></td></tr>
				<tr><td>图书页数：<input type="text" name="page" value="${book.page }"></td></tr>
				<tr><td>图书单价：<input type="text" name="price" value="${book.price }"></td></tr>
				<tr><td>图书内容：<input type="text" name=content value="${book.content }"></td></tr>
			<tr>
			<td colspan="2"> <input type="submit" value="提交"></td>
			</tr>	
		</table>
	</form>
</body>
</html>
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
	<form action="${pageContext.request.contextPath}/book/add.action" method="post">
		<table>
			<tr>
				<td>图书编号：<input type="text" name="id"></td></tr>
				<tr><td>图书名称：<input type="text" name="name" ></td></tr>
				<tr><td>图书出版社：<input type="text" name="publish"></td></tr>
				<tr><td>作者：<input type="text" name="author" ></td></tr>
				<tr><td>图书出版日期：<input type="date" name="publishDate"></td></tr>
				<tr><td>图书页数：<input type="text" name="page" ></td></tr>
				<tr><td>图书单价：<input type="text" name="price"></td></tr>
				<tr><td>图书内容：<input type="text" name=content></td></tr>
			<tr>
			<td colspan="10"> <input type="submit" value="提交"></td>
			</tr>	
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/scardinfo/search.action">
	<table style="text-align: center;" >
		<tr>
			<td>证书类型：</td>
			<td>
				<select name="stype">
					<option value="0" ${param.stype == 0?"selected":""}>全部</option>
					<c:forEach  items="${list }" var="cardType">
						<option value="${cardType.stype }" ${cardType.stype == param.stype?"selected":"" }>${cardType.cardName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="sname" value="${param.sname }"></td>
		</tr>
		<tr>
			<td>身份证：</td>
			<td><input type="text" name="idCard" value="${param.idCard }"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="查询">
				<input type="submit" value="重置">
			</td>
		</tr>
	</table>
	</form>
	
	<c:if test="${!(empty callback) and (empty infolist) }">
		<div style="color: red">
			无耻学员
		</div>
	</c:if>
	<c:if test="${!(empty infolist) }">
		<table width="500" border="0" style="text-align: center;">
			<c:forEach items="${infolist }" var="card">
				<tr>
					<td>${card.idCard}</td>
					<td>${card.sname}</td>
					<td>${card.cardType.stype}</td>
					<td>${card.cardType.cardName}</td>
				
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	
</body>
</html>
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
<body style="text-align:center">
<h2>顺丰搬家预约订单信息查询</h2>
<table border="1" width="900" style="margin: 0 auto;margin-top:50px;">
			<tr>
				<td width="150">编号</td>
				<td width="150">起始地区</td>
				<td width="150">所用车型</td>
				<td width="150">搬家日期</td>
				<td width="150">联系人</td>
				<td width="150">联系电话</td>
				<td width="200">操作</td>
			</tr>
			<c:forEach items="${list}" var="movebook">
			<tr>
				<td>${movebook.id}</td>
				<td>${movebook.area}</td>
				<td>${movebook.cartype}</td>
				<td>${movebook.contact}</td>
				<td><fmt:formatDate value="${movebook.movedate}" pattern="yyy-MM-dd"/></td>
				<td>${movebook.phone}</td>
				<td>
					<a href="javascript:del(${book.id})">删除</a>
					<a href="${pageContext.request.contextPath}/book/edit.action?id=${book.id}">编辑</a>
				</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>
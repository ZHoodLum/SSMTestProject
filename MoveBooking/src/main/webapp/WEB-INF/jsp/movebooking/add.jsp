<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
</head>
<body style="text-align: center;">
	<h3>顺丰搬家预约登记</h3>
	<form action="${pageContext.request.contextPath }/moveingbook/insert.action" method="post">
		<table border="1" width="600" style="margin: 0 auto;margin-top:50px;">
			<tr>
				<td width="150">起始地区</td>
				<td id="area">
					<select name="area" style="width:150px;">
						<option value="0">海淀区</option>
						<option value="1">朝阳区</option>
						<option value="2" selected="selected">西城区</option>
						<option value="3">东城区</option>
						<option value="4">丰台区</option>
						<option value="5">大兴区</option>
						<option value="6">石景山</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>所用车型</td>
				<td id="movedate">
					<input type="radio" name="movedate">金杯
					<input type="radio" name="movedate">皮卡
					<input type="radio" name="movedate" checked="checked">厢式货车
					<input type="radio" name="movedate">1041货车
				</td>
			</tr>
			<tr>
				<td>搬家日期</td>
				<td id="movedate">
					<input type="date" name="movedate">
				</td>
			</tr>
			<tr>
				<td>联系人</td>
				<td id="contact">
					<input type="text" name="contact">
				</td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td  id="phone">
					<input type="text" name="phone">	
				</td>
			</tr>
			<tr>
				<td colspan="2" id="text1">
					<input type="submit" value="预约登记">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
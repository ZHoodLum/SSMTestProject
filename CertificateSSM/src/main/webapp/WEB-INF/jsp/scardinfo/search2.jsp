<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
//就绪函数，在页面中所有dom元素加载完成时候，运行，比onload事件要先执行
$(function(){
	$(":button").click(function(){
		//得到要提交的数据
		//search2.action?stype=0&sname=徐启&idCard=2389329239832
		var data = $("form").serialize();
		//异步的提交请求
		var url = "${ pageContext.request.contextPath }/scardinfo/search2.action";
		$.post(url,data,function(callbackData){
			//$("#cards").empty();//清空子元素
			$("#cards tr:gt(0)").remove();//移除选择器选中的所有元素
			if(callbackData.length == 0){
				alert("无此学员");
				return;
			}
						
			//遍历返回的json数组
			for(i = 0;i < callbackData.length;i++){
				var card = callbackData[i];
				var tr = $("<tr>").appendTo("#cards");
				$("<td>").text(card.sid).appendTo(tr);//链式编程
				$("<td>").text(card.sname).appendTo(tr);
				$("<td>").text(card.idCard).appendTo(tr);
				$("<td>").text(card.cardType.stype).appendTo(tr);
				$("<td>").text(card.cardType.cardName).appendTo(tr);
				
				$("<td>").append("<a href='#' onclick='del(this,"+card.sid+")'>删除</a>").appendTo(tr);
			}
		});
		//把远程服务器返回的json格式数组，加载到页面中
	});
});

function del(a,sid){
	if(!confirm("是否删除？")){
		return;
	}
	
	var url = "${ pageContext.request.contextPath }/scardinfo/del.action";
	var data = "sid="+sid;
	$.post(url,data,function(callbackData){
		if(callbackData == 1){
			//a为dom元素，不是jQuery对象，不能调用jQuery的方法，所以必须把dom元素转换为jQuery对象
			$(a).parent().parent().remove();
		}else{
			alert("删除失败");
		}
	});
}
</script>

<title>Insert title here</title>
</head>
<body>
	<form action="${ pageContext.request.contextPath }/scardinfo/search.action" method="post">
	<table>
		<tr>
			<td>证书类型：</td>
			<td>
				<select name="stype">
					<option value="0">全部</option>
					<c:forEach items="${ list }" var="cardType">
						<option value="${ cardType.stype }">${ cardType.cardName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="sname" value="${ param.sname }"></td>
		</tr>
		<tr>
			<td>身份证：</td>
			<td><input type="text" name="idCard" value="${ param.idCard }"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="查询"><input type="reset" value="重置"></td>
		</tr>
	</table>
	</form>	
	
	<table id="cards" border="1" width="500">
		<tr>
			<th>证书编号</th><th>姓名</th><th>身份证号</th><th>证书类型编号</th><th>证书类型名称</th><th>删除</th>
		</tr>
	</table>
</body>
</html>





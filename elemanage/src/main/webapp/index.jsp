<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function(){
	$("[value='查询']").click(function(){
		var url = "${ pageContext.request.contextPath }/elecust/getbyid.action";
		var data = $("[name='cardId']").serialize();//?cardId=1002-003
		$.post(url,data,function(callbackData){
			$("#uname").text("");
			$("#id").text("");
			$("#addr").text("");
			$("#ownMoney").text("");
			if(callbackData == ""){
				alert("单号输入错误");
				return;
			}
			$("#uname").text(callbackData.uname);
			$("#id").text(callbackData.cardId);
			$("#addr").text(callbackData.addr);
			$("#ownMoney").text(callbackData.ownMoney);
			
			if(callbackData.ownMoney == 0){
				//使用prop方法设置disabled、checked、selected
				$("[value='缴费']").prop("disabled",true);
				$("#text1").text("感谢您对中国电力的支持！");
			}else{
				$("[value='缴费']").prop("disabled",false);
				$("#text1").text("您的余额已不足，请及时充值！");
			}
		});
	});
});

$(function(){
	$("[value='缴费']").click(function(){
		var url = "${ pageContext.request.contextPath }/elecust/charge.action";
		//表单用val()得到值，非表单使用text()得到值
		var data = "eleCardId="+$("#id").text()+"&bankCardId="+$("[name='bankCardId']").val();
		$.post(url,data,function(callbackData){
			if(callbackData == 0){
				alert("银行卡号不存在！");
			}else if(callbackData == 1){
				alert("银行卡余额不足！");
			}else if(callbackData == 2){
				var date = new Date();
				var year = date.getFullYear();
				var month = date.getMonth();
				var day = date.getDate();
				var msg = "尊敬的 "+$("#uname").text()+"您于 "+year+"-"+(month+1)+"-"+day+" 号";
				msg += "用电单号 "+$("#id").text()+" 缴费 "+$("#ownMoney").text()+"元 感谢对供电事业的支持！";
				
				$("<div>").text(msg).appendTo("body");
				
				$("#ownMoney").text("0");
				$("[value='缴费']").prop("disabled",true);
			}else if(callbackData == 3){
				alert("缴费失败！");
			}
		});
	});
});
</script>
</head>
<body style="text-align: center;">
	单号：<input type="text" name="cardId"><input type="button" value="查询">
	<table border="1" width="600" style="margin: 0 auto;margin-top:50px;">
		<tr>
			<td width="150">用户姓名</td>
			<td id="uname">&nbsp;</td>
		</tr>
		<tr>
			<td>单号</td>
			<td id="id">&nbsp;</td>
		</tr>
		<tr>
			<td>地址</td>
			<td id="addr">&nbsp;</td>
		</tr>
		<tr>
			<td>目前欠费</td>
			<td id="ownMoney">&nbsp;</td>
		</tr>
		<tr>
			<td>银行卡号</td>
			<td>
				<input type="text" name="bankCardId">	
			</td>
		</tr>
		<tr>
			<td colspan="2" id="text1">&nbsp;</td>
		</tr>
	</table>
	<input type="button" value="缴费">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js"></script>
<script type="js/cloud.js"></script>
<script type="js/jquery.ba-resize.min.js"></script>
<script type="js/jquery.idTabs.min.js"></script>
<script type="js/jsapi.js"></script>
<script type="js/select-ui.min.js"></script>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet"></link>
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="place">
		<span>用户信息</span>

	</div>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">

				<li class="click"><span><img src="images/t01.png"
						onclick="getUserinfo()" /></span>查询</li>
				<li class="click"><span><img src="images/t01.png"
						onclick="toAddUser()" /></span>添加</li>
				<li class="click"><span><img src="images/t02.png" /></span>修改</li>
				<li class="click"><span><img src="images/t03.png" /></span>删除</li>
			</ul>
		</div>



	</div>


	<!-- 查询结果 -->
	<div class="box" id="queryTable" hidden></div>
	<div class="box" id="addUserfrom" hidden></div>



	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
		$(document).ready(function(){
			getUserinfo();
			}); 
		function getUserinfo() {
			$.ajax({
				type : "post",
				url : "userConfig/getUserList.do",
				success : function(html) {
					$("#queryTable").html(html);
					$("#queryTable").show();
					$("#addUserfrom").hide();
				},
				error : function(e) {
					alert("获取数据失败");
				}
			});
		}

		function deleteUser(userId) {
			if (confirm("确认删除该用户？")) {
				$.ajax({
					type : "POST",
					url : "userConfig/deleteUser.do",
					data : {
						userId : userId
					},
					success : function(date) {
						getUserinfo();
						alert("删除成功");

					},
					error : function(e) {
						alert("获取数据失败");
					}
				});

			}
		}

		function toAddUser() {
			$.ajax({
				type : "post",
				url : "userConfig/toAddUser.do",
				success : function(html) {
					$("#queryTable").hide();
					$("#addUserfrom").html(html);
					$("#addUserfrom").show();
				},
				error : function(e) {
					alert("获取数据失败");
				}
			});

		}

		function checkip() {
			var name = $("#addname").val();
			var ldnumber = $("#addldnumber").val();
			var password = $("#addpassword").val();
			var phone = $("#addphone").val();
			var machinecde = $("#addmachinecde").val();
			var code = $("#addcode").val();
			var addr = $("#addaddr").val();
			if (name === "" || ldnumber === "" || password === ""
					|| phone === "" || machinecde === "" || code === ""
					|| addr === "") {
				alert("请把信息填写完整");
				return false;
			} else {
				$("#form").ajaxSubmit(function(message) {
					alert(message);
					if (message == 1) {
						alert("添加成功。")
					} else {
						alert("添加失败");
					}
					alert(55);
					console.log(message);
				});
				alert(77);
				return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
			}
			alert(66);
			return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
		}

		function toEditUser(userId) {
			$("#getPolicynoMsg").modal('show');
		}
	</script>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>设备信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});
		device.jsp
		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>


</head>


<body>
<div class="place">
		<span onclick="getMachineList()">设备信息</span>
		
	</div>	
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li class="click"><span><img src="images/t01.png"
						onclick="getMachineList" /></span>查询</li>
				<li class="click"><span><img src="images/t02.png" /></span>修改</li>
				<li class="click"><span><img src="images/t03.png"  /></span>删除</li>
			</ul>
		</div>
		
	</div>
<table class="tablelist">
			<thead>
				<tr>
					<th>编号</th>
					<th>水栓编码</th>
					<th>水栓规格型号</th>
					<th>所属水泵</th>
					<th>电压</th>
					<th>电流</th>
					<th>功率</th>
					<th>DTU编码</th>
					<th>DTU端口</th>
					<th>设备录入人员</th>
					<th>所属地区编码</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
		<c:forEach items="${list}" var="Machine">
			<tr>
				<td>${Machine.machineId }</td>
				<td>${Machine.machinecde }</td>
				<td>${Machine.plugspec }</td>
				<td>${Machine.code }</td>
				<td>${Machine.voltage }</td>
				<td>${Machine.current }</td>
				<td>${Machine.power }</td>
				<td>${Machine.dtu }</td>
				<td>${Machine.dtuport }</td>
				<td>${Machine.devicepeople }</td>
				<td>${Machine.localcoding }</td>
				<th>
					<button class="btn btn-primary btn-sm"
						onclick="window.open('userConfig/toUpdatepage.do?userId=${Userinfo.user_id }','',' toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no')">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
						编辑
					</button>
					<button class="btn btn-danger btn-sm"
						onclick="deleteUser('${Userinfo.user_id }');">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
						删除
					</button>
				</th>
			</tr>
		</c:forEach>
	</tbody>
		</table>
	<!-- 查询结果 -->
	<div class="box" id="queryTable" hidden></div>
	<div class="box" id="addUserfrom" hidden></div>
	
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
		$(document).ready(function(){
			getMachineList();
			}); 
		function getMachineList() {
			$.ajax({
				type : "post",
				url : "userConfig/getMachineList.do",
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
	</script>
</body>
</html>

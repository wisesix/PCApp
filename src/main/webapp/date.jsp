<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据统计</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="place">
		<span>数据统计</span>
	</div>
	<div class="formbody">
		<div class="formtitle">
			<span>数据统计</span>
		</div>
		<table class="tablelist">
			<thead>
				<tr>
					<th>序号</th>
					<th>水泵编码</th>
					<th>水栓编码</th>
					<th>地理位置</th>
					<th>DTU编号</th>
					<th>DTU端口</th>
					<th>额定电压</th>
					<th>额定电流</th>
					<th>额定功率</th>
					<th>水井上水时间</th>
					<th>水井电量</th>
					<th>水井水量</th>
					<th>水栓用水时间</th>
					<th>水栓水量</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listr}" var="r">
					<tr>
						<td>${r.code }</td>
						<td>${r.machinecde }</td>
						<td>${r.villagers }</td>
						<td>${r.dtu }</td>
						<td>${r.dtuport }</td>
						<td>${r.voltage }</td>
						<td>${r.current }</td>
						<td>${r.power }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<!-- 查询结果 -->
	<div class="box" id="queryTable" hidden></div>
	<div class="box" id="addUserfrom" hidden></div>
	
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
		$(document).ready(function(){
			getreportform();
			}); 
		function getreportform() {
			$.ajax({
				type : "post",
				url : "reportform/shuju.do",
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

</body>
</html>


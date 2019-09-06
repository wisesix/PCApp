<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag"%>

<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="js/cloud.js"></script>
<script type="js/jquery.ba-resize.min.js"></script>
<script type="js/jquery.idTabs.min.js"></script>
<script type="js/jsapi.js"></script>
<script type="js/select-ui.min.js"></script>


<table class="tablelist">
	<thead>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>身份证号码</th>
			<th>电话号码</th>
			<th>所属水栓</th>
			<th>所属水泵</th>
			<th>家庭住址</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="Userinfo">
			<tr>
				<td>${Userinfo.user_id }</td>
				<td>${Userinfo.name }</td>
				<td>${Userinfo.ldnumber }</td>
				<td>${Userinfo.phone }</td>
				<td>${Userinfo.machinecde }</td>
				<td>${Userinfo.code }</td>
				<td>${Userinfo.addr }</td>
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




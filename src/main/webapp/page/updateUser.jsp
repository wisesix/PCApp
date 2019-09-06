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
<link href="/css/style.css" rel="stylesheet" type="text/css" />
<script src="/js/jquery.js"></script>
<script type="/js/cloud.js"></script>
<script type="/js/jquery.ba-resize.min.js"></script>
<script type="/js/jquery.idTabs.min.js"></script>
<script type="/js/jsapi.js"></script>
<script type="/js/select-ui.min.js"></script>
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

	<form action="${APP_PATH }/userConfig/updateUser.do" id="formedit"
		enctype="multipart/form-data" method="get"
		onsubmit="return checkedit()" enctype="multipart/form-data">
		<ul class="forminfo">
			<c:forEach items="${list}" var="Userinfo">
				<li><label>用户姓名</label><input id="editname" name="editname"
					type="text" class="dfinput" value="${Userinfo.name }" /></li>
				<li><label>身份证号码</label><input id="editldnumber"
					name="editldnumber" type="text" class="dfinput"
					value="${Userinfo.ldnumber }" /></li>
				<li><label>密码</label><input id="editpassword"
					name="editpassword" type="text" class="dfinput"
					value="${Userinfo.password }" /></li>
				<li><label>联系方式</label><input id="editphone" name="editphone"
					type="text" class="dfinput" value="${Userinfo.phone }" /></li>
				<li><label>所属水栓编码</label><input id="editmachinecde"
					name="editmachinecde" type="text" class="dfinput"
					value="${Userinfo.machinecde}" /></li>
				<li><label>所属水泵编码</label><input id="editcode" name="editcode"
					type="text" class="dfinput" value="${Userinfo.code }" /></li>
				<li><label>家庭住址</label><input id="editaddr" name="editaddr"
					type="text" class="dfinput" value="${Userinfo.addr }" /></li>
				<li><label>&nbsp;</label><input name="" type="submit"
					class="btn btn-info btn-search" id="submit" value="提交" /></li>
				<input id="uid" name="uid" hidden="hidden"
					value="${Userinfo.user_id }"></input>
			</c:forEach>


		</ul>

	</form>

	<script type="text/javascript">
		function checkedit() {
			var user_id = $("#uid").val();
			var name = $("#editname").val();
			var ldnumber = $("#editldnumber").val();
			var password = $("#editpassword").val();
			var phone = $("#editphone").val();
			var machinecde = $("#editmachinecde").val();
			var code = $("#editcode").val();
			var addr = $("#editaddr").val();
			if (name === "" || ldnumber === "" || password === ""
					|| phone === "" || machinecde === "" || code === ""
					|| addr === "") {
				alert("请把信息填写完整");
				return false;
			}
			return true; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
		}
	</script>

</body>

</html>

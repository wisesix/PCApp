<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag"%>

<link href="/css/style.css" rel="stylesheet" type="text/css" />
<script type="/text/javascript" src="js/jquery.js"></script>
<script type="/js/cloud.js"></script>
<script type="/js/jquery.ba-resize.min.js"></script>
<script type="/js/jquery.idTabs.min.js"></script>
<script type="/js/jsapi.js"></script>
<script type="/js/select-ui.min.js"></script>
		<form action="userConfig/addUser.do" id="form"
			enctype="multipart/form-data" method="get"
			onsubmit="return checkip()" enctype="multipart/form-data">
			<ul class="forminfo">
				<li><label>用户姓名</label><input id="addname" name="addname"
					type="text" class="dfinput" /></li>
				<li><label>身份证号码</label><input id="addldnumber" name="addldnumber"
					type="text" class="dfinput" /></li>
				<li><label>密码</label><input id="addpassword" name="addpassword"
					type="text" class="dfinput" /></li>
				<li><label>联系方式</label><input id="addphone" name="addphone"
					type="text" class="dfinput" /></li>
				<li><label>所属水栓编码</label><input id="addmachinecde" name="addmachinecde"
					type="text" class="dfinput" /></li>
				<li><label>所属水泵编码</label><input id="addcode" name="addcode"
					type="text" class="dfinput" /></li>
				<li><label>家庭住址</label><input id="addaddr" name="addaddr"
					type="text" class="dfinput" /></li>
				<li><label>&nbsp;</label><input name="" type="submit"
					class="btn btn-info btn-search" id="submit" value="提交" /></li>

			</ul>

		</form>




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
			<th>id</th>
			<th>name</th>
			<th>role_id</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ut}" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
				<td>${u.role_id }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
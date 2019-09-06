﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>管理信息
    </div>
    	<ul class="menuson">
        <li class="active"><cite></cite><a href="right.jsp" target="rightFrame" onclick="getUserinfo()">用户信息</a><i></i></li>
        <li class="active"><cite></cite><a href="imgtable.jsp" target="rightFrame" onclick="">设备信息</a><i></i></li>
        <li><cite></cite><a href="form.jsp" target="rightFrame">权限管理</a><i></i></li>
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>水价设置
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="information.jsp" target="rightFrame">信息发布</a><i></i></li>
        <li><cite></cite><a href="#">阶梯水价</a><i></i></li>
        <li><cite></cite><a href="#">水权分配</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>参数设置</div>
    <ul class="menuson">
        <li><cite></cite><a href="system.jsp" target="rightFrame">系统参数</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span>报表管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="rate.jsp" target="rightFrame">费率管理</a><i></i></li>
        <li><cite></cite><a href="report.jsp" target="rightFrame">报表管理</a><i></i></li>
        <li><cite></cite><a href="date.jsp" target="rightFrame">数据统计</a><i></i></li>
        <li><cite></cite><a href="logView.jsp" target="rightFrame">查看日志</a><i></i></li>
    </ul>
    
    </dd>   
    
    </dl>
</body>
</html>

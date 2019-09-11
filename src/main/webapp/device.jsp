<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/shuibeng.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script language="javascript">
	$(function() {
		//导航切换
		$(".imglist li").click(function() {
			$(".imglist li.selected").removeClass("selected")
			$(this).addClass("selected");
		})
	})
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

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

<script type="text/javascript">
	$('.imgtable tbody tr:odd').addClass('odd');
</script>

</head>

<body>

	<div class="place">
		<span>水泵监控界面</span>
	</div>

	<div class="artical">
		<div class="wrap">
			<div class="coltop">
				<p class="sbtitle">XXX村灌溉监控</p>
			</div>

			<!-- 左侧设备布局 -->
			<div class="colleft">

				<!-- 左侧控制方式模块布局 -->
				<div class="kztitle">
					<p class="sbmtitle">控制方式：</p>
					<div class="circle1_1"></div>
					<div class="circle1_2"></div>
				</div>
				<div class="zstitle">
					<p class="zidong">自动</p>
					<p class="shoudong">手动</p>
				</div>

				<!-- 左侧水泵水栓模块布局 -->
				<div class="sbsstitle">
					<div class="circle1_3">
						<p class="text_ss1_0">1#水泵</p>
					</div>
					<div class="xline"></div>

					<div class="scbj">
						<div class="yline1_0"></div>
						<div class="rect1_0">
							<p class="text_sc">水池</p>
						</div>

						<div class="yline1_11"></div>
						<div class="rect1_1">
							<p class="text_ss1_1">1#水栓</p>
						</div>
						<div class="yline1_12"></div>

						<div class="yline1_21"></div>
						<div class="rect1_2">
							<p class="text_ss1_2">2#水栓</p>
						</div>
						<div class="yline1_22"></div>

						<div class="yline1_31"></div>
						<div class="rect1_3">
							<p class="text_ss1_3">3#水栓</p>
						</div>
						<div class="yline1_32"></div>
					</div>

				</div>
			</div>

			<!-- 右侧水泵布局 -->
			<div class="colright">

				<!--右侧控制方式模块布局 -->
				<div class="kztitle">
					<p class="sbmtitle">控制方式：</p>
					<div class="circle2_1"></div>
					<div class="circle2_2"></div>
				</div>
				<div class="zstitle">
					<p class="zidong">自动</p>
					<p class="shoudong">手动</p>
				</div>

				<!-- 右侧水泵水栓模块布局 -->
				<div class="sbsstitle">
					<div class="circle2_3">
						<p class="text_ss2_0">2#水泵</p>
					</div>
					<div class="xline"></div>

					<div class="scbj">
						<div class="yline2_0"></div>
						<div class="rect2_0">
							<p class="text_sc2">水池</p>
						</div>

						<div class="yline2_11"></div>
						<div class="rect2_1">
							<p class="text_ss2_1">1#水栓</p>
						</div>
						<div class="yline2_12"></div>

						<div class="yline2_21"></div>
						<div class="rect2_2">
							<p class="text_ss2_2">2#水栓</p>
						</div>
						<div class="yline2_22"></div>

						<div class="yline2_31"></div>
						<div class="rect2_3">
							<p class="text_ss2_3">3#水栓</p>
						</div>
						<div class="yline2_32"></div>
					</div>

					<div class="beizhu">
						<p>运行：</p>
						<div class="bz1"></div>
						</br>
						<p>停止：</p>
						<div class="bz2"></div>
						</br>
						<p>故障：</p>
						<div class="bz3"></div>
						</br>
					</div>

				</div>

			</div>
		</div>
</body>
</html>

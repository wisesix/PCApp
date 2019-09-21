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
<style>
.circle1_3 {
	background:;
}

.green {
	background: green;
}

.red {
	background: red;
}

.orange {
	background: orange;
}
</style>
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

<script type="text/javascript">
	function changeColor() {
		var datas = [];
		$.ajax({
			type : "post",
			url : "pumpmachine/info.do",
			data : {},
			success : function(data) {
				var arr = $.parseJSON(data);
				for (var i = 0; i < arr.length; i++) {
					if (arr[i].code == "sb001") {
						/**
						codestatus  1#水泵     0 红色     1绿色   2 黄色
						usestatusA    1#水泵下的   1#水栓      0 红色     1绿色   2 黄色
						usestatusB    1#水泵下的   2#水栓      0 红色     1绿色   2 黄色
						usestatusC   1#水泵下的   3#水栓      0 红色     1绿色   2 黄色
						 **/
						 //1#水泵控制模式
						if (arr[i].controlmode == 0) {
							//自动
							$(".circle1_1").addClass('red');
						} else {
							// 手动
							$(".circle1_1").addClass('green');
						} 

						if (arr[i].codestatus == 0) {
							//一号水泵
							$(".circle1_3").addClass('red');
						} else if (arr[i].codestatus == 1) {
							$(".circle1_3").addClass('green');
						} else {
							$(".circle1_3").addClass('orange');
						}

						//一号水泵 一号水栓
						if (arr[i].usestatusA == 0) {
							$(".rect1_1").addClass('red');
						} else if (arr[i].usestatusA == 1) {
							$(".rect1_1").addClass('green');
						} else {
							$(".rect1_1").addClass('orange');
						}

						//一号水泵 二号水栓
						if (arr[i].usestatusB == 0) {
							$(".rect1_2").addClass('red');
						} else if (arr[i].usestatusB == 1) {
							$(".rect1_2").addClass('green');
						} else {
							$(".rect1_2").addClass('orange');
						}

						//一号水泵 三号水栓
						if (arr[i].usestatusC == 0) {
							$(".machine3").addClass('red');
						} else if (arr[i].usestatusC == 1) {
							$(".machine3").addClass('green');
						} else {
							$(".machine3").addClass('orange');
						}

					}  else if (arr[i].code == "sb002") {
						/*//二号水泵
						if (arr[i].codestatus == 0) {
							$(".circle2_3").addClass('red');
						} else if (arr[i].codestatus == 1) {
							$(".circle2_3").addClass('green');
						} else {
							$(".circle2_3").addClass('orange');
						}
						//ok当弹出  有的时候 这一段就可以删掉了
						////////////////
						if (arr[i].usestatusA) {
							alert("有");
						} else {
							alert("无");
						}
						//////////////
						//二号水泵 一号水栓
						if (arr[i].usestatusA == 0) {
							$(".rect2_1").addClass('red');
						} else if (arr[i].usestatusA == 1) {
							$(".rect2_1").addClass('green');
						} else {
							$(".rect2_1").addClass('orange');
						}

						//二号水泵 二号水栓
						if (arr[i].usestatusB == 0) {
							$(".rect2_2").addClass('red');
						} else if (arr[i].usestatusB == 1) {
							$(".rect2_2").addClass('green');
						} else {
							$(".rect2_2").addClass('orange');
						}

						//二号水泵 三号水栓
						if (arr[i].usestatusC == 0) {
							$(".rect2_3").addClass('red');
						} else if (arr[i].usestatusC == 1) {
							$(".rect2_3").addClass('green');
						} else {
							$(".rect2_3").addClass('orange');
						} */
					}
				}
			},
		});
	}
	$(document).ready(function() {
		//循环执行，每隔1秒钟执行一次 1000 
		var t1 = window.setInterval(changeColor, 1000);
	});
</script>

<script type="text/javascript">
	var datas = [];
	$.ajax({
		type : "post",
		url : "pumpmachine/info.do",
		data : {},
		success : function(data) {
			var arr = $.parseJSON(data);
			if (arr.code == "sb001") {

			}

			for (var i = 0; i < arr.length; i++) {
				console.log(arr[i]);
				switch (arr[i].codestatus) {
				case "0":
					$(".rect1_3").addClass('red');
					break;
				case "1":
					$(".rect1_3").addClass('green');
					break;
				case "2":
					$(".rect1_3").addClass('orange');
					break;
				default:
					$(".rect1_3").addClass('red');
				}
			}
		},
	});
</script>

</head>


<body>

	<div class="place">
		<span>水泵监控界面</span>
	</div>

	<div class="artical">
		<div class="wrap">

			<div class="coltop">
				<p class="sbtitle">运城xxx村灌溉监控</p>
			</div>

			<!-- 左侧设备布局 -->
			<div class="colleft">

				<!-- 左侧控制方式模块布局 -->
				<div class="kztitle">
					<p class="sbmtitle">控制方式：</p>
					<div class="circle1_1" style="border: 1px solid black"></div>
				</div>
				<div class="zstitle">
					<p class="zidong">自动红色/手动绿色</p>
				</div>

				<!-- 左侧水泵水栓模块布局 -->
				<div class="sbsstitle">
					<div class="circle1_3" style="border: 1px solid black">
						<p class="text_ss1_0">1#水泵</p>
					</div>
					<div class="xline"></div>

					<div class="scbj">
						<div class="yline1_0"></div>
						<div class="rect1_0">
							<button class="btn" style="width: 50px; height: 30px;">水池</button>
						</div>

						<div class="yline1_11"></div>
						<div class="rect1_1" style="border: 1px solid black">
							<p class="text_ss1_1">1#水栓</p>
						</div>
						<div class="yline1_12"></div>

						<div class="yline1_21"></div>
						<div class="rect1_2" style="border: 1px solid black">
							<p class="text_ss1_2">2#水栓</p>
						</div>
						<div class="yline1_22"></div>
						<div class="yline1_31"></div>
						<div class="machine3" style="border: 1px solid black">
							<p class="text_ss1_3">3#水栓</p>
						</div>
						<div class="yline1_32"></div>
					</div>
				</div>
			</div>



			<div class="colright">
				<div class="sbsstitle">
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

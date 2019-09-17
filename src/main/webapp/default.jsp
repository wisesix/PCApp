<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript"
	src="js/format+zh_CN,default,corechart.I.js"></script>
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>

<script type="text/javascript">
	gvChartInit();
	jQuery(document).ready(function() {

		jQuery('#myTable5').gvChart({
			chartType : 'PieChart',
			gvSettings : {
				vAxis : {
					title : 'No of players'
				},
				hAxis : {
					title : 'Month'
				},
				width : 650,
				height : 250
			}
		});
	});
</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<title>CanvasLayer</title>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=3.0&ak=IDvNBsejl9oqMbPF316iKsXR"></script>
<style type="text/css">
body, html, #container {
	width: 100%;
	height: 100%;
	overflow: hidden;
	margin: 0;
	font-family: "微软雅黑";
}
</style>
</head>


<body>

	<div class="place">
		<span>灌溉设备监控界面</span>
	</div>
	<div id="container"></div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		setWidth();
	});

	setWidth();
	$(window).resize(function() {
		setWidth();
	});

	function setWidth() {
		var width = ($('.leftinfos').width() - 12) / 2;
		$('.infoleft,.inforight').width(width);
	}
</script>
</html>
<script type="text/javascript">
	var mp = new BMap.Map("container");
	mp.centerAndZoom(new BMap.Point(108.93425, 34.23053), 10);
	mp.enableScrollWheelZoom();

	var canvasLayer = new BMap.CanvasLayer({
		update : update
	});

	function update() {
		var ctx = this.canvas.getContext("2d");

		if (!ctx) {
			return;
		}

		ctx.clearRect(0, 0, ctx.canvas.width, ctx.canvas.height);

		var temp = {};
		ctx.fillStyle = "rgba(50, 50, 255, 0.7)";
		ctx.beginPath();
		var data = [
		//地图标注点
		//new BMap.Point(108.960603, 34.23197),
		];

		for (var i = 0, len = data.length; i < len; i++) {
			var pixel = mp.pointToPixel(data[i]);
			ctx.fillRect(pixel.x, pixel.y, 30, 30);
		}
	}
	mp.addOverlay(canvasLayer);
</script>

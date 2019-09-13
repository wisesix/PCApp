<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
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
</head>


<body>

	<div class="place">
		<span>电能参数变化趋势</span>

	</div>

	<div>
		<canvas id="can1" width="800" height="600"></canvas>
		<script type="text/javascript">
			var can1 = document.getElementById("can1");
			var ctx = can1.getContext("2d");
			var nums = [];
			var datas=[];
			$.ajax({
				type:"post",
				url:"pumpinfo/zhexian.do",
				data:{
				code:"sb001"
				},
				success:function(data) {
					for (var i=0;i<data.data.result.length;i++)
					{ 
						datas[i]=data.data.result[i].time;
					    nums[i]=Number(data.data.result[i].sflow);
					     
					}
					 drawBlock();
 				},
				error:function(e) {
					alert("获取数据失败");
				}
			});
			 
			//画出坐标线  
			function drawBorder() {
				ctx.beginPath();
				ctx.moveTo(100, 50);
				ctx.lineTo(100, 550);
				ctx.moveTo(100, 550);
				ctx.lineTo(600, 550);
				ctx.closePath();
				ctx.stroke();
			}
			//画出折线  
			function drawLine() {
				for (i = 0; i < nums.length - 1; i++) {
					//起始坐标  
					var numsY = 550 - nums[i] / 500 * 100;
					var numsX = i * 100 + 150;
					//终止坐标  
					var numsNY = 550 - nums[i + 1] / 500 * 100;
					var numsNX = (i + 1) * 100 + 150;
					ctx.beginPath();
					ctx.moveTo(numsX, numsY);
					ctx.lineTo(numsNX, numsNY);
					ctx.lineWidth = 6;
					ctx.strokeStyle = "#80aa33";
					ctx.closePath();
					ctx.stroke();
				}
			}
			//绘制折线点的菱形和数值，横坐标值，纵坐标值  
			function drawBlock() {
				for (i = 0; i <= nums.length; i++) {
					var numsY = 550 - nums[i] / 500 * 100;
					var numsX = i * 100 + 150;
					ctx.beginPath();
					// 画出折线上的方块  
					ctx.moveTo(numsX - 4, numsY);
					ctx.lineTo(numsX, numsY - 4);
					ctx.lineTo(numsX + 4, numsY);
					ctx.lineTo(numsX, numsY + 4);
					ctx.fill();
					ctx.font = "15px scans-serif";
					ctx.fillStyle = "black";
					//折线上的点值  
					var text = ctx.measureText(nums[i]);
					ctx.fillText(nums[i], numsX - text.width, numsY - 10);
					//绘制纵坐标  
					var colText = ctx.measureText((nums.length - i) * 500);
					ctx.fillText((nums.length - i) * 500, 90 - colText.width,
							i * 100 + 55);
					//绘制横坐标并判断  
					if (i < 5) {
						var rowText = ctx.measureText(datas[i]);
						ctx.fillText(datas[i], numsX - rowText.width / 2, 570);
					} else if (i == 5) {
						return;
					}
					ctx.closePath();
					ctx.stroke();
				}
			}
			drawBorder();
			drawLine();
			//drawBlock();
		</script>
	</div>



</body>
</html>

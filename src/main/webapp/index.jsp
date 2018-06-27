<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="js/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="js/menu.css" type="text/css" />
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<title>沁心.耳机</title>
<script type="text/javascript">
	var page=1;
	var num=20;
	var lastpage=1;
	var table="Menu.do";
	$(function($) {
		$.getJSON("Menu.do",{page:page,num:num},function(data){
			var html="";
			$(data.list).each(function () {
			html +="<div class='col-sm-6 col-md-3'>";	
			html +="<a href='"+this.tbkurl+"' class='thumbnail' target='_black'> <img src='"+this.image+"' class='img-responsive'>";		
			html +="<h4 class='pname'>"+this.name+"</h4> <span class='price'>价格:"+Number(this.price).toFixed(2)+"</span><br />";
			/* html +="<span class='label label-warning'>券后价:12</span>";	  */
			html +="</a></div>";
			});
			$("#content").empty();
			$("#content").append(html);
		});
		quality();
		line();
		bluetooth();
		tws();
		diy();
		previous();
		});
	
	/*精品推荐  */
	function quality(){
		$("#quality").click(function() {
			var html="";
			$(data.list).each(function () {
			html +="<div class='col-sm-6 col-md-3'>";	
			html +="<a href='"+this.tbkurl+"' class='thumbnail' target='_black'> <div class='zoomImage'><img src='"+this.image+"'class='img-responsive'></div>";		
			html +="<h4 class='pname'>"+this.name+"</h4> <span class='price'>价格:"+Number(this.price).toFixed(2)+"</span><br />";
			/* html +="<span class='label label-warning'>券后价:12</span>";	 */ 
			html +="</a></div>";
			});
			$("#content").empty();
			$("#content").append(html);
		});
	}
	/*有线耳机  */
	function line(){
		$("#line").click(function() {
			table="Line.do";
			page=1;
			num=20;
			load(table);
		});	
	}
	/*蓝牙耳机  */
	function bluetooth() {
		$("#bluetooth").click(function() {
			table="Bluetooth.do";
			page=1;
			num=20;
			load(table);
		});
	}
	/*TWS蓝牙耳机  */
	function tws() {
		$("#tws").click(function() {
			table="TWS.do";
			page=1;
			num=20;
			load(table);
		});
	}
	/*DIY蓝牙耳机  */
	function diy() {
		$("#diy").click(function() {
			table="DIY.do";
			page=1;
			num=20;
			load(table);
		});	
	}
	function load(table) {
		$.getJSON(table,{page:page,num:num},function(data){
			var html="";
			var pa="";
			lastpage=data.lastpage;
			$(data.list).each(function () {
			html +="<div class='col-sm-6 col-md-3'>";	
			html +="<a href='"+this.tbkurl+"' class='thumbnail' target='_black'> <div class='zoomImage'><img src='"+this.image+"'class='img-responsive'></div>";		
			html +="<h4 class='pname'>"+this.name+"</h4> <span class='price'>价格:"+Number(this.price).toFixed(2)+"</span><br />";
			/* html +="<span class='label label-warning'>券后价:12</span>";	 */
			html +="</a></div>";
			});
			
			pa +="<nav aria-label='Page navigation' class='text-center'>";
			pa +="<ul class='pagination pagination-lg'>";
			pa +="<li><a href='javascript:void(0)' rel='"+(page-1)+"'> <span >上一页</span></a></li>";
			$(data.pagenums).each(function() {
				if (this==page) {
			pa +="<li class='active'><a href='javascript:void(0)' rel='"+this+"'>"+this+"</a></li>";		
				}else  {
			pa +="<li><a href='javascript:void(0)' rel='"+this+"'>"+this+"</a></li>";
				}
			});
			pa +="<li><a href='javascript:void(0)' rel='"+(++page)+"'> <span >下一页</span></a></li>";
			pa +="</ul></nav>";  
			$("#content").empty();
			$("#content").append(html);
			$("#page").empty();
			$("#page").append(pa); 
		});
	}
	/* 翻页 */
 	function previous(){
		$("#page").on("click","li a",function() {
			var rel=$(this).attr("rel");
			if (rel<=1) {
				page=1;
			}else if (rel>=lastpage) {
				page=lastpage;
			}else{
				page=rel;
			}
				load(table);
		});
	} 
</script>
</head>
<body>
	<div class="container">
		<div class="top">
			<div>
				<span><a href="Menu.do">沁心耳机</a></span>
			</div>
		</div>
		<div style="clear: both"></div>

		<!--导航-->
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="javascript:void(0)" id="quality" data-toggle="tab"><strong>精品推荐</strong> </a></li>
					<li><a href="javascript:void(0)" id="line" data-toggle="tab">有线耳机</a></li>
					<li><a href="javascript:void(0)" id="bluetooth" data-toggle="tab">蓝牙耳机</a></li>
					<li><a href="javascript:void(0)" id="tws" data-toggle="tab">TWS蓝牙耳机</a></li>
					<li><a href="javascript:void(0)" id="diy" data-toggle="tab">DIY耳机</a></li>
				</ul>
			</div>
		</div>
		</nav>
		<!--内容  -->
		<div class="row">
		<div id="content">
		</div></div>
		<!--分页  -->
		<div id="page">
		
	</div>
		<!--友情链接-->
		<div class="row bottom2 bg-warning">
			<div>
				<h3>友情链接：</h3>
				<div class="col-md-1"></div>
				<div class="col-md-2">
					<a href="http://www.moolsun.com/bbs/forum.php" target="_blank">沐圣耳机社区</a>
				</div>
				<div class="col-md-2">
					<a href="http://www.erji.net" target="_blank">耳机大家坛</a>
				</div>
				<div class="col-md-2">
					<a href="http://www.52bluetooth.com" target="_blank">我爱蓝牙网</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
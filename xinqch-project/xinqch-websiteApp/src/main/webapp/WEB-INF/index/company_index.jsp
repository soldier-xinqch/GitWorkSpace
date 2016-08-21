<%@page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ include file="/common/include/include.jsp"%>


<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" class="g_html">
<head>
<%@ include file="/common/include/head_meta.jsp"%>

<style type="text/css">
#carousel{
	height:500px;
}
</style>
</head>
<body>
	<div class="col-md-12">
		<%-- 公司logo --%>
		<div class="col-md-5">
			<div class="formMiddleContent formMiddleContent373" tabstyle="0"
				style="height: 53px; overflow-y: hidden;">
				<div class="richContent richContent0">
					<p>
					<p class="f_rigt" style="right: 20px;">
						<em style="line-height: 21.6px;"> <span
							style="font-size: 32px; font-family: Arial;"> <span
								style="color: #F13A3A;">ADVERTISING</span> <span
								style="color: #CCCCCC;">DESIGN</span>
						</span>
						</em>
					</p>
				</div>
			</div>
		</div>
		<%-- 菜单 --%>
		<div class="col-md-7">
			<nav class="navbar navbar-default equinav" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<span class="navbar-brand">Menu</span>
				</div>
				<!-- /.navbar-header -->
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li><a href="#" id="ss">首页</a></li>
						<li><a href="#">产品展示</a></li>
						<li><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">工程项目 <b class="caret"></b></a>
							<ul class="dropdown-menu depth_0">
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
							</ul></li>
						<li><a href="#">营销网络</a></li>
						<li><a href="#">新闻中心</a></li>
						<li><a href="#">人才招聘</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
		</div>
	</div>
	<%-- 轮播图 --%>
	<div class="col-md-12" >
		<%-- 轮播图片 --%>
		<!-- <div id="carousel" class="carousel slide">
	       <ol class="carousel-indicators">
	         <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	         <li data-target="#myCarousel" data-slide-to="1"></li>
	         <li data-target="#myCarousel" data-slide-to="2"></li>
	       </ol>
	       <div class="carousel-inner">
	          <div class="active item"><img src="../../public/images/vague1.jpg" /></div>
	          <div class="item" ><img src="../../public/images/vague2.jpg"/></div>
	          <div class="item" ><img src="../../public/images/vague3.jpg"/></div>
	          <div class="item" ><img src="../../public/images/vague4.jpg"/></div>
	          <div class="item" ><img src="../../public/images/vague5.jpg"/></div>
	       </div>
	       <a class="carousel-control left" href="#myCarousel" data-slide="prev">‹</a>
	       <a class="carousel-control right" href="#myCarousel" data-slide="next">›</a>
		</div> -->
		<div id="myCarousel" class="carousel slide">
		  <ol class="carousel-indicators">
		    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		    <li data-target="#myCarousel" data-slide-to="1"></li>
		    <li data-target="#myCarousel" data-slide-to="2"></li>
		  </ol>
		  <!-- Carousel items -->
		  <div class="carousel-inner">
		    <div class="active item">…</div>
		    <div class="item">…</div>
		    <div class="item">…</div>
		  </div>
		  <!-- Carousel nav -->
		  <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		  <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
		</div>
		<%-- 公司自定义描述 若这里的值为空 则不显示  --%>
		<div></div>
	</div>
	<h2>Hello World!</h2>
	<h1>${user}</h1>




	<!-- 加入收藏按钮容器  -->
	<div id="suspension-right"></div>

</body>
</html>

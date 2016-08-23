<%@page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ include file="/common/include/include.jsp"%>


<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" class="g_html">
<head>
<%@ include file="/common/include/head_meta.jsp"%>
<link rel="stylesheet" href="../../public/css/responsiveslides.css">
<!-- 瀑布流  -->
<link href="../../public/css/Icomoon/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../../public/css/default.css">
<link href="../../public/css/animated-masonry-gallery.css" rel="stylesheet" type="text/css" />
<!-- 瀑布流  -->
<style type="text/css">
#carousel{
	height:500px; 
}
</style>
<style>
.wrap { position: relative; width: 900px; margin: 0 auto;}
.rslides li { position: relative;}
.rslides p { position: absolute; left: 0; bottom: 0; z-index: 2; width: 100%; margin: 0; padding: 0 10px; height: 32px; line-height: 32px; font-size: 14px; color: #fff; background-color: rgba(0, 0, 0, 0.5); background-color: #666\9;}
/* opacity 透明度 */
.centered-btns_nav{position: absolute; top: 50%; z-index: 2;width: 71px; height: 71px; margin-top: -40px; line-height: 200px;overflow: hidden;opacity: 0.5;}
.prev{background-image:url("../../public/images/left.png");}
.next { right: 0; background-position: right 0;background-image:url("../../public/images/right.png");}
.centered-btns_nav:active { opacity: 1;}
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
						<li><a href="#">新闻咨询</a></li>
						<li><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">工程项目 <b class="caret"></b></a>
							<ul class="dropdown-menu depth_0">
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
								<li><a href="#">Feature 1</a></li>
							</ul></li>
						<li><a href="#">营销网络</a></li>
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
		<div class="wrap">
			<ul class="rslides" id="dowebok">
				<li>
					<a href="http://www.dowebok.com/" target="_blank"><img src="../../public/images/1.jpg" alt=""></a>
					<p>第一张幻灯片的说明</p>
				</li>
				<li>
					<a href="http://www.dowebok.com/code" target="_blank"><img src="../../public/images/2.jpg" alt=""></a>
					<p>第二张幻灯片的说明</p>
				</li>
				<li>
					<a href="http://www.dowebok.com/material" target="_blank"><img src="../../public/images/3.jpg" alt=""></a>
					<p>第三张幻灯片的说明</p>
				</li>
			</ul>
		</div>
		<%-- 公司自定义描述 若这里的值为空 则不显示  --%>
		<div class="">
			<div >
				<table>
					<thead><tr><td>公司简介：</td></tr></thead>
					<tr>
						<td></td>
					</tr>
				</table>	
			</div>
		</div>
	</div>
	<!-- 瀑布流  -->
	<div class="htmleaf-container">
	
		<div id="gallery">
			<div id="gallery-header">
				<div id="gallery-header-center">
					<div id="gallery-header-center-left">
						<div id="gallery-header-center-left-icon"><span class="iconb" data-icon="&#xe23a;"></span></div>
						<div id="gallery-header-center-left-title">All Galleries</div>
					</div>
					<div id="gallery-header-center-right">
						<div class="gallery-header-center-right-links" id="filter-all">All</div>
						<div class="gallery-header-center-right-links" id="filter-studio">Studio</div>
						<div class="gallery-header-center-right-links" id="filter-landscape">Landscapes</div>
					</div>
				</div>
			</div>
			<div id="gallery-content">
				<div id="gallery-content-center">
					<img src="../../public/waterfall_imgs/mm1.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape1.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm2.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm17.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape2.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm3.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/studio3.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape3.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm4.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/studio4.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape4.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm5.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape5.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio6.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape6.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm6.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape7.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm16.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape8.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm7.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape9.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio10.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape10.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm8.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape11.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio12.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape12.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm15.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape13.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm9.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape14.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm10.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape15.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio16.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape16.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/mm1.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape17.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio18.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/landscape18.jpg" class="all landscape">
					<img src="../../public/waterfall_imgs/studio19.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/studio20.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm12.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm13.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/studio23.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm14.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm18.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm19.jpg" class="all studio"/>
					<img src="../../public/waterfall_imgs/mm20.jpg" class="all studio"/>
				</div>
			</div>
		</div>
	
	</div>
	
	<h2>Hello World!</h2>
	<h1>${user}</h1>
	<!-- 加入收藏按钮容器  -->
	<div id="suspension-right"></div>
	<%@ include file="/common/include/foot.jsp"%>
	<script src="../../public/js/responsiveslides.js"></script>
	<script type="text/javascript" src="../../public/js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="../../public/js/animated-masonry-gallery.js"></script>
	<script>
	$(function() {
		$("#dowebok").responsiveSlides({
			nav: true,
			namespace: 'centered-btns'
		});
	});
	</script>
</body>
</html>

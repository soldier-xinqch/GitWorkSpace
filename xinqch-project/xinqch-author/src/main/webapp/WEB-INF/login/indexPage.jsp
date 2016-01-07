<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title><sitemesh:write property='title'/></title>
<link type="text/css" rel="stylesheet" href="../public/css/main.css">
<link type="text/css" rel="stylesheet"
	href="../public/css/nprogress.css">
<link type="text/css" rel="stylesheet" href="../public/css/reset.css">
</head>
<body id="mainBg">
	<h2>Hello World! xinqch</h2>
	<!-- 页面头部  -->
	<div class="jiathis_streak">
		<span>awefawefawefawefawefwaefawefawewefflsdflewfjlkasnfoiejfvjkladuhv;lewfa;o</span>
		<img class="JIATHIS_IMG_OK" alt="天鹅湖" src="../public/images/tiane.jpg">
	</div>


	<div id="shareTestImage" class="picc">
		<div class="jiathis_shareimg"
			style="margin: -3px; background: transparent none repeat scroll 0% 0%;">
			 <span
				class="jiathis_sharelink" style="display: none;">
				<div id="ckepop">
					<span style="font-size: 12px; color: white" class="jiathis_txt">图片分享：</span><a
						title="分享到QQ空间" onclick="jiathis_sendto('qzone');"><span
						class="jiathis_txt jtico jtico_qzone"></span></a><a title="分享到新浪微博"
						onclick="jiathis_sendto('tsina');"><span
						class="jiathis_txt jtico jtico_tsina"></span></a><a title="分享到腾讯微博"
						onclick="jiathis_sendto('tqq');"><span
						class="jiathis_txt jtico jtico_tqq"></span></a><a title="分享到微信"
						onclick="jiathis_sendto('weixin');"><span
						class="jiathis_txt jtico jtico_weixin"></span></a><a title="分享到搜狐微博"
						onclick="jiathis_sendto('tsohu');"><span
						class="jiathis_txt jtico jtico_tsohu"></span></a><a title="分享到网易微博"
						onclick="jiathis_sendto('t163');"><span
						class="jiathis_txt jtico jtico_t163"></span></a><a target="_blank"
						class="jiathis_txt jtico jtico_jiathis" title="这是什么工具?"
						href="http://www.jiathis.com/getcode/shareimg"></a>
				</div>
			</span>
		</div>
		<script type="text/javascript">
			var jiathis_config = {
				shareImg : {
					"showType" : "MARK",//图片分享按钮出现的方式，ALL表示页对面上所有图片生效，MARK表示只对页面上标记过的图片上生效。 当你设置showType为"ALL"时，您可以在图片的img元素的class属性中加入"JIATHIS_IMG_NO"来去除不想进行分享的图片。当你设置showType为"MARK"时：您必须要在您想要用户分享的图片img元素的class属性上加上"JIATHIS_IMG_OK"，否则用户无法分享页面上的任何图片。默认值为ALL
					"bgColor" : "",//图片分享按钮的背景颜色，可以是CSS中color属性支持的任意值，(如#FFF或者orange)。默认的颜色是orange(橙色)。
					"txtColor" : "",//图片分享按钮的文本颜色。可以是CSS中color属性支持的任意值，(如#FFF或者white)。默认的颜色是white(白色)。
					"text" : "",//图片分享按钮上的文字，默认是"图片分享："。
					"services" : "",//图片分享按钮上显示的媒体，请设置为以英文逗号分隔的媒体代码
					"position" : "",//显示位置，1=左上，2=左下，3=右上，4=右下，默认显示位置是3
					"imgwidth" : "",//表示只对超过这个尺寸宽度的图片渲染分享功能，默认300
					"imgheight" : "",//表示只对超过这个尺寸高度的图片渲染分享功能，默认30
					"divname" : ""//表示只在这个div里渲染分享功能，默认是整个页面.
				},
				do_not_track : true,
				data_track_clickback : true
			}
		</script>
	</div>



	<div
		style="width: 663px; padding: 8px; border-radius: 5px; background: #F7F7F7; border: 1px solid #ccc;"
		class="jiathis_streak">
		此处点击鼠标左键，任意划取部分文字信息，即可显示JiaThis划词分享图标，实现用户轻松将鼠标选定信息一键分享到QQ空间、新浪微博、人人网等各大媒体平台。
	</div>


	<!-- JiaThis Button BEGIN -->
	<div class="jiathis_streak_share_16x16" id="jiathis_streak_share"
		style="display: none">
		<span class="streak_share_jiao"></span>
		<div class="jiathis_streak_goshare" id="jiathis_streak_goshare">
			<span class="jiathis_streak_txt">分享到</span> <span style=""
				title="隐藏分享框" onclick="JIATHIS_STREAK.hideShare()"
				class="jiathis_streak_close">X</span>
		</div>
		<div class="jiathis_style">
			<a class="jiathis_button_qzone"></a> <a class="jiathis_button_tsina"></a>
			<a class="jiathis_button_tqq"></a> <a class="jiathis_button_weixin"></a>
			<a href="http://www.jiathis.com/share"
				class="jiathis jiathis_txt jtico jtico_jiathis" target="_blank"></a>

		</div>
	</div>
	<!-- JiaThis Button END -->

	<script type="text/javascript" src="../public/js/nprogress.js"></script>
	<script type="text/javascript" src="../public/js/jquery-1.11.3.js"></script>
	<script type="text/javascript">
		$(function() {
			/* 页面加载进度条  */
			NProgress.start();
			$(document).ready(function() {
				NProgress.done();
			});
			var jiathis_config = {
				shareImg : {
					"showType" : "ALL",
					"bgColor" : "",
					"txtColor" : "",
					"text" : "",
					"services" : "",
					"position" : "",
					"imgwidth" : "",
					"imgheight" : "",
					"divname" : ""
				}
			};
		});
	</script>
	<!-- JiaThis Button BEGIN -->
	<script type="text/javascript"
		src="http://v3.jiathis.com/code/jia.js?uid=2075298" charset="utf-8"></script>
	<script type="text/javascript"
		src="http://v3.jiathis.com/code/jiathis_streak.js" charset="utf-8"></script>
	<script type="text/javascript"
		src="http://v3.jiathis.com/code/jiathis_r.js?move=0&amp;uid=2075298"
		charset="utf-8"></script>
	<!-- JiaThis Button END -->
</body>
</html>
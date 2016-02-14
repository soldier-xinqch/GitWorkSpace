<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<title><sitemesh:write property='title'/></title>
		<meta http-equiv="content-Type" content="text/html;charset=utf-8">
		<meta http-equiv="content-Language" content="zh-CN">
		<!-- 指定网页在缓存中的过期时间，一旦网页过期，必须到服务器上重新调阅。 -->
　　　	<!-- <meta http-equiv="Expires" Content="0"> -->
		<!-- 禁止浏览器从本地机的缓存中调阅页面内容 -->
		<!-- <meta http-equiv="Pragma" Content="No-cach"> -->
		<meta name="Author" Content="xinqch,xinchao32119@163.com">
		<meta name="Keywords" Lang="zh-CN" Content="综合,管理,系统">
		<meta name="Description" Content="面向工作者的综合管理系统，涵盖了广泛的任务，统计，查阅等功能">
		<link type="text/css" rel="stylesheet" href="../public/css/main.css">
		<link type="text/css" rel="stylesheet"
			href="../public/css/nprogress.css">
		<link type="text/css" rel="stylesheet" href="../public/css/reset.css"> 
		<script type="text/javascript" src="../public/js/nprogress.js"></script>
		<script type="text/javascript" src="../public/js/jquery-1.11.3.js"></script>
		<script type="text/javascript">
			$(function() {
				/* 页面加载进度条  */
				NProgress.start();
				$(document).ready(function() {
					NProgress.done();
				});
			});
		</script>
		<sitemesh:write property='head'/>
	</head>
	<body>
		<sitemesh:write property='body'/>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<jsp:include page="/common/tag.jsp" flush="true" />
<!DOCTYPE html>
<html>
<head>
	<title>数据库管理-管理员</title>
	<%@ include file="/common/head.jsp"  %>
</head>
<body>
	<div style="border:2px solid red;height: 60px;width: 100%;">
		<!-- 头部  -->
		<span>数据库管理</span>
	</div>
	<div id="dbContext">
		<!-- 主体部分  -->
		<div id="dbTable">
			<!-- 列出所有的数据库表  -->
		</div>
		<div id="sqlArea">
			<div>
				<div id="automaticSql">
					<!-- 快速执行区域 -->
				</div>
				<div id="sqlText">
					<!-- sql 语句编写区域 -->
				</div>
			</div>
			<div id="sqlConsole">
				<!-- sql 输出 控制台  -->
			</div>
		</div>
	</div>
	<div>
		<!-- 底部信息 -->
	</div>
</body>
</html>
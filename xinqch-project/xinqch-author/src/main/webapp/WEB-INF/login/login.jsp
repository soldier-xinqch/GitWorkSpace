<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/common/tag.jsp" flush="true" />
<!DOCTYPE html>
<html>
	<head>
		<title>漂泊工作者综合管理系统</title>
		<!-- 静态引用 -->
		<%@ include file="/common/head.jsp"  %>
	</head>
	<body id="loginBg">
		<div id="login-container" class="" >
			<div id="login">
				<form id="loginForm" name="loginForm" action="loginHome" method="post" accept-charset="UTF-8">
					<%-- 隐藏域 --%>
						<input type="hidden" name="loginStatus" value="login">
					<%-- 隐藏域 --%>
					<div id="logo" class="form-group" style="text-align: center;">
						<img alt="漂泊的工作者" src="/public/images/login-logo.png" >
					</div>
					<div id="user-input" class="form-group">
						<input type="text" class="form-control" name="loginName" value="" placeholder="请输入登录名"  />
					</div>
					<div id="passwd-input" class="form-group">
						<input type="password" class="form-control" name="loginPasswd" value="" placeholder="请输入登录密码"  />
					</div>
					<div class="form-group checkbox">
						<label>
							<input type="checkbox" class="" name="loginStatus" value="" />下次自动登录
						</label>
					</div>
					<div class="form-group" style="height: 40px;">
						<input type="button" class="btn btn-success col-md-5 loginBtn" value="登录" />
						<input type="reset" class="btn btn-primary col-md-5 loginBtn" value="重置" />
					</div>
					<div class="form-group" style="height: 10px;">
						<span id="loginWarning">若没有登录账号请您<span id="toReg" class="label label-primary clickImg">注册</span></span>
					</div>
				</form>
			</div>
			<div id="registered">
				<form id="registeredForm" name="registeredForm" action="loginHome" method="post" accept-charset="UTF-8">
					<%-- 隐藏域 --%>
						<input type="hidden" name="loginStatus" value="registered">
					<%-- 隐藏域 --%>
					<div id="logo" class="form-group" style="text-align: center;">
						<img alt="漂泊的工作者" src="/public/images/login-logo.png" >
					</div>
					<div class="form-group">
						<span id="regWarning">若有登录账号请您<span id="toLogin" class="label label-primary clickImg">直接登录</span></span>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="loginName" value="" placeholder="登录名：合法的邮箱\手机号\个性登录名"  />
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="loginPasswd" value="" placeholder="登录密码：请输入6~18位的英文数字密码"  />
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="loginPasswd" value="" placeholder="重复您输入的密码"  />
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="loginPasswd" value="" placeholder="请输入验证码"  />
						<img id="validImage" alt="验证码图片" src="<%=request.getContextPath()%>/valid/index">
					</div>
					<div class="form-group" style="height: 40px;">
						<input type="submit" class="btn btn-success col-md-5 loginBtn" value="注册" />
						<input type="reset" class="btn btn-primary col-md-5 loginBtn" value="重置" />
					</div>
				</form>
			</div>
		</div>
	</body>
<script type="text/javascript" >
$(document).ready(function() {
	$("#registered").addClass("hide");
	$("#toReg").bind("click",function(){
		$("#login").removeClass("show");
		$("#login").addClass("hide");
		$("#registered").removeClass("hide")
		$("#registered").addClass("show");
	});
	$("#toLogin").bind("click",function(){
		$("#registered").removeClass("show");
		$("#registered").addClass("hide");
		$("#login").removeClass("hide")
		$("#login").addClass("show");
	});
});
</script>
</html>
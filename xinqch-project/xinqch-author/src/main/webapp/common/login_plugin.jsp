<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>漂泊工作者综合管理系统</title>
		<style type="text/css">
			#login-container{
				background-color: white;
				opacity:0.8;/*透明*/
				width: 300px;
				height: 100%;
				margin: 0 auto;
				margin-top:120px;
				padding:10px;
			}
			#user-input{
				height:33px;
				background:url("/public/images/login-user.png") no-repeat 0 center;
			}
			#passwd-input{
				height:33px;
				background:url("/public/images/login-passwd.png") no-repeat 0 center;
			}
			#user-input input,#passwd-input input{
				float:left;
				background:none;
				line-height:36px;
				text-indent:24px;
			}
			.loginBtn{
				margin: 0 10px;
			}
			#loginWarning{
				float: right;
				font-size: 12px;
				color:#c0c0c0;
			}
			#regWarning{
				font-size: 12px;
				color:#c0c0c0;
			}
		</style>
	</head>
	<body>
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
					<div class="form-group">
						<input type="password" class="form-control" style="width: 60%;float: left;" name="loginPasswd" value="" placeholder="请输入验证码"  />
						<img id="validImage" alt="验证码图片" style="float: right;" src="<%=request.getContextPath()%>/valid/index">
					</div>
					<div class="form-group checkbox" style="clear: both;padding-top: 10px;">
						<label>
							<input type="checkbox" class="" name="loginStatus" value="" />下次自动登录
						</label>
					</div>
					<div class="form-group" style="height: 40px;">
						<input type="submit" class="btn btn-success col-md-5 loginBtn" value="登录" />
						<input type="reset" class="btn btn-primary col-md-5 loginBtn" value="重置" />
					</div>
					<div class="form-group" style="height: 10px;">
						<span id="loginWarning">若没有登录账号请您<span id="toReg" class="label label-primary clickImg">注册</span></span>
					</div>
				</form>
			</div>
			<div id="registered">
				<form id="registeredForm" name="registeredForm" action="/into/loginHome" method="post" accept-charset="UTF-8">
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
						<input type="password" class="form-control" style="width: 60%;float: left;" name="loginPasswd" value="" placeholder="请输入验证码"  />
						<img id="validImage" alt="验证码图片" style="float: right;" src="<%=request.getContextPath()%>/valid/index">
					</div>
					<div class="form-group" style="clear: both;padding-top: 10px;height: 40px;">
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
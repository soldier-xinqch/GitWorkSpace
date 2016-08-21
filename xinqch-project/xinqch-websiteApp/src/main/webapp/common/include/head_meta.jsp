<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="Cache-Control" content="no-transform" />
<meta name="renderer" content="webkit">

<!-- 记得更改 网址信息 -->
<meta name="mobile-agent" content="format=html5;url=http://m.xinqch.icoc.me/"/>

<meta name="keywords" content=""/>
<meta name="description" content=""/>

<link type="text/css" rel="stylesheet" href="../../public/css/main.css">
<link type="text/css" rel="stylesheet" href="../../public/css/nprogress.css">
<link type="text/css" rel="stylesheet" href="../../public/css/normalize.css">
<link type="text/css" rel="stylesheet" href="../../public/css/bootstrap.min.css ">
<link rel="stylesheet" href="../../public/css/bootstrap.min.css" media="screen">

<script type="text/javascript" src="../../public/js/nprogress.js"></script>
<script type="text/javascript" src="../../public/js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="../../public/js/bootstrap.min.js"></script>

<style type="text/css">
#suspension-right{
			width: 30px;
            height: 80px;
            background: #0000FF;
            position: absolute;
            right: 0;
            top: 200;
}

/* 响应式菜单 begin  */
.equinav .navbar-brand {
	display: none;
}
.equinav .navbar-collapse {
	padding: 0 !important;
}

.equinav-collapse .navbar-header {
	float: none;
}
.equinav-collapse .navbar-brand,
.equinav-collapse .navbar-toggle {
	display: block !important;
}
.equina-collapse .navbar-collapse {
	border-top: 1px solid #e7e7e7 !important;
}
.equinav-collapse .navbar-collapse.collapse {
	display: none !important;
}
.equinav-collapse .navbar-nav {
	float: none !important;
	margin: 0 !important;
}
.equinav-collapse .navbar-nav > li {
	width: auto !important;
	float: none !important;
}
.equinav-collapse .navbar-nav > li > a {
	text-align: left !important;
	padding-top: 10px !important;
	padding-bottom: 10px !important;
}
.equinav-collapse .navbar-collapse,
.equinav-collapse .navbar-collapse.collapse.in {
	border-top: 1px solid #e7e7e7 !important;
	display: block !important;
}
.equinav-collapse .collapsing {
	overflow: hidden !important;
}
.equinav-collapse .dropdown-toggle {
	background-color: #e7e7e7 !important;
}
.equinav-collapse .dropdown-toggle > .caret {
	display: inline-block !important;
}
.equinav-collapse .dropdown-menu {
	background: none !important;
	float: none !important;
	border: 0 !important;
	box-shadow: none !important;
	position: relative !important;
}
.equinav-collapse .navbar-nav .open .dropdown-menu {
	display: block !important;
}
.equinav-collapse .navbar-nav .open .dropdown-menu > li > a,
.equinav-collapse .navbar-nav .open .dropdown-menu .dropdown-header {
	color: #777 !important;
	padding: 5px 15px 5px 25px !important;
}
.navbar-default{
	background-color: #fff;
    border-color: #fff;
}
a:hover{
	color: red;
}
/*TODO 给a标签的文字经过 成红色  */
/* 响应式菜单 end */
</style>
<script type="text/javascript">
	$(function() {
		/* 页面加载进度条  */
		NProgress.start();
		$(document).ready(function() {
			NProgress.done();
		});
	});
	
	/* window.onscroll = function () {
        var oDiv = document.getElementById('suspension-right');
        //获取移动高度
        var DivScroll = document.documentElement.scrollTop || document.body.scrollTop;     
        //oDiv.style.top = (document.documentElement.clientHeight - oDiv.offsetHeight)/2 + DivScroll + 'px';
        //调用传参，其中里面的参数是DIV要走的终点。也就是（可视高度-DIV高度）/2+移动高度
        move(parseInt((document.documentElement.clientHeight - oDiv.offsetHeight) / 2 + DivScroll));    
    };

    var timer = null;
    function move(end) {
    	//首先，先关闭之前如果有开启的setInterval;
        clearInterval(timer);      
        timer = setInterval(function () {       
            var oDiv = document.getElementById('#suspension-right');
            //计算DIV要走的速度，DIV要走的速度就等于（终点-offsetTop高度）/缩放系数
            var speed = (end - oDiv.offsetTop) / 5;   
            //为了避免小数，将其取整
            speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed);  
            //当DIV到达终点，则关闭setInterval;
            if (oDiv.offsetTop == end) {        
                clearInterval(timer);
            }
            else {
            	//移动div
                oDiv.style.top = oDiv.offsetTop + speed + 'px';     
            }
        }, 30);
    } */

	
	//收藏本站 bbs.ecmoban.com
	function AddFavorite(title, url) {
	  try {
	      window.external.addFavorite(url, title);
	  }
	catch (e) {
	     try {
	       window.sidebar.addPanel(title, url, "");
	    }
	     catch (e) {
	         alert("抱歉，您所使用的浏览器无法完成此操作。\n\n加入收藏失败，请使用Ctrl+D进行添加");
	     }
	  }
	}
	
	/* 响应式菜单 begin */
	var breakpoint = 0;

		// Function to set equinav breakpoint
		function equiNavBreakpoint () {
			$('.equinav ul.navbar-nav > li').each(function(){ breakpoint += $(this).innerWidth(); }); //add up all menu items width for breakpoint
		}

		equiNavBreakpoint();

		// Function to apply equinav menu
		function equiNavMenu () {
			$('.equinav ul.navbar-nav > li').removeAttr('style');

			var mq = window.matchMedia('(min-width: 768px)');

			var nav = $('.equinav').innerWidth(); // Navbar Width
			var items = $('.equinav ul.navbar-nav > li').length; // Total number of menu items
			var space = nav - breakpoint; // Empty navbar space
			var spacer = parseInt(space / items); // Number of pixels to spread out to individual menu items. Since decimal places is not good with pixels we have to use parseInt.
			var xspace = nav - (breakpoint + (spacer * items)); // The remaining space after getting the spacer with parseInt
			var xspacer = Math.ceil(xspace / items); // The remaning number of pixels to distribute to menu items

			var num = 0;

			if (mq.matches) {

			  if (nav > breakpoint) {

					$('.equinav').removeClass('equinav-collapse');

					if (breakpoint == 0) equiNavBreakpoint();

					$('.equinav ul.navbar-nav > li').each(function(){

							$(this).css({'width':'auto'});

							var itemwidth = 0;
							itemwidth = (num < xspace) ? ($(this).innerWidth() + spacer) + xspacer : $(this).innerWidth() + spacer;

							$(this).css({'width':itemwidth+'px'});

							num++;

							if ( $(this).find('.dropdown-menu').length != 0 ) {
								if (num == items) $(this).find('.dropdown-menu').addClass('pull-right');
								if ($(this).find('.dropdown-menu').innerWidth() < $(this).innerWidth()) $(this).find('.dropdown-menu').css({'width':$(this).innerWidth()+'px'});
							}
					});

				} else {

					$('.equinav').addClass('equinav-collapse');
					$('.equinav ul.navbar-nav > li > .dropdown-menu').removeAttr('style');

				}

			} else {

				$('.equinav').addClass('equinav-collapse');
				$('.equinav ul.navbar-nav > li > .dropdown-menu').removeAttr('style');

			};
		}

		equiNavMenu();

		$(window).resize(function(){
			equiNavMenu();
		});
		/* 响应式菜单 end  */
</script>
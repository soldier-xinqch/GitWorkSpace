/**
* 获取光标所在的字符位置
* @param obj 要处理的控件, 支持文本域和输入框
* @author hotleave
*  调用方法  functionName（this）
*/
function getPosition(obj){
	//alert(obj.tagName);
	var result = 0;
	if(obj.selectionStart){ //非IE浏览器
		result = obj.selectionStart
	}else{ //IE
		var rng;
		if(obj.tagName == "TEXTAREA"){ //如果是文本域
			rng = event.srcElement.createTextRange();
			rng.moveToPoint(event.x,event.y);
		}else{ //输入框
			rng = document.selection.createRange();
		}
		rng.moveStart("character",-event.srcElement.value.length);
		result = rng.text.length;
	}
	return result;
}
/**
 * 获取元素的坐标
 * @param obj
 */
function showTagPosition(obj){
	 var y = $('#demoInput').offset().top;
	 var x = $('#demoInput').offset().left;
	 demo.spawn(x, y);
} 

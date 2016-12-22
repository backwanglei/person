/**
 * 
 */
$(function () {
$('body').bind('mouseover',function(){
for(var i = 0;i<100;i++){
		$('.mydiv').animate({top : '600px' ,left :'600px',width:'160px',height:'80px'}, 2000);
		$('.mydiv').animate({top : '300px' ,left: '1100px',width:'320px',height:'160px'}, 2000);
		$('.mydiv').animate({top : '10px' ,left: '600px',width:'160px',height:'80px'}, 2000);
		$('.mydiv').animate({top : '300px' ,left: '10px',width:'320px',height:'160px'}, 2000);
			}
})
})
setInterval(function(){//定时器
	var dd = new Date();
	var y = dd.getFullYear();
	var m = dd.getMonth() + 1;
	var d = dd.getDate();
	var h = dd.getHours();
	var mi = dd.getMinutes();
	var s = dd.getSeconds();
	if(s<10){
		var l="0"+s;
		var str = y + "年" + m + "月" + d + "日&nbsp;&nbsp;" + h + ":" + mi + ":" +l + "&nbsp;&nbsp;星期" + "日一二三四五六".charAt(dd.getDay());
		}else{
			var str = y + "年" + m + "月" + d + "日&nbsp;&nbsp;" + h + ":" + mi + ":" +s+ "&nbsp;&nbsp;星期" + "日一二三四五六".charAt(dd.getDay());
		}
	document.getElementById("now_time").innerHTML = str;
	},1000);


$('#idchange').hide();
$('#namechange').hide();
$('#idBT')[0].onclick=function(){
	$('#menu').hide();
	$('#idchange').show();
}
$('#nameBT')[0].onclick=function(){
	$('#menu').hide();
	$('#namechange').show();
}
$('#backBT')[0].onclick=function(){
	window.location.href="welcome.jsp"
}
$('#back1')[0].onclick=function(){
	window.location.href="changebook.jsp"
}
$('#back2')[0].onclick=function(){
	window.location.href="changebook.jsp"
}
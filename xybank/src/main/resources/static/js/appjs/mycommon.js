//刷新iframe
function reFresh(href){
	var href = window.location.href;
	var src = '/web' + href.split('/web')[1];//去掉前方的ip地址
	src = src.replace('#','');
	parent.$('iframe[src=\"'+src+'\"]').attr('src', src);
}
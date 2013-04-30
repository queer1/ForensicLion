/**
 * 
 */
// 增加TAB页
function addtab(name, url) {
	window.parent.addTab(name, url);
	return false;
}
// 关闭本身的Tab
function closetab(name) {
	window.parent.$('#tabs').tabs('close', name);
	// window.parent.document.getElementById('tabs').tabs('close',name);
}

// 重载listusers中的griddata中的数据
function reloaddatagrid(name) {
	var pp = window.parent.$('#tabs').tabs('getTab', name); // get the panel
	pp.panel('refresh');
}

// 判断是否登录名是否存在
function checkcheckParamExist(param, value) {
	var json = '{\"param\":"' + param + "\",\"value\":\"" + value + "\"}";
	$.ajax({
		url : "json/user_checkParamExist",
		type : 'post',
		data : json,
		success : function() {
			return 'SUCCESS';

		},
		error : function(xhr) {
			return 'FAIT';
		},// ////
		contentType : "application/json; charset=utf-8"
	});

}
// 给jquery添加获得url传来参数的方法
(function($) {
	$.getUrlParam = function(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if (r != null)
			return unescape(r[2]);
		return null;
	};
})(jQuery);

// /////////////////////Cookie设置////////////////////////////////////////////////////////////////
function setCookie(name, value) {// 两个参数，一个是cookie的名子，一个是值
	var Days = 30; // 此 cookie 将被保存 30 天
	var exp = new Date(); // new Date("December 31, 9998");
	exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
	document.cookie = name + "=" + escape(value) + ";expires="
			+ exp.toGMTString();
}

function getCookie(name) {// 取cookies函数
	var arr = document.cookie
			.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
	if (arr != null)
		return unescape(arr[2]);
	return null;
}
// //////////////////////////////////清空所有input和textarea//////////////////////////////////////////////////////////////////
function clearIput() {
	$('input').val("");
	$('textarea').val('');
}

// /////////////////////////////////显示上传窗口//////////////////////////////////////////////////////////////
/**
 * 创建上传窗口 公共方法
 * 
 * @param chunk
 *            是否分割大文件
 * @param callBack
 *            上传成功之后的回调
 */
function Uploader(chunk,url,type,datagrid, callBack) {
	var addWin = $('<div style="overflow: hidden;"/>');
	var upladoer = $('<iframe/>');
	upladoer.attr({
		'src' : 'uploader?url='+ url +'&type='+type,
		width : '100%',
		height : '100%',
		frameborder : '0',
		scrolling : 'no'
	});
	addWin.window({
		title : "上传文档模版",
		height : 350,
		width : 550,
		minimizable : false,
		modal : true,
		collapsible : false,
		maximizable : false,
		resizable : false,
		content : upladoer,
		onClose : function() {
			var fw = GetFrameWindow(upladoer[0]);
			var files = fw.files;
			$(this).window('destroy');
			window.parent.$('#'+ datagrid ).datagrid('reload');
			callBack.call(this, files);
		},
		onOpen : function() {
			var target = $(this);
			setTimeout(function() {
				var fw = GetFrameWindow(upladoer[0]);
				fw.target = target;
			}, 100);
		}
	});
}

/**
 * 根据iframe对象获取iframe的window对象
 * 
 * @param frame
 * @returns {Boolean}
 */
function GetFrameWindow(frame) {
	return frame && typeof (frame) == 'object' && frame.tagName == 'IFRAME'
			&& frame.contentWindow;
}

function makerUpload(chunk,url,type,datagrid) {
	Uploader(chunk,url,type,datagrid, function(files) {
		if (files && files.length > 0) {
			$("#res").text("成功上传：" + files.join(","));
		}
	});
}
// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	var primeCost = parseInt($("#primeCost").val());
	var salePrice = parseInt($("#salePrice").val());
	if (primeCost < salePrice) {
		layer.alert('渠道价格不能低于商品价格')
		return false;
	}
	$.ajax({
		cache : true,
		type : "POST",
		url : "/web/product/product/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			},
			primeCost : {
				required : true,
				digits : true
			},
			salePrice : {
				required : true,
				digits : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入名称"
			},
			primeCost : {
				required : icon + "请输入市场价",
				digits : icon + "请输入整数"
			},
			salePrice : {
				required : icon + "请输入渠道价",
				digits : icon + "请输入整数"
			}
		}
	})
}
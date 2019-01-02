$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		update();
	}
});
function update() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/web/business/businessInfo/update",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				location.reload();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
jQuery.validator.addMethod("isMobile", function(value, element) {
	var length = value.length;
	var regPhone = /^1([3578]\d|4[57])\d{8}$/;
	return this.optional(element) || (length == 11 && regPhone.test(value));
}, "请正确填写您的手机号码");
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			businessName : {
				required : true
			},
			mobilePhone : {
				required : true,
				isMobile : true
			}
		},
		messages : {
			businessName : {
				required : icon + "请输入名字"
			},
			mobilePhone : {
				required : icon + "请输入手机号",
				isMobile : icon + "请填写11位的手机号码!"
			}
		}
	})
}
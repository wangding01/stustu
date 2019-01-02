$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		ticket();
	}
});

$(function() {
	laydate({
		elem : '#startTime',
	});
	console.log($('#ticketType').val())
	if ($('#ticketType').val() == '1') {
		$('#serviceType').val('接机接站');
	}
	if ($('#ticketType').val() == '2') {
		$('#serviceType').val('送机送站');
	}

});
function ticket() {
	var data = JSON.stringify($('#signupForm').serializeObject());
	$.ajax({
		cache : true,
		type : "POST",
		url : "http://192.168.1.119:8090/ticket/distribution_save_ticket",
		data : data,// 你的formid
		contentType : "application/json",
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.errCode == 1) {
				$("#btn").hide();
				$(":input").attr("readonly", "readonly");
				var imgId = document.getElementById("pay-img");
				if (imgId.style.display == "none") {
					imgId.style.display = "block";
				}
				var spId = document.getElementById("sp");
				if (spId.style.display == "none") {
					spId.style.display = "block";
				}

			} else {
				parent.layer.alert("失败")
			}

		}
	});

}
$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name]) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
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
			name : {
				required : true
			},
			mobileNumber : {
				required : true,
				isMobile : true
			},
			amountPayment : {
				required : true,
				min : 1
			},
			startTime : {
				required : true
			},
			startAddress : {
				required : true
			},
			endAddress : {
				required : true
			},
			passengerNumber : {
				required : true,
				max : 20,
				min : 1
			}
		},
		messages : {
			name : {
				required : icon + "请输入名称"
			},
			mobileNumber : {
				required : icon + "请输入电话",
				isMobile : icon + "请填写11位的手机号码!"
			},
			amountPayment : {
				required : icon + "总价",
				min : icon + "总价需要大于零"
			},
			startTime : {
				required : icon + "请选择服务时间"
			},
			startAddress : {
				required : icon + "请输入始发地"
			},
			endAddress : {
				required : icon + "请输入目的地"
			},
			passengerNumber : {
				required : icon + "数量",
				max : icon + "一次性最多购买20张",
				min : icon + "至少购买一张票"
			}
		}
	})
}
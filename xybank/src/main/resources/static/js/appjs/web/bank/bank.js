
var prefix = "/web/web/bank"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'id', 
									title : '主键' 
								},
																{
									field : 'loan', 
									title : '贷款方式' 
								},
																{
									field : 'lendingBank', 
									title : '放款银行' 
								},
																{
									field : 'interest', 
									title : '利息' 
								},
																{
									field : 'area', 
									title : '地区范围' 
								},
																{
									field : 'lendingLines', 
									title : '额度' 
								},
																{
									field : 'lendingLimit', 
									title : '期限' 
								},
																{
									field : 'access', 
									title : '准入条件' 
								},
/**																{
									field : 'creditConditions', 
									title : '征信条件' 
								},
																{
									field : 'minAge', 
									title : '年龄min' 
								},
																{
									field : 'maxAge', 
									title : '年龄max' 
								},
																{
									field : 'lendingTime', 
									title : '放款时间' 
								},
																{
									field : 'poundage', 
									title : '手续费' 
								},
																{
									field : 'magnification', 
									title : '放大倍数' 
								},
																{
									field : 'disadvantage', 
									title : '劣势' 
								},
																{
									field : 'advantage', 
									title : '优势' 
								},
																{
									field : 'specialRequirements', 
									title : '特殊要求' 
								},
																{
									field : 'mortgageType', 
									title : '抵押类型' 
								},
																{
									field : 'reimbursementMeans', 
									title : '还款方式' 
								},
																{
									field : 'lendingRate', 
									title : '放款比例' 
								},
																{
									field : 'needInformation', 
									title : '需要资料' 
								},
																{
									field : 'hoseAge', 
									title : '房龄要求' 
								},
																{
									field : 'customerRequest', 
									title : '客户要求' 
								},
																{
									field : 'process', 
									title : '流程' 
								},
																{
									field : 'needCertificates', 
									title : '是否压证' 
								},
																{
									field : 'evaluateNotaryFees', 
									title : '评估公证费' 
								},
																{
									field : 'needNational', 
									title : '是否看名族' 
								},
																{
									field : 'rebates', 
									title : '返点' 
								},
																{
									field : 'gpsFees', 
									title : 'GPS费用' 
								},
																{
									field : 'contact', 
									title : '联系人' 
								},
																{
									field : 'contactPhone', 
									title : '联系人电话' 
								},**/
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.id
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.id
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.id
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d + f ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['id'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}
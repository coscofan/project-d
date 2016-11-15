

function toJSON(_obj){
	return JSON.parse(JSON.stringify(_obj));
}


//以下为修改jQuery Validation插件兼容Bootstrap的方法，没有直接写在插件中是为了便于插件升级
$.validator.setDefaults({
    highlight: function (element) {
        $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
    },
    success: function (element) {
        element.closest('.form-group').removeClass('has-error').addClass('has-success');
    },
    errorElement: "span",
    errorPlacement: function (error, element) {
        if (element.is(":radio") || element.is(":checkbox")) {
            //error.appendTo(element.parent().parent().parent());
            error.appendTo(element.parent().parent());
        } else {
            error.appendTo(element.parent().parent());
        }
    },
    errorClass: "help-block m-b-none",
    validClass: "help-block m-b-none"
});


$.fn.extend({

    form_validate:function(){
        var _obj = $(this);
        if(!_obj.is('form')){
            return;    
        }

        var v_rules = {}, v_messages = {};
        
        $('input,select,textarea').each(function(){

            var v = null, vm = null;

             eval("v = " + $(this).attr("validate"));
             if(v)
             {
                v_rules[$(this).attr('name')] = v;
             }

              eval("vm = " + $(this).attr("validateMessage"));

              if(vm)
              {
                v_messages[$(this).attr('name')]  = vm;
              }

        });

        _obj.validate({
            rules:    v_rules,
            messages: v_messages
        });
    }

});


$.extend({
	// 再次确认
	confirm:function(_tips, _submit, _cancle){  
		layer.confirm(_tips, {
			  btn: ['确定','取消'] //按钮
			},
			function(index){
				if(typeof(_submit) != 'undefined'){
					_submit();
				}
				layer.close(index);
			},
			function(index){
				if(typeof(_cancle) != 'undefined'){
					_cancle();
				}
				layer.close(index);
			}
		)
	},
	tips:function(_tips){  // 提示信息
		layer.msg(_tips);
	},
	loading:function(){  
		layer.msg('加载中', {icon: 4});
	},
	closeAll:function(){  // 关闭所有layer弹出框
		layer.closeAll();
	},
	showPic:function(url){    // 图片预览
		var img = new Image();  
		img.src = url;  // 预加载图片，计算弹出框的width、height
		img.onload = function(){
			var index = layer.open({
				type: 2,
				title: false,  // 去掉标题
				shadeClose: true,
				fixed: true, //不固定
				skin: 'layui-layer-nobg', //没有背景色
				shade: 0.6,
				area: [img.width + 'px', img.height + 'px'],
				content: url  //pic 路径
			}); 
		}
		img.onerror = function(){
			$.tips('图片不存在');
		}
	},
	openDlg:function(options){
		layer.open({
			  type: 2,
			  area: [options.width, options.height],
			  fixed: false, //不固定
			  maxmin: true,
			  shade: 0.6,
			  title:options.title,
			  content: options.content
			});
	}

});




//
//        $(function(){
//            $('#signupForm').form_validate();
//        });


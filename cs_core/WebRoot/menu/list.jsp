<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
	<%@ include file="../common/head.jsp"%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台" />
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术" />
	<link href="../res/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet" />
    <script src="../res/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="../res/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="../res/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
    <script>
    	function queryParams(params){
    		var page = params.offset / params.limit + 1;
    		return  { page:page, pageSize:params.limit, search:params.search, sort:params.sort,order:params.order};  
    	}
    	
    	function view(){
    		alert('xx');
    	}
    	
    	
    	$(function(){
    		$('#table1').on('dbl-click-row.bs.table', function(e, value, row, $element){
//     		    alert(value['id']);
//     			 layer.open({
//     				  type: 1,
//     				  area: ['600px', '360px'],
//     				  shadeClose: true, //点击遮罩关闭
//     				  content: '\<\div style="padding:20px;">自定义内容\<\/div>'
//     				  });
				
// 				$.open({
// 					width:'700px',
// 					height:'530px',
// 					content:'eeee'
// 				});
				$.showPic('http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg');
    		}
    		);
     	});
    	
    </script>
</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
          <div class="ibox float-e-margins">
              <div class="ibox-content">
                  <div class="fixed-table-toolbar" id="exampleTableEventsToolbar" role="group">
                      <button type="button" class="btn btn-outline btn-default">
                          <i class="glyphicon glyphicon-plus" aria-hidden="false"></i>
                      </button>
                      <button type="button" class="btn btn-outline btn-default">
                          <i class="glyphicon glyphicon-heart" aria-hidden="false"></i>
                      </button>
                      <button type="button" class="btn btn-outline btn-default">
                          <i class="glyphicon glyphicon-trash" aria-hidden="false"></i>
                      </button>
                  </div>
                  <table id="table1"  class="table table-striped table-bordered table-hover dataTables-example" 
                  	   data-toggle="table"
				       data-url="list2.cs"
				       data-method="get"
				       data-click-to-select="true"
				       data-row-style="rowStyle"
				       data-pagination="true"
				       data-search="true"
				       data-data-type="json"
				       data-show-refresh="true"
				       data-search-on-enter-key="true"
				       data-toolbar="#exampleTableEventsToolbar"
				       data-side-pagination="server"
				       data-query-params="queryParams"
						>
                      <thead>
                          <tr>
                              <th data-radio="true"	data-click-to-select="true"></th>
                              <th data-field="id">菜单id</th>
                              <th data-field="name">菜单名称</th>
                          </tr>
                      </thead>
                  </table>
              </div>
          </div>
    </div>
    

</body>

</html>

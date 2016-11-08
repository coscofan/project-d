<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<%@ include file="../common/table.jsp"%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - 数据表格</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="../favicon.ico"> 
    <link href="../res/css/bootstrap.min.css" rel="stylesheet">
    <link href="../res/css/font-awesome.css" rel="stylesheet">

    <!-- Data Tables -->
    <link href="../res/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <link href="../res/css/animate.css" rel="stylesheet">
    <link href="../res/css/style.css" rel="stylesheet">
	
	<script src="../res/js/jquery.min.js"></script>
	<script src="../res/js/bootstrap.min.js"></script>
	<script src="../res/js/plugins/jeditable/jquery.jeditable.js"></script>
	<!-- Data Tables -->
	<script src="../res/js/plugins/dataTables/jquery.dataTables.js"></script>
	<script src="../res/js/plugins/dataTables/dataTables.bootstrap.js"></script>
	
	<!-- Data Tables -->
</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>基本 </h5>
                    </div>
                    <div class="ibox-content">
                        <table class="table table-striped table-bordered table-hover dataTables-example">
                            <thead>
                                <tr>
                                    <th>菜单id</th>
                                    <th>菜单名称</th>
                                </tr>
                            </thead>
                            <tbody>
<%--                                 <s:forEach items="${ superMenuList }" var="superMenu"> --%>
<!--                                 	 <tr class="gradeA"> -->
<%-- 	                                    <td>${superMenu.id }</td> --%>
<%-- 	                                    <td>${superMenu.name }</td> --%>
<!-- 	                                </tr> -->
<%--                                 </s:forEach> --%>
                            </tbody>
<!--                             <tfoot> -->
<!--                                 <tr> -->
<!--                                     <th>渲染引擎</th> -->
<!--                                     <th>浏览器</th> -->
<!--                                 </tr> -->
<!--                             </tfoot> -->
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        $(document).ready(function () {
            $('.dataTables-example').dataTable({
                // "sAjaxSource":"2.txt"
				"bLengthChange": false, //改变每页显示数据数量
				"bFilter": false, //过滤功能
				"bSort":false,
				"iDisplayLength":12,
				"ajax":'list2.cs',
				"bServerSide": true,                    //指定从服务器端获取数据
				"aoColumns": [
					{ "mDataProp": "id" },
					{ "mDataProp": "name" },
					]
                //$_GET['sColumns']将接收到aoColumns传递数据
            });
        });
    </script>

</body>

</html>

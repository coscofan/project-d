<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="init.jsp"%>

<link rel="shortcut icon" href="../favicon.ico" /> 
<!-- 全局js -->
<script src="../res/js/jquery.min.js"></script>
<script src="../res/js/bootstrap.min.js"></script>

 <script src="../res/js/plugins/validate/jquery.validate.min.js"></script>
 <script src="../res/js/plugins/validate/messages_zh.min.js"></script>
<script src="../res/js/plugins/layer/layer.min.js"></script>

 <script src="../res/js/common.js"></script>

<!-- 第三方插件 -->
<!-- <script src="../res/js/plugins/pace/pace.min.js"></script> -->
 
<link rel="shortcut icon" href="../res/favicon.ico"> 
<link href="../res/css/bootstrap.min.css" rel="stylesheet">
<link href="../res/css/animate.css" rel="stylesheet">
<link href="../res/css/style.css" rel="stylesheet">
<link href="../res/css/font-awesome.css" rel="stylesheet">
<% 
String path = request.getContextPath(); 
// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）: 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 


<%@page language="java" contentType="text/html; character=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>送货员页面</title>
    <link rel="stylesheet" href="${ctx}/resource/css/pintuer.css">
    <link rel="stylesheet" href="${ctx}/resource/css/admin.css">
    <script src="${ctx}/resource/js/jquery.js"></script>
    <script src="${ctx}/resource/js/pintuer.js"></script>
</head>
<body style="background-color: #f2f9fd">
    <div class="header bg-main">
        <div class="logo margin-big-left fadein-top">
            <h1>送货员页面</h1>
        </div>
        <div class="head-l">
            <a class="button button-little bg-green" href="${ctx}/login/uIndex" target="_blank">
                <span class="icon-home"></span>前台首页
            </a>
            <a class="button button-little bg-red" href="dtuichu.html">
                <span class="icon-power-off"></span>退出登录
            </a>
        </div>
    </div>
    <div class="leftnav">
        <div class="leftnav-title"><strong><span class="icon-list">菜单列表</span> </strong></div>
        <h2><span class="icon-user"></span>基本设置 </h2>
        <ul style="display: block">
            <li><a href="${ctx}/itemOrder/findBySql2" target="right"><span class="icon-caret-right"></span>订单管理</a> </li>
        </ul>
    </div>
    <ul class="bread">

    </ul>
    <div class="admin">
        <iframe scrolling="auto" rameborder="0" src="${ctx}/itemOrder/findBySql2" name="right" width="100%" height="100%"></iframe>
    </div>
</body>
</html>
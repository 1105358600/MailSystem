<%@page language="java" contentType="text/html; character=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/user/css/style.css">
    <script src="${ctx}/resource/user/js/jquery-1.8.3.min.js"></script>
    <script src="${ctx}/resource/user/js/jquery.luara.0.0.1.min.js"></script>
</head>
<body>
    <%@include file="/common/utop.jsp"%>
<!--导航条-->
<div class="width100" style="height: 45px;background: #dd4545;margin-top: 40px;position: relative;z-index: 100;">
    <!--中间的部分-->
    <div class="width1200 center_yh relative_yh" style="height: 45px;">
        <!--列表导航-->
        <div class="left_yh Selected" style="width: 230px;height: 45px;" id="hiddenShow">
            <!--头部的图标-->
            <img src="${ctx}/resource/user/images/cd.png" class="left_yh" style="margin-left: 24px;" alt="">
            <span class="block_yh left_yh fff" style="height: 45px;line-height: 44px;margin-left: 10px;">分类</span>
            <!--导航展开部分-->
            <div class="downSlide">
                <c:forEach items="${lbs}" var="data" varStatus="l">
                    <div class="n1Nav" >
                        <font>${data.father.name}</font>
                        <img src="${ctx}/resource/user/images/jt.png" alt="">
                        <div class="n2Nav" style="font-size: 18px;font-weight: bold;">
                            <div class="n3Nav" >
                                <p>${data.father.name}</p>
                                <c:forEach items="${data.childrens}" var="child" varStatus="ll">
                                    <a href="${ctx}/item/shoplist?categoryIdTwo=${child.id}"style="font-size: 15px;font-family: inherit">${child.name}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <!--普通导航-->
        <div class="left_yh font16" id="pageNav">
            <a href="${ctx}/login/uIndex">首页</a>
            <a href="${ctx}/news/list">公告</a>
            <a href="${ctx}/message/add">留言</a>
        </div>
    </div>
</div>
<!--轮动广告-->
<div class="width1200 center_yh hidden_yh" style="position: relative;z-index:80;">
    <div class="example2" style="width: 1200px;height: 490px;overflow: hidden;margin-left: 230px;">
        <ul>
            <li><img src="${ctx}/resource/images/欢迎光临.jpg" alt=""></li>
            <li><img src="${ctx}/resource/images/新店开业.jpg" alt=""></li>
            <li><img src="${ctx}/resource/images/双十一.jpg" alt=""></li>
        </ul>
    </div>
    <script>
        $(function () {
            $(".example2").luara({width:"966",height:"490",interval:3000,selected:"seleted",deriction:"left"});
        });
    </script>
</div>


<!--热门商品-->
<div class="width1200 center_yh hidden_yh">

    <div class="width100 hidden_yh" >
        <div class="width1198 center_yh" style="height: 35px;background: #f0f0f0; border: 1px solid #ddd;margin-top:25px;">
            <a href="${ctx}/item/shoplist?id=${data.id}" class="mR">默认</a>
            <a href="${ctx}/item/shoplist?price-1&id=${data.id}" class="mR">
                价格
                <img src="${ctx}/resource/user/images/gg.png" alt="">
            </a>
            <a href="${ctx}/item/shoplist?gmNum=1&id=${data.id}" class="mR">
                销量
                <img src="${ctx}/resource/user/images/gg.png" alt="">
            </a>
        </div>
        <div class="normalPic" >
            <c:forEach items="${rxs}" var="data" varStatus="l" >
                <a href="${ctx}/item/view?id=${data.id}">
                    <h3 class="yihang c_33 font14 font100" style="padding-left: 10px;padding-right: 10px;">${data.name}</h3>
                    <p class="red font14" style="padding-left: 10px;">${data.price}</p>
                    <img src="${data.url1}" width="105" height="118" alt="" style="margin:0 auto">
                </a>
            </c:forEach>
        </div>
    </div>
</div>
    <%@include file="/common/ufooter.jsp"%>
</body>
</html>




















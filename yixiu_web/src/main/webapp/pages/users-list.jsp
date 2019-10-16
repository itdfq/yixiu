<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

<html>
<head>
    <title>管理界面</title>
</head>
<script>
    function changePageSize() {
        //获取下拉框的值
        var pageSize = $("#changePageSize").val();

        //向服务器发送请求，改变没页显示条数
        location.href = "${pageContext.request.contextPath}/orders/findAll.do?page=1&size="
            + pageSize;
    }
</script>
<body>
<div class="box-tools pull-right">
    <div class="has-feedback">
        <input type="text" class="form-control input-sm"
               placeholder="搜索"> <span
            class="glyphicon glyphicon-search form-control-feedback"></span>
    </div>
</div>
<!--数据列表-->
    <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
    <thead>
    <tr>
        <th class="" style="padding-right:0px;">
            <input id="selall" type="checkbox" class="icheckbox_square-blue">
        </th>
        <th class="sorting_asc">ID</th>
        <th class="sorting_desc">姓名</th>
        <th class="sorting_asc sorting_asc_disabled">住址</th>
        <th class="sorting_desc sorting_desc_disabled">手机号码</th>
        <th class="sorting">微信</th>
        <th class="sorting">状态</th>
        <th class="text-center">操作</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${pageInfo.list}">
        <tr>
            <td><input name="ids" type="checkbox"></td>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.mobilePhone}</td>
            <td>${user.weChat}</td>
            <td>${user.numStr}</td>
            <td class="text-center">
                <button type="button" class="btn bg-olive btn-xs">修改</button>
                <button type="button" class="btn bg-olive btn-xs">删除</button>
                <button type="button" class="btn bg-olive btn-xs">添加</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
<div class="box-footer">
    <div class="pull-left">
        <div class="form-group form-inline">
            总共${pageInfo.pages} 页，共${pageInfo.total} 条数据。 每页
            <select class="form-control"id="changePageSize" onchange="changePageSize()">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
            </select> 条
        </div>
    </div>
    <div class="box-tools pull-right">
        <ul class="pagination">
            <li>
                <a href="${pageContext.request.contextPath}/users/findAll.do?page=1&size=${pageInfo.pageSize}" aria-label="Previous">首页</a>
            </li>
            <c:if test="${pageInfo.pageNum==1}">
            <li class="disabled">
            </c:if>
             <c:if test="${pageInfo.pageNum!=1}">
            <li>
            </c:if>
            <a href="${pageContext.request.contextPath}/users/findAll.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a></li>
            <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                <li><a href="${pageContext.request.contextPath}/users/findAll.do?page=${pageNum}&size=${pageInfo.pageSize}">${pageNum}</a></li>
            </c:forEach>
            <c:if test="${pageInfo.pageNum==pageInfo.pages}">
            <li class="disabled">
            </c:if>
             <c:if test="${pageInfo.pageNum!=pageInfo.pages}">
            <li>
            </c:if>
            <a href="${pageContext.request.contextPath}/users/findAll.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a></li>
            <li>
                <a href="${pageContext.request.contextPath}/users/findAll.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}" aria-label="Next">尾页</a>
            </li>
        </ul>
    </div>

</div>

</body>
</html>

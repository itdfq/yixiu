<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理界面</title>
</head>
<body>
<!-- 数据表格 -->
<div class="table-box">

    <!--工具栏-->
    <div class="pull-left">
        <div class="form-group form-inline">
            <div class="btn-group">
                <button type="button" class="btn btn-default" title="新建" onclick="location.href='${pageContext.request.contextPath}/pages/product-add.jsp'"><i
                        class="fa fa-file-o"></i> 新建
                </button>
                <button type="button" class="btn btn-default" title="删除"><i
                        class="fa fa-trash-o"></i> 删除
                </button>
                <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i>
                    开启
                </button>
                <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i>
                    屏蔽
                </button>
                <button type="button" class="btn btn-default" title="刷新"><i
                        class="fa fa-refresh"></i> 刷新
                </button>
            </div>
        </div>
    </div>
    <div class="box-tools pull-right">
        <div class="has-feedback">
            <input type="text" class="form-control input-sm" placeholder="搜索">
            <span class="glyphicon glyphicon-search form-control-feedback"></span>
        </div>
    </div>
    <!--工具栏/-->

    <!--数据列表-->
    <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
        <thead>
        <tr>
            <th class="" style="padding-right:0px;">
                <input id="selall" type="checkbox" class="icheckbox_square-blue">
            </th>
            <th class="sorting_asc">ID</th>
            <th class="sorting_desc">编号</th>
            <th class="sorting_asc sorting_asc_disabled">产品名称</th>
            <th class="sorting_desc sorting_desc_disabled">出发城市</th>
            <th class="sorting">出发时间</th>
            <th class="text-center sorting">产品价格</th>
            <th class="text-center sorting">产品描述</th>
            <th class="text-center sorting">状态</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td><input name="ids" type="checkbox"></td>
                <td>${product.id}</td>
                <td>${product.productNum}
                </td>
                <td>${product.productName}</td>
                <td>${product.cityName}</td>
                <td>${product.departureTimeStr}</td>
                <td class="text-center">${product.productPrice}</td>
                <td class="text-center">${product.productDesc}</td>
                <td class="text-center">${product.productStatusStr}</td>
                <td class="text-center">
                    <button type="button" class="btn bg-olive btn-xs">订单</button>
                    <button type="button" class="btn bg-olive btn-xs">详情</button>
                    <button type="button" class="btn bg-olive btn-xs">编辑</button>
                </td>
            </tr>
        </c:forEach>

        </tbody>
        <!--
    <tfoot>
    <tr>
    <th>Rendering engine</th>
    <th>Browser</th>
    <th>Platform(s)</th>
    <th>Engine version</th>
    <th>CSS grade</th>
    </tr>
    </tfoot>-->
    </table>
    <!--数据列表/-->

    <!--工具栏-->
    <div class="pull-left">
        <div class="form-group form-inline">
            <div class="btn-group">
                <button type="button" class="btn btn-default" title="新建"><i
                        class="fa fa-file-o"></i> 新建
                </button>
                <button type="button" class="btn btn-default" title="删除"><i
                        class="fa fa-trash-o"></i> 删除
                </button>
                <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i>
                    开启
                </button>
                <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i>
                    屏蔽
                </button>
                <button type="button" class="btn btn-default" title="刷新"><i
                        class="fa fa-refresh"></i> 刷新
                </button>
            </div>
        </div>
    </div>
    <div class="box-tools pull-right">
        <div class="has-feedback">
            <input type="text" class="form-control input-sm" placeholder="搜索">
            <span class="glyphicon glyphicon-search form-control-feedback"></span>
        </div>
    </div>
    <!--工具栏/-->

</div>
<div class="table-box">

    <!--工具栏-->
    <div class="pull-left">
        <div class="form-group form-inline">
            <div class="btn-group">
                <button type="button" class="btn btn-default" title="新建" onclick="location.href='${pageContext.request.contextPath}/pages/product-add.jsp'"><i
                        class="fa fa-file-o"></i> 新建
                </button>
                <button type="button" class="btn btn-default" title="删除"><i
                        class="fa fa-trash-o"></i> 删除
                </button>
                <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i>
                    开启
                </button>
                <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i>
                    屏蔽
                </button>
                <button type="button" class="btn btn-default" title="刷新"><i
                        class="fa fa-refresh"></i> 刷新
                </button>
            </div>
        </div>
    </div>
    <div class="box-tools pull-right">
        <div class="has-feedback">
            <input type="text" class="form-control input-sm" placeholder="搜索">
            <span class="glyphicon glyphicon-search form-control-feedback"></span>
        </div>
    </div>
    <!--工具栏/-->

    <!--数据列表-->
    <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
        <thead>
        <tr>
            <th class="" style="padding-right:0px;">
                <input id="selall" type="checkbox" class="icheckbox_square-blue">
            </th>
            <th class="sorting_asc">ID</th>
            <th class="sorting_desc">编号</th>
            <th class="sorting_asc sorting_asc_disabled">产品名称</th>
            <th class="sorting_desc sorting_desc_disabled">出发城市</th>
            <th class="sorting">出发时间</th>
            <th class="text-center sorting">产品价格</th>
            <th class="text-center sorting">产品描述</th>
            <th class="text-center sorting">状态</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td><input name="ids" type="checkbox"></td>
                <td>${product.id}</td>
                <td>${product.productNum}
                </td>
                <td>${product.productName}</td>
                <td>${product.cityName}</td>
                <td>${product.departureTimeStr}</td>
                <td class="text-center">${product.productPrice}</td>
                <td class="text-center">${product.productDesc}</td>
                <td class="text-center">${product.productStatusStr}</td>
                <td class="text-center">
                    <button type="button" class="btn bg-olive btn-xs">订单</button>
                    <button type="button" class="btn bg-olive btn-xs">详情</button>
                    <button type="button" class="btn bg-olive btn-xs">编辑</button>
                </td>
            </tr>
        </c:forEach>

        </tbody>
        <!--
    <tfoot>
    <tr>
    <th>Rendering engine</th>
    <th>Browser</th>
    <th>Platform(s)</th>
    <th>Engine version</th>
    <th>CSS grade</th>
    </tr>
    </tfoot>-->
    </table>
    <!--数据列表/-->

    <!--工具栏-->
    <div class="pull-left">
        <div class="form-group form-inline">
            <div class="btn-group">
                <button type="button" class="btn btn-default" title="新建"><i
                        class="fa fa-file-o"></i> 新建
                </button>
                <button type="button" class="btn btn-default" title="删除"><i
                        class="fa fa-trash-o"></i> 删除
                </button>
                <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i>
                    开启
                </button>
                <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i>
                    屏蔽
                </button>
                <button type="button" class="btn btn-default" title="刷新"><i
                        class="fa fa-refresh"></i> 刷新
                </button>
            </div>
        </div>
    </div>
    <div class="box-tools pull-right">
        <div class="has-feedback">
            <input type="text" class="form-control input-sm" placeholder="搜索">
            <span class="glyphicon glyphicon-search form-control-feedback"></span>
        </div>
    </div>
    <!--工具栏/-->

</div>
<!-- 数据表格 /-->

</body>
</html>

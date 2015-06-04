<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<script src="js/jquery-easyui-1.2.3/jquery-1.4.4.min.js" type="text/javascript"></script>
<script src="js/jquery-easyui-1.2.3/jquery.easyui.min.js" type="text/javascript"></script> 
<link href="js/jquery-easyui-1.2.3/themes/default/easyui.css" rel="stylesheet" type="text/css" /> 
<link href="js/jquery-easyui-1.2.3/themes/icon.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
<table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:250px"
            url="get_users.php"
            toolbar="#toolbar" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
        	<c:forEach items="${userList}" var="user">
            <tr>
                <th field="firstname" width="50">${user.name }</th>
                <th field="lastname" width="50">${user.name }</th>
                <th field="phone" width="50">${user.name }</th>
                <th field="email" width="50">${user.name }</th>
            </tr>
            </c:forEach>
        </thead>
    </table>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'IdcardList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
             <form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
					查询条件：
					<table width="100%" border=1>
							<tr>
									<td><input type="submit" value="查询"/></td>
									<td>${pageContext.request.contextPath }</td>
							</tr>
					</table>
					身份证信息列表：
					<table width="100%" border=1>
							<tr>
							        <td>id</td>
									<td>身份证</td>
									<td>身份证图片</td>
									<td>操作</td>
							</tr>
							<c:forEach items="${idcardList}" var="item"><!-- 遍历idcardList集合，然后一个一个给item，item就 相当于是Idcard-->
									<tr>
									    <td>${item.id }</td>
										<td>${item.idcardcode }</td>
										<td>${item.pic }</td>
										<td><a href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a></td>
									</tr>
							</c:forEach>
					</table>
			</form>
  </body>
</html>

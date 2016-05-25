<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<div id="msgFrompPush">
		<script type="text/javascript" src="<c:url value='assets/js/jquery-1.12.3.js' />"></script>
		<script type="text/javascript">
			// EventSource只对新式的浏览器支持，EventSource是客户端监听
			if(!!window.EventSource) {
				console.log("支持的浏览器") ;
				var source = new EventSource('push') ;
				s = '' ;
				source.addEventListener('message', function(e){
					console.log("建立连接") ;
					s+=e.data+'<br/>' ;
					$("#msgFrompPush").html(s) ;
				}) ;
				
				// 添加SSE客户端监听，再次获得服务端推送的消息
				source.addEventListener('open' ,function(e){
					console.log("链接打开。") ;
				}, false) ;
				
				source.addEventListener('error', function(e){
					if(e.readyState == EventSource.CLOSED) {
						console.log("连接关闭。") ;
					} else {
						console.log("连接开启。") ;
						console.log(e.readyState) ;
					}
				}, false) ;
			} else {
				console.log("你的浏览器不支持SSE。") ;
			}
		</script>
	</div>
</body>
</html>
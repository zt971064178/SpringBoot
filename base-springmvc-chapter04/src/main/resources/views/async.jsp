<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deffer</title>
</head>
<body>
		<h3>进入deffer页面</h3>
		<script type="text/javascript" src="assets/js/jquery-1.12.3.js"></script>
		<script type="text/javascript">
			deferred() ;
			
			// Ajax请求  兼容
			function deferred() {
				$.get("defer", function(data){
					// 控制台输出服务端发送的数据
					console.log(data) ;
					// 重复请求
					deferred() ;
				}) ;
			}
		</script>
</body>
</html>
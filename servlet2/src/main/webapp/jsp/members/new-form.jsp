<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
저장을 누르면 우리가 저장로직을 만들 save.jsp로 아래 값들을 같이 보내는 겁니다 
이거 실행해보려면, 우선 기본적으로 webapp 밑에 있는건 경로로 호출할 수 있음
-->

<form action="/jsp/members/save.jsp" method="post">
	username: <input type="text" name="username" /> 
	age: <input type="text" name="age" /> 
	<button type="submit">전송</button>
</form>

</body>
</html>
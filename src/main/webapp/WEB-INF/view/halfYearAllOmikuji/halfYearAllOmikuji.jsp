<%@page import="training6.omikuji.Omikuji"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@page import="training6.entity.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力された誕生日の過去半年の結果</title>
</head>
<body> 
	<p>
		<font color="#ba55d3">最初に入力された誕生日の過去半年の結果はこちらです</font>
	</p>
	<table border="1">

		<tr>
			<th>占い日付</th>
			<th>運勢</th>
			<th>願い事</th>
			<th>商い</th>
			<th>学問</th>
		</tr>
		<tr>
		<c:forEach var="result" items="${result}">
			<td><c:out value="${result.fortuneDate}" /></td>
			<td><c:out value="${result.unsei}" /></td>
			<td><c:out value="${result.negaigoto}" /></td>
			<td><c:out value="${result.akinai}" /></td>
			<td><c:out value="${result.gakumon}" /></td>
		</tr>
		</c:forEach>
	</table>
	<s:link href="/result/">誕生日入力画面へ</s:link>
</body>
</html>
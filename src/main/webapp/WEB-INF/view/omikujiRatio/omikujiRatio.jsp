<%@page import="training6.omikuji.Omikuji"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@page import="training6.dto.SearchRatioDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>全体の過去半年と本日の占い結果の割合表示画面</title>
</head>
<body>
	<p>
	<font color="#4169e1">全体の過去半年と本日の占い結果の割合はこちらです</font>
	</p>
	<table>
		<tr>
			<th>運勢名</th>
			<th>割合</th>
		</tr>
		<tr>
			<c:forEach var="ratio" items="${Ratio}">
				<td><c:out value="${ratio.unsei}" /></td>
				<td><c:out value="${ratio.unseiNameRatio}" /></td>
		</tr>
		</c:forEach>
	</table>
	<s:link href="/result/">誕生日入力画面へ</s:link>
</body>
</html>
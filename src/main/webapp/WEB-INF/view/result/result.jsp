
<%@page import="training6.omikuji.Omikuji"%>
<%@ page pageEncoding="UTF-8"%>

<%
//リクエストスコープから値を取得
training6.omikuji.Omikuji omikuji = (training6.omikuji.Omikuji) request.getAttribute("omikuji");
%>
<html>
<head>
<title>結果画面</title>
</head>
<body>
	<html:errors />
	<!-- おみくじを引いた結果 -->
	<table border="1">
		<tr>
			<th colspan="2">今日の運勢は<font color="#ffd700"><%=omikuji.getUnsei()%></font>です
			</th>
		</tr>
		<tr>
			<td>願い事</td>
			<td><%=omikuji.getNegaigoto()%></td>
		</tr>
		<tr>
			<td>商い</td>
			<td><%=omikuji.getAkinai()%></td>
		</tr>
		<tr>
			<td>学問</td>
			<td><%=omikuji.getGakumon()%></td>
		</tr>
	</table>

<!-- 画面遷移 -->
	<s:link href="/result/">誕生日入力に戻る</s:link>
	<s:link href="/halfYearAllOmikuji/">入力された誕生日の過去半年の結果へ</s:link>
	<s:link href="/omikujiRatio/">全体の過去半年と本日の占い結果の割合画面へ</s:link>
</body>
</html>
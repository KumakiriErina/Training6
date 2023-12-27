<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<title>誕生日入力画面</title>
</head>
<body>
<html:errors />
<s:form method="post">
	誕生日を入力してください（例:20150809）：
	<html:text property= "birthday" />
	<s:submit property= "result" value="送信" />
</s:form>
</body>
</html>
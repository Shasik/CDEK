<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Добавление записи в БД</title>
</head>
<body style="width: 800px; margin: 20px auto;">
<h3 style="margin: 10px auto">
    Введите строку для добавления в БД
</h3>

<form name="name" action="${pageContext.request.contextPath}/AddGist" method="post">
    <label>
        <input type="text" name="name" style="width: 80%;">
        <button type="submit" style="width: 18%">Добавить</button>
    </label>
</form>

</body>
</html>

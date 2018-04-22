<%@ page import="servlet.AddGist" %>
<%--
  Created by IntelliJ IDEA.
  User: dmitr
  Date: 14.04.2018
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Добавление выполнено</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<h1>Данные добавлены.</h1>
Строка с name = <strong>"<%=(String) session.getAttribute("name")%>"</strong> добавлена в БД

<ul style="list-style: none">
    <li><a href="view.jsp">Посмотреть все записи</a></li>
    <li><a href="create.jsp">Добавить ещё запись</a></li>
</ul>

</body>
</html>

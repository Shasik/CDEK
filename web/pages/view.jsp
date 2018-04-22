<%@ page import="bean.Gist" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="gistList" class="bean.GistList" scope="application"/>
<html>
<head>
    <title>Вывод списка значений из БД</title>
</head>
<body style="width: 800px; margin: 20px auto">


<a href="../index.jsp">Вернуться на стартовую страницу</a>

<form action="${pageContext.request.contextPath}/search" style="width: 80%; margin: 10px auto" method="get">
    <label>
        <input type="search" name="search_string" style="width: 80%">
        <input type="submit" value="Search" style="width: 18%;">
    </label>
</form>

        <%
            ArrayList<Gist> gists = null;

            if (session.getAttribute("search_string") != null) {
                String searchStr = (String) session.getAttribute("search_string");
                session.setAttribute("search_string", null);
                gists = gistList.getGistListBySearch(searchStr);
            } else {
                gists = gistList.getGistList();
            }
        %>

<table width="100%" border="1">

        <%
            for (Gist gist : gists) {
        %>
        <tr>
            <td width="20%" style="text-align: center"><%=gist.getId()%></td>
            <td width="80%"><%=gist.getName()%></td>
        </tr>
        <%
            }
        %>
</table>
</body>
</html>

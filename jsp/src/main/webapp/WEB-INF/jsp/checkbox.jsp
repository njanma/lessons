<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/language" method="post">
        <%--<select name="lang">--%>
            <%--<option value="J">Java</option>--%>
            <%--<option value="C">C++</option>--%>
            <%--<option value="R">Ruby</option>--%>
        <%--</select>--%>

            <%--<input type="checkbox" name="lang" value="J"> Java <br>--%>
            <%--<input type="checkbox" name="lang" value="C"> C++ <br>--%>
            <%--<input type="checkbox" name="lang" value="R"> Ruby <br>--%>

            <input type="radio" name="lang" value="J" checked> Java <br>
            <input type="radio" name="lang" value="C"> C++ <br>
            <input type="radio" name="lang" value="R"> Ruby <br>

        <input type="submit" value="SEND">
    </form>
</body>
</html>

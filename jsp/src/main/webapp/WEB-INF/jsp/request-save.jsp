<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/request-save" method="post">
        <label>Description:
            <input type="text" name="description">
        </label><br>
        <label>Date:
            <input type="date" name="date">
        </label><br>
        <input type="submit" value="SAVE">
    </form>
</body>
</html>

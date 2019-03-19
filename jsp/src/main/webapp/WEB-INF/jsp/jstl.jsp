<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach var="request" items="${requestScope.requests}">
        <a href="${pageContext.request.contextPath}/request-save?id=${request.id}&lang=ru"></a>
        <c:if test="${fn:length(request.description) > 8}">
            <p>${request.date}. ${request.description}</p>
        </c:if>
    </c:forEach>


    <%--<c:if test="${requestScope.request1.description eq 'test'}">--%>
        <%--<p>If ok request1!</p>--%>
    <%--</c:if>--%>
    <%--<c:if test="${requestScope.request2.description eq 'test'}">--%>
        <%--<p>If ok request2!</p>--%>
    <%--</c:if>--%>
</body>
</html>

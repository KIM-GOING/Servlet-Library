<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>도서 목록</title>
</head>
<body>
<h2>현재 도서 목록 (JSTL 버전)</h2>

<table border="1">
    <tr>
        <th>도서번호</th>
        <th>도서이름</th>
        <th>출판사</th>
        <th>가격</th>
    </tr>

    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.bookNum}</td>
            <td>${book.bookName}</td>
            <td>${book.publisher}</td>
            <td>${book.price}원</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

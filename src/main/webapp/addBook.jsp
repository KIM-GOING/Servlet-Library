<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>신규 도서 등록</title>
    <style>
        h1 { text-align: center; }
        form { text-align: center; }
    </style>
</head>
<body>
    <h1>신규 도서 등록</h1>
    <form action="addBook" method="post">
        <label for="id">도서번호:</label>
        <input type="number" id="id" name="id" required><br><br>

        <label for="title">도서이름:</label>
        <input type="text" id="title" name="title" required><br><br>

        <label for="publisher">출판사:</label>
        <input type="text" id="publisher" name="publisher" required><br><br>

        <label for="price">가격:</label>
        <input type="number" id="price" name="price" required><br><br>

        <button type="submit">제출</button>
    </form>
</body>
</html>

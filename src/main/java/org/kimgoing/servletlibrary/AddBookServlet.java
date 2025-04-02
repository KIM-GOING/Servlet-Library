package org.kimgoing.servletlibrary;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AddBookServlet", value = "/addBook")
public class AddBookServlet extends HttpServlet {

    private final BookService bookService = new BookService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        try {
            int bookNum = Integer.parseInt(request.getParameter("bookNum"));
            String bookName = request.getParameter("bookName");
            String publisher = request.getParameter("publisher");
            int price = Integer.parseInt(request.getParameter("price"));

            Book newBook = new Book(bookNum, bookName, publisher, price);
            bookService.addBook(newBook);
        } catch (Exception e) {
            response.getWriter().println("<h3>Wrong Input:" + e.getMessage() + "</h3>");
            return;
        }

        List<Book> bookList = bookService.getAllBooks(); // ⭐ 서비스 계층을 통해 조회

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>현재 도서 목록</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>도서번호</th><th>도서이름</th><th>출판사</th><th>가격</th></tr>");

        for (Book b : bookList) {
            out.println("<tr>");
            out.println("<td>" + b.getBookNum() + "</td>");
            out.println("<td>" + b.getBookName() + "</td>");
            out.println("<td>" + b.getPublisher() + "</td>");
            out.println("<td>" + b.getPrice() + "원</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}

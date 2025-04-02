package org.kimgoing.servletlibrary;

import java.util.List;

public class BookService {

    // 도서 등록 처리 (검증, 로직 포함 가능)
    public void addBook(Book book) {
        // 여기서 유효성 검사, 중복 체크 같은 로직도 가능
        BookRepository.getBooks().add(book);
    }

    // 전체 도서 목록 반환
    public List<Book> getAllBooks() {
        return BookRepository.getBooks();
    }
}

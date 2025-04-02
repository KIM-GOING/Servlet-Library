package org.kimgoing.servletlibrary;

import java.util.List;
import java.util.ArrayList;

public class BookRepository {

    // 기본값 넣을 공간
    private static final List<Book> books = new ArrayList<>();

    // 기본값 초기화
    static {
        books.add(new Book(1, "축구의 역사", "굿스포츠", 7000));
        books.add(new Book(2, "축구 아는 여자", "나무수", 13000));
        books.add(new Book(3, "축구의 이해", "대한미디어", 22000));
        books.add(new Book(4, "골프 바이블", "대한미디어", 35000));
        books.add(new Book(5, "피겨 교본", "굿스포츠", 8000));
    }

}

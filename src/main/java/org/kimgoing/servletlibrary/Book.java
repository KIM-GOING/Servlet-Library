package org.kimgoing.servletlibrary;

public class Book {

    // 멤버변수
    private int bookNum;
    private String bookName;
    private String publisher;
    private int price;

    // 생성자
    public Book(int bookNum, String bookName, String publisher, int price) {
        setBookNum(bookNum);
        setBookName(bookName);
        setPublisher(publisher);
        setPrice(price);
    }

    // bookNum의 getter, setter
    public int getBookNum() {
        return bookNum;
    }
    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    // bookName의 getter, setter
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        if (bookName == null || bookName.isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty");
        }
        this.bookName = bookName;
    }

    // publisher의 getter, setter
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be null or empty");
        }
        this.publisher = publisher;
    }

    // price의 getter, setter
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
}

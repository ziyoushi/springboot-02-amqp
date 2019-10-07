package com.atguigu.amqp.bean;

/**
 * @author changchen
 * @create 2019-10-07 20:50
 */
public class Book {
    private String bookName;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Book() {}
}

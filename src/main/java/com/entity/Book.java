package com.entity;

import java.io.Serializable;

/**
 * Created by hejiecheng on 17/3/9.
 */
public class Book implements Serializable{
    private static final long serialVersionUID = -3908998634603327332L;

    private long id ;
    private String isbn ;
    private String title ;
    private Category category ;
    private String author ;

    public Book() {
    }

    public Book(long id, String isbn, String title, Category category, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

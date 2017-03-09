package com.service;

import com.entity.Book;
import com.entity.Category;

import java.util.List;

/**
 * Created by hejiecheng on 17/3/9.
 */
public interface BookService {

    List<Category> getAllCategory() ;
    Category getCategory(int id) ;
    List<Book> getAllBook() ;
    Book save(Book book) ;
    Book update(Book book) ;
    Book get(long id);
    long getNextId() ;
}

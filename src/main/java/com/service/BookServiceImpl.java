package com.service;

import com.entity.Book;
import com.entity.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hejiecheng on 17/3/9.
 */
@Service
public class BookServiceImpl implements BookService {

    private List<Category> categories ;
    private List<Book> books ;

    public BookServiceImpl() {

        //添加出版社
        categories = new ArrayList<Category>() ;
        Category category1 = new Category(1 , "Computing") ;
        Category category2 = new Category(2 , "Travel") ;
        Category category3 = new Category(3 , "Health") ;
        categories.add(category1) ;
        categories.add(category2) ;
        categories.add(category3) ;

        //添加书本
        books = new ArrayList<Book>() ;
        books.add(new Book(1L , "64987654" , "book1" , category1 , "HDU")) ;
        books.add(new Book(2L , "64987655" , "book2" , category1 , "ZAFU")) ;
    }

    public List<Category> getAllCategory() {
        return categories;
    }

    public Category getCategory(int id) {
        for (Category category : categories){
            if(category.getId() == id){
                return category ;
            }
        }
        return null ;
    }

    public List<Book> getAllBook() {
        return books;
    }

    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book) ;
        return book ;
    }

    public Book update(Book book) {
        int bookCount = books.size() ;
        for(int i = 0 ; i < bookCount ; ++ i){
            Book saveBook = books.get(i) ;
            if(saveBook.getId() == book.getId()){
                books.set(i , book) ;
                return book ;
            }
        }
        return book ;
    }

    public Book get(long id) {
        for(Book book : books){
            if(book.getId() == id){
                return book ;
            }
        }
        return null ;
    }

    public long getNextId() {
        long id = 0L ;
        for(Book book : books){
            long bookId = book.getId() ;
            if(bookId > id){
                id = bookId ;
            }
        }
        return id + 1 ;
    }
}

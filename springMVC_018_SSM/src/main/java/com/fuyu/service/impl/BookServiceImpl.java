package com.fuyu.service.impl;

import com.fuyu.BookService;
import com.fuyu.dao.BookDao;
import com.fuyu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);

    }

    public List<Book> getAll() {
        return  bookDao.getAll();

    }
}

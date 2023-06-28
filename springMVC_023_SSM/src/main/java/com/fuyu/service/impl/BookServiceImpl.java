package com.fuyu.service.impl;
import com.fuyu.BookService;
import com.fuyu.controller.Code;
import com.fuyu.dao.BookDao;
import com.fuyu.domain.Book;
import com.fuyu.exception.BusinessException;
import com.fuyu.exception.SystemException;
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
        if(id==1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐心！");
        }
       //将可能出现的异常进行包装，转换成自定义异常
        try{
            int i=1/0;
        }catch(Exception e){
            throw new SystemException(Code.SYSTEM_ERR,"服务器访问超时，请重试",e);
        }

        return bookDao.getById(id);

    }

    public List<Book> getAll() {
        return  bookDao.getAll();

    }
}

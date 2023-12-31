package com.fuyu.controller;
import com.fuyu.BookService;
import com.fuyu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag,flag?Code.SAVE_OK:Code.SAVE_ERR);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag,flag?Code.UPDATE_OK:Code.DELETE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return  new Result(flag,flag?Code.DELETE_OK:Code.DELETE_ERR);

    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable  Integer id) {
        int  i=10/0;
        Book book = bookService.getById(id);
        Integer code= book!=null?Code.GET_OK:Code.GET_ERR;
        String msg=book!=null?"":"数据查询失败！";

        return new Result(book,code,msg);

    }

    @GetMapping
    public Result getAll() {
        List<Book> all = bookService.getAll();
        Integer code= all!=null?Code.GET_OK:Code.GET_ERR;
        String msg=all!=null?"":"数据查询失败！";
        return new Result(all,code,msg);
    }
}

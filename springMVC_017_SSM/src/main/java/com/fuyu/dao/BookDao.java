package com.fuyu.dao;

import com.fuyu.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {

    //@Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    public void save(@Param("book") Book book);
    @Update("update tbl_book set type = #{type},name = #{name},description = #{description} where id = #{id}")
    public void update(Book book);
    @Delete("delete from tbl_book where id=#{id}")
    public void delete(Integer id);
    @Select("select *from tbl_book where id=#{id}")
    public Book getById(Integer id);
    @Select("select *from tbl_book")
    public List<Book> getAll();
}

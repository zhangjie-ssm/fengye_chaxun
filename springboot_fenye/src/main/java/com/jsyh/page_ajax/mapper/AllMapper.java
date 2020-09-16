package com.jsyh.page_ajax.mapper;

import com.jsyh.page_ajax.entity.Page;
import com.jsyh.page_ajax.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper

public interface AllMapper {
    //查所有
     @Select("SELECT * FROM product")
    List<Product> getAll();

     //查表中的总条数
    @Select("select count(1) from product")
    int getCount();

    //数据库limit 分页查询，原生的写法
    @Select("SELECT * FROM product limit #{startRow},#{pageSize}")
    List<Map<String,Object>> getlimit(@Param("startRow") Integer startRow , @Param("pageSize")Integer pageSize);

}

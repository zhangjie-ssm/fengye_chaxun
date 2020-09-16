package com.jsyh.page_ajax.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsyh.page_ajax.entity.Page;
import com.jsyh.page_ajax.entity.Product;

import java.util.List;
import java.util.Map;

public interface AllService {
    //查询的所有信息
    List<Product> getAll();

    //总条数
    int getCount();

    //分页查询插件
    PageInfo<Product> getAllPage(Integer pageNum);

    //分页查询原生limit
    List<Map<String,Object>> getlimit(Integer startRow , Integer pageSize);
}

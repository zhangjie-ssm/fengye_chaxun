package com.jsyh.page_ajax.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsyh.page_ajax.entity.Page;
import com.jsyh.page_ajax.entity.Product;
import com.jsyh.page_ajax.mapper.AllMapper;
import com.jsyh.page_ajax.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AllServiceImpl implements AllService {

    @Autowired
    private AllMapper mapper;

    @Override
    public List<Product> getAll() {
        return mapper.getAll();
    }

    @Override
    public int getCount() {
        return mapper.getCount();
    }

    @Override
    public List<Map<String,Object>> getlimit(Integer pageNo, Integer pageSize) {
        int count = mapper.getCount();          //获取总条数
        Page page = new Page();
        page.setStartRow(pageNo,pageSize);
        int startRow = page.getStartRow();       //起始行位置
        page.setTotalPageCount(count,pageSize);
        int totalPageCount = page.getTotalPageCount();      //总页数
        List<Map<String,Object>> getlimt = mapper.getlimit(startRow, pageSize);        //查询的每页显示内容
        Map map = new HashMap<>();
        map.put("总页数",totalPageCount);
        map.put("获取总条数",count);
        map.put("起始行位置",startRow);
        map.put("data",getlimt);
        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        return list;
    }

    @Override
    //   下面这个是用的分页插件
    public PageInfo<Product> getAllPage(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        List<Product> list = mapper.getAll();
        PageInfo<Product> productPageInfo = new PageInfo<>(list);
        return productPageInfo;
    }




}

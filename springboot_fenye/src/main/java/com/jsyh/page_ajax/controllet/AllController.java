package com.jsyh.page_ajax.controllet;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsyh.page_ajax.entity.Page;
import com.jsyh.page_ajax.entity.Product;
import com.jsyh.page_ajax.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AllController {
    @Autowired
    private AllService service;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Product> getAll() {

        return service.getAll();
    }

    //下面这个是使用的分页插件
    @RequestMapping("/getAllPage")
    @ResponseBody
    public PageInfo<Product> getAllPage(@RequestParam(defaultValue = "1") Integer pageNum) {
        return service.getAllPage(pageNum);
    }

    //使用的原生的分页写法
    @RequestMapping("/getlimit")
    @ResponseBody
    public List<Map<String,Object>> getlimit(@RequestParam(defaultValue = "1") Integer pageNo,@RequestParam(defaultValue = "5") Integer pageSize) {
        System.out.println("进入程序");
        List<Map<String, Object>> getlimit = service.getlimit(pageNo, pageSize);
        return getlimit;
    }

}

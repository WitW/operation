package com.springbootweb.operation.controller;


import com.springbootweb.operation.pojo.Product;
import com.springbootweb.operation.responsitory.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProController {

    @Autowired
    private ProductResponsitory productResponsitory;

    @ResponseBody
    @RequestMapping("hello")
    public List<Product> allProducts(){
        List<Product> list =  productResponsitory.findAll();
        return list;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}

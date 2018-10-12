package com.springbootweb.operation.controller;

import com.springbootweb.operation.pojo.Product;
import com.springbootweb.operation.responsitory.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductResponsitory productResponsitory;

    @RequestMapping(value = "/products")
    public String productList(Model model){
        List<Product> list =  productResponsitory.findAll();
        model.addAttribute("list", list);
        return "allProduct";
    }

    @RequestMapping(value = "/addProduct")
    public String addProduct(@RequestParam("name") String name,
                             @RequestParam("price") String price, @RequestParam("amount") Integer amount){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setAmount(amount);
        productResponsitory.save(product);
        return "redirect:/products";

    }

    @RequestMapping(value = "/toAddProduct")
    public String toAddProduct(){
        return "addProduct";
    }

    @RequestMapping(value = "/toEditProduct")
    public String toEditProduct(@RequestParam("name")String name,@RequestParam("id")Integer id,
                                @RequestParam("price")String price, @RequestParam("amount")Integer amount,
                                Model model){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setAmount(amount);
        model.addAttribute("product", product);
        return "editProduct";
    }

    @RequestMapping(value = "/editProduct")
    public String editProduct(@RequestParam("name")String name, @RequestParam("id")Integer id,
                              @RequestParam("price")String price, @RequestParam("amount")Integer amount){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
        productResponsitory.save(product);
        return "redirect:/products";
    }



    @RequestMapping(value = "/deleteProduct")
    public String deleteProduct(@RequestParam("id") Integer id){
        productResponsitory.deleteById(id);
        return "redirect:/products";
    }
}

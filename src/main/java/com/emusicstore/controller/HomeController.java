package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by anuj on 12/19/2016.
 */
@Controller
public class HomeController {


    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home(){

        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productDao.getAllProduct();
        model.addAttribute("products", products);

        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException{

        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}

package com.saasapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunilp
 */
@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @RequestMapping(value = "/")
    public List<String> getAllProducts() {
        List<String> products = new ArrayList<String>();
        products.add("one");
        products.add("two");
        products.add("three");
        return products;
    }

}

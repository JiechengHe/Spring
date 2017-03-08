package com.controller;

import com.entity.Product;
import com.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hejiecheng on 17/3/8.
 */

@Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class) ;

    @RequestMapping(value = "/product_input")
    public  String inputProduct(){
        logger.info("new inputProduct called");
        return "ProductForm" ;
    }

    @RequestMapping(value = "/product_save")
    public String saveProduct(ProductForm productForm , Model model){
        logger.info("new saveProduct called");
        Product product = new Product() ;
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try{
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

        model.addAttribute("product" , product) ;
        return "ProductDetails" ;
    }

}

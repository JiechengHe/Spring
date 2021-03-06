package com.controller;

import com.entity.Product;
import com.form.ProductForm;
import com.service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by hejiecheng on 17/3/8.
 */

@Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class) ;

    @Autowired
    private ProductService productService ;

    @RequestMapping(value = "/product_input")
    public  String inputProduct(){
        logger.info("new inputProduct called");
        return "ProductForm" ;
    }

    @RequestMapping(value = "/product_save" , method = {RequestMethod.POST})
    public String saveProduct(ProductForm productForm , RedirectAttributes redirectAttributes){
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

        //add product
        Product saveProduct = productService.add(product) ;
        redirectAttributes.addFlashAttribute("message","The product was successfully added") ;
        return "redirect:/product_view/" + saveProduct.getId() ;
    }

    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id , Model model){
        Product product = productService.get(id) ;
        model.addAttribute("product" , product) ;
        return "ProductView" ;
    }

    /**
     * 还有一个@ModelAttribute注解
     * 如果注解在请求函数的中，注解一个参数时，则在调用该请求的时候，系统自动会将注解的参数加入到Model中，注解中如果加了key值则以该key值获取，如果没有则以类名
     * 如果注解在方法中，则在该控制器的所有请求启动前，均会先调用@ModelAttribute注解的方法，并将返回对象加入到Model中
     */

}

package com.service;

import com.entity.Product;

/**
 * Created by hejiecheng on 17/3/8.
 */
public interface ProductService {
    Product add(Product product) ;
    Product get(long id) ;
}

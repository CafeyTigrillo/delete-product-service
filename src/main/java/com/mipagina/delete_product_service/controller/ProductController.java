package com.mipagina.delete_product_service.controller;

import com.mipagina.delete_product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @DeleteMapping("/products/{id_product}")
    public void deleteProduct(@PathVariable Long id_product){
        productService.deleteProduct(id_product);
    }
}

package com.mipagina.delete_product_service.service;

import com.mipagina.delete_product_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public void deleteProduct(Long id_product) {
        productRepository.deleteById(id_product);
    }
}

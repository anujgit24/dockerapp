package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by anuj on 12/28/2016.
 */
public interface ProductDao {

     void addProduct(Product product);

     Product getProductById(String id);

     List<Product> getAllProduct();

     void deleteProduct(String productId);


}

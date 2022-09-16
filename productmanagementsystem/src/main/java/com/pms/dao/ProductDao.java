package com.pms.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDao {
	public String createProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Integer productId);
	public String deleteByProductId(Integer productId);
	public String updateProductById(Integer productId);
}

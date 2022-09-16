package com.pms.bo;

import java.util.List;

import com.pms.model.Product;

public interface ProductBo {
	public String createProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Integer productId);
	public String deleteByProductId(Integer productId);
	public String updateProductById(Integer productId);
}

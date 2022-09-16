package com.pms.bo;

import java.util.List;

import com.pms.dao.ProductDao;
import com.pms.dao.ProductDaoImplementation;
import com.pms.model.Product;

public class ProductBoImplementation implements ProductBo{

	@Override
	public String createProduct(Product product) {
		ProductDao pdao=new ProductDaoImplementation();
		
		return pdao.createProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer productId) {
		// TODO Auto-generated method stub
		ProductDao pdao=new ProductDaoImplementation();
		
		return pdao.getProductById(productId);
	}

	@Override
	public String deleteByProductId(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProductById(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}

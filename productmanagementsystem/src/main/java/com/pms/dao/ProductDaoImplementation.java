package com.pms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.pms.controller.CreateProductServlet;
import com.pms.model.Product;

public class ProductDaoImplementation implements ProductDao{
	
	@Override
	public String createProduct(Product product) {
		String result = null;
		String url = "jdbc:derby:C:/Users/Rajesh/pms";
		String query = "INSERT INTO product VALUES(?,?,?,?)";
		Connection con=null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection(url);
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setInt(3, product.getProductPrice());
			pstmt.setDate(4, new Date(product.getManufactured_Date().getTime()));
			int status = pstmt.executeUpdate();
			if(status!=0) {
				result = "Product added successfully";
			}else {
				result = "Product is not added successfully";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return result;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer productId) {
		String url = "jdbc:derby:C:/Users/Rajesh/pms";
		Connection con = null;
		PreparedStatement pstmt=null;
		String query = "SELECT * FROM product WHERE pid=?";
		Product foundProduct=null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, productId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				foundProduct=new Product();
				foundProduct.setProductId(rs.getInt(1));
				foundProduct.setProductName(rs.getString(2));
				foundProduct.setProductPrice(rs.getInt(3));
				foundProduct.setManufactured_Date(rs.getDate(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return foundProduct;
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

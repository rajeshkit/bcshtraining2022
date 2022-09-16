package com.pms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.bo.ProductBo;
import com.pms.bo.ProductBoImplementation;
import com.pms.model.Product;


@WebServlet("/productsearch")
public class ProductSearchServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String pId = req.getParameter("productid");
		ProductBo pbo=new ProductBoImplementation();
		Product pro = pbo.getProductById(Integer.parseInt(pId));
		RequestDispatcher rd= req.getRequestDispatcher("showproduct.jsp");
		req.setAttribute("myProduct", pro);
		rd.forward(req, res);
	}
}

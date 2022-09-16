package com.pms.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

@WebServlet("/registration")
public class CreateProductServlet extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String proId = req.getParameter("pid");
		String proName = req.getParameter("pname");
		String proCost = req.getParameter("pprice");
		String proDom = req.getParameter("pdom");
		System.out.println(proCost+" "+proId+" "+proName+" "+proDom);
		Product p=new Product();
		p.setProductId(Integer.parseInt(proCost));
		p.setProductName(proName);
		p.setProductPrice(Integer.parseInt(proCost));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(proDom);
			p.setManufactured_Date(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProductBo pbo = new ProductBoImplementation();
		String status=pbo.createProduct(p);
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
		req.setAttribute("message",status);
		rd.forward(req, res);
				
		
	}
}

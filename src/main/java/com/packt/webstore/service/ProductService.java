package com.packt.webstore.service;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductService {
	
	public void updateAllStock();
	public List<Product> getAllProducts();
	public List<Product> getProductsByCategori(String categori);
	public List <Product> getProductsByFilter(Map<String,List<String>> filterParam);
	public Product getProductsById(String categori);
	public List<Product> filterProduct(String categori,Map<String,String> lowAndHidPrice, String brand);
	public void addProduct(Product product);

}

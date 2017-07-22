package com.packt.webstore.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void updateAllStock() {
		
		List<Product> allProducts = productRepository.getAllProducts();
	     
	      for(Product product : allProducts) {
	         if(product.getUnitsInStock()<500)
	            productRepository.updateStock(product.getProductId(), product.getUnitsInStock()+1000);
	      }
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByCategori(String categori) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByCategori(categori);
	}

	@Override
	public List<Product> getProductsByFilter(Map<String, List<String>> filterParam) {
		return productRepository.getProductsByFilter(filterParam);

	}

	@Override
	public Product getProductsById(String id) {
		return productRepository.getProductsById(id);
	}

	@Override
	public List<Product> filterProduct(String catogori, Map<String, String> lowAndHidPrice, String brand) {
		// TODO Auto-generated method stub
		return productRepository.filterProduct(catogori,lowAndHidPrice, brand);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

}

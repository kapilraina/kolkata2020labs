package com.ms.boot.Productms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.boot.Productms.model.Product;
import com.ms.boot.Productms.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo;
	
	public Product getProduct(Integer id)
	{
		Optional<Product> oProduct = prepo.findById(id);
		if(oProduct.isPresent())
			return oProduct.get();
		else
			return null;
			
	}
}

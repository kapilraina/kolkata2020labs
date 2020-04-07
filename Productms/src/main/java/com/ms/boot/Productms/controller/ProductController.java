package com.ms.boot.Productms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ms.boot.Productms.model.Product;
import com.ms.boot.Productms.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(path = "/v0/{id}",method = RequestMethod.GET)
	public ResponseEntity<Product> getProduct(@PathVariable int id) {

		Product p = productService.getProduct(id);
		if (p == null) {
			ResponseEntity<Product> response = new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
			return response;
		} else {
			ResponseEntity<Product> response = new ResponseEntity<Product>(p, HttpStatus.FOUND);
			return response;

		}
	}

}

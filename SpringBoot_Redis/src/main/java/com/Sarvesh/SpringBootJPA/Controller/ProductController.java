package com.Sarvesh.SpringBootJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sarvesh.SpringBootJPA.Entity.Product;
import com.Sarvesh.SpringBootJPA.Repository.ProductRepo;

@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	ProductRepo dao;
	
	@GetMapping("/getAll")
	public List<Object> getAll(){
		return dao.getAll();
	}
	
	@PostMapping("/add")
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}
	

}

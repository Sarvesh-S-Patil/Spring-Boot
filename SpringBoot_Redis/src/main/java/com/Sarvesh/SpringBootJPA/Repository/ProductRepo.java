package com.Sarvesh.SpringBootJPA.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.Sarvesh.SpringBootJPA.Entity.Product;

@Repository
public class ProductRepo {
	private static final String HASH_KEY = "Product";
	
	@Autowired
	RedisTemplate<String,Object> template;
	
	public Product save(Product product) {
		template.opsForHash().put(HASH_KEY, product.getId(), product);
		return product;
	}
	
	public List<Object> getAll(){
		return template.opsForHash().values(HASH_KEY);
	}
}

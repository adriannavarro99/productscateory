package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duder.app.models.Category;
import com.duder.app.models.Product;



@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
	
}
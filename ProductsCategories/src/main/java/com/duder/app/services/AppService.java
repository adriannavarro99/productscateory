package com.duder.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duder.app.models.*;


import com.duder.app.repositories.*;




@Service
public class AppService {
	
	private final ProductRepository pR;
	private final CategoryRepository cR;
	private final AssociationRepository cPR;
	
	public AppService(ProductRepository pR, CategoryRepository cR, AssociationRepository cPR) {
		
		this.pR = pR;
		this.cR = cR;
		this.cPR = cPR;
	}
	
	public Product addProduct(Product product) {
		return pR.save(product);
	}
	
	public Category addCategory(Category category) {
		return cR.save(category);
	}
	
	public Association joinCategoryToProduct(Association categoryProduct) {
		return cPR.save(categoryProduct);
	}
	
	public Product findProductById(Long id) {
		Optional<Product> check =  pR.findById(id);
		if (check.isPresent()) {
			return check.get();
		}
		else {
			return null;
		}
	}
	
	public List<Category> allCatergories(){
		return cR.findAll();
	}
	
	public List<Category> allExcludeCategories(Product product){
		return cR.findByProductsNotContains(product);
	}
	
	public List<Product> allExcludeProducts(Category category){
		return pR.findByCategoriesNotContains(category);
	}
	
	public Category findCategoryById(Long Id) {
		Optional<Category> check = cR.findById(Id);
		if(check.isPresent()) {
			return check.get();
		}
		else {
			return null;
		}
	}

}
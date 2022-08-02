package com.appchurras.appchurras.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appchurras.appchurras.entities.Category;
import com.appchurras.appchurras.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		
		return repository.findAll();
	}
}

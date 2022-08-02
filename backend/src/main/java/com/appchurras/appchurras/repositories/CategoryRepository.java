package com.appchurras.appchurras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appchurras.appchurras.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

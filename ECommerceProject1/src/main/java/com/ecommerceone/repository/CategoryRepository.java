package com.ecommerceone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceone.model.Category;

public interface CategoryRepository extends JpaRepository <Category, Integer> {

}

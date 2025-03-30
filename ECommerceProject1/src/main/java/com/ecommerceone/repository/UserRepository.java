package com.ecommerceone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceone.model.User;

public interface  UserRepository extends JpaRepository <User, Integer>{
//	Optional<User> findByEmail(String email);
}

package com.ecommerceone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerceone.global.GlobalData;
import com.ecommerceone.model.Role;
import com.ecommerceone.model.User;
import com.ecommerceone.repository.RoleRepository;
import com.ecommerceone.repository.UserRepository;

@Controller
public class LoginController {

@Autowired
UserRepository userRepository;

@Autowired
RoleRepository roleRepository;

@GetMapping("/login") 
public String login() {
	GlobalData.cart.clear();
	return "login";
}

@GetMapping("/register") 
public String registerGet() {	
	return "register";
}


@PostMapping("/register") 
public String registerPost(@ModelAttribute("user")User user) {
	String password = user.getPassword();
	user.setPassword(password);
	List<Role> roles = new ArrayList<>();
	roles.add(roleRepository.findById(2).get());
	user.setRoles(roles);
	userRepository.save(user);
	//request.login(user.getEmail(), password);
	return "redirect:/";
		
}
}

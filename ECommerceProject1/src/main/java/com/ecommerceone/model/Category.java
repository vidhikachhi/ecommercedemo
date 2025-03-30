package com.ecommerceone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Category_id")
private int id;
private String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
} 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Category(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Category() {
	
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + "]";
}

}

package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="my_boutique")
public class Boutique {
	
@Id
@Column(name="Id")
private int id;


@Column(name="Dress_Name")
private String name;


@Column(name="Color")
private String Color;

@Column(name="Price")
private int Price;

Boutique (){}



Boutique(int id,String name,String Color,int Price){
	super();
	this.id = id;
	this.name = name;
	this.Color = Color;
	this.Price = Price;
	
}

//getters setters

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



public String getColor() {
	return Color;
}



public void setColor(String color) {
	Color= color;
}



public int getPrice() {
	return Price;
}



public void setPrice(int price) {
	Price= price;
}


}

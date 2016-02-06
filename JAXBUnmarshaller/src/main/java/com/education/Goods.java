package com.education;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder = {"id","name","price","category","description"})
public class Goods {
 private Long id;
 private String name;
 private Integer price;
 private String category;
 private String description;
 
 public Goods(){
	 
 }
 
 public Goods(Long id,String name,Integer price,String category,String description){
	this.id=id;
	this.name=name;
	this.price=price;
	this.category=category;
	this.description=description;
 }
 
 @XmlAttribute(name="id")
 public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
 
 @XmlElement
 public String getName(){
	 return name;
 }
 
 public void setName(String name){
	 this.name=name;
 }
 
 
@XmlElement 
 public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
		this.price = price;
}


 @XmlElement
 public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

@XmlElement
 public String getDescription(){
	 return description;
 }
 
 public void setDescription(String description){
	 this.description=description;
 }
 
}

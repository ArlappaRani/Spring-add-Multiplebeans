package com.spring.create3objects.SpringProject2;

public class Laptop {
	
  int serialNo;
  String brand;
  float price;
public Laptop() {
	super();
	
	// TODO Auto-generated constructor stub
}
public Laptop(int serialNo, String brand, float price) {
	super();
	this.serialNo = serialNo;
	this.brand = brand;
	this.price = price;
	System.out.println("para constructor");
}
public int getSerialNo() {
	return serialNo;
}
public void setSerialNo(int serialNo) {
	this.serialNo = serialNo;
	System.out.println("setter methods");
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [serialNo=" + serialNo + ", brand=" + brand + ", price=" + price + "]";
}
  
  
	

}

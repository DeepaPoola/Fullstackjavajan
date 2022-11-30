package com.mystack.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product_image")
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private float price;
	private float qty;
	private String info;
	@Lob
	@Column(name="imagedata")
	private byte[] imageData;
	//generate setter and getter
	//constructor

	
	public Product(Integer id, String name, float price, float qty, String info,byte[] imageData) {
	
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.info = info;
		this.imageData=imageData;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData=imageData;
	}
	public Product() {}
}
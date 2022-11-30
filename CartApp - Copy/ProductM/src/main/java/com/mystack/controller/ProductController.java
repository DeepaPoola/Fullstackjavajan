package com.mystack.controller;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mystack.model.Product;
import com.mystack.service.ProductService;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
public class ProductController {
	
	@Autowired		
	private ProductService productService;
	
	//create API
	
	/*
	 URL: localhost:8080/products
	 Method:GET
	 Required Field:None 
	 */
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/upload/{id}")
	public void uploadImage(@RequestParam("productImage")MultipartFile file) throws IOException{
		productService.uploadImage(file);
	}
	@GetMapping("/download/{fileName}")
	public ResponseEntity<byte[]> downloadImage(@PathVariable String fileName) {
		byte[] image = productService.downloadImage(fileName);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(image);
	}
	
	
	/*
	 URL: localhost:8080/products
	 Method:POST
	 Required Field:id,name,price,qty,info
	 */
	@PostMapping("/product")
	public void add(@RequestBody Product product) {
		productService.save(product);
	}
	/*
	 URL: localhost:8080/product/1
	 Method:PUT
	 Required Field:id,name,price,qty,info
	 */
	
	@PutMapping("/product/{id}")
	public ResponseEntity<?>  update(@RequestBody Product product, @PathVariable Integer id) {
	try {
		productService.save(product);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
		
	}
	
	/*
	 URL: localhost:8080/product/1
	 Method:DELETE
	 Required Field:
	 */
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
			productService.deleteProduct(id);
	}
	
	/*
	 * URL: localhost:8080/product/1
	 * Method:PUT
	 * Required Fields:
	 */
	@GetMapping("/products/{id}")
	public Product updateProduct(@PathVariable Integer id) {
		return  productService.getProduct(id);
	}
}
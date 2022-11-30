package com.mystack.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mystack.model.ImageUtil;
import com.mystack.model.Product;
import com.mystack.repository.ProductRepository;

@Service
public class ProductService {

	//perform - crud operation
	@Autowired
	private ProductRepository productRepo;
	
	public Product uploadImage(MultipartFile file) throws IOException {
		Product pImage = new Product();
		pImage.setName(file.getOriginalFilename());
		
		pImage.setImageData(ImageUtil.compressImage(file.getBytes()));
		return productRepo.save(pImage);
	}
	
	public byte[] downloadImage(String fileName){
        Optional<Product> imageData = productRepo.findByName(fileName);
        return ImageUtil.decompressImage(imageData.get().getImageData());
    }
	
	//get all product 
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	//create product
	public void save(Product product) {
		productRepo.save(product);
	}
	//get single product
	public Product getProduct(Integer id) {
		return productRepo.findById(id).get();
	}
	//update product
	//delete product
	public void deleteProduct(Integer id) {
		productRepo.deleteById(id);
	}
}
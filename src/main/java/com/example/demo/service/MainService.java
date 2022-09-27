package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;

@Service
public class MainService {
	
	@Autowired
	ProductRepository productRepo;
	
	public void product() {
		for(Product product:productRepo.findAll()) {
			System.out.println("ID : " + product.getId());
			System.out.println("Name : " + product.getName());
			System.out.println("Price : " + product.getPrice());
			System.out.println("Quantity : " + product.getQuantity());
			System.out.println("Description : " + product.getDescription());
			System.out.println("Photo : " + product.getPhoto());
			System.out.println("Featured : " + product.isFeatured());
			System.out.println("===========================");
		}
	}
	public void findProduct()
	{
		Product product = productRepo.findById(5);
		System.out.println("ID : " + product.getId());
		System.out.println("Name : " + product.getName());
		System.out.println("Price : " + product.getPrice());
		System.out.println("Quantity : " + product.getQuantity());
		System.out.println("Description : " + product.getDescription());
		System.out.println("Photo : " + product.getPhoto());
		System.out.println("Featured : " + product.isFeatured());
		System.out.println("===========================");
	}
//	public void CustomFind()
//	{
//		for(Product product:productRepo.search("mo")) {
//		System.out.println("ID : " + product.getId());
//		System.out.println("Name : " + product.getName());
//		System.out.println("Price : " + product.getPrice());
//		System.out.println("Quantity : " + product.getQuantity());
//		System.out.println("Description : " + product.getDescription());
//		System.out.println("Photo : " + product.getPhoto());
//		System.out.println("Featured : " + product.isFeatured());
//		System.out.println("===========================");
//	}
//	}
	public void insertProduct()
	{
		Product product = new Product();
		product.setName("new name");
		product.setPrice(BigDecimal.valueOf(11));
		product.setQuantity(2);
		product.setDescription("good");
		product.setFeatured(true);
		product.setPhoto("a.gif");
		product = productRepo.save(product);
		System.out.println("new ID: " + product.getId());
	}
	public void UpdateProduct() {
		System.out.println("Update product ID 6");
		Product product = productRepo.findById(6);
		product.setName("Update mobile");
		product.setPrice(BigDecimal.valueOf(4));
		product.setFeatured(true);
		product = productRepo.save(product);
		System.out.println("Done");
	}
	public void Delete() {
		try {
			System.out.println("Delete product 5");
			productRepo.deleteById(5);
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
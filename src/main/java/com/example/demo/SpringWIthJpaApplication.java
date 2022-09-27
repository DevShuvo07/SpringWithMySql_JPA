package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.MainService;

@SpringBootApplication
public class SpringWIthJpaApplication {
	
	

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringWIthJpaApplication.class, args);
		MainService p1 = context.getBean(MainService.class);
		p1.product();
		p1.findProduct();
		p1.Delete();
		p1.insertProduct();
		p1.UpdateProduct();
		//p1.CustomFind();
	}

}

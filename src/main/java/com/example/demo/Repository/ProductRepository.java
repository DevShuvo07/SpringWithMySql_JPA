package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
//	@Query(value="from product where name like %:keyword%")
//	public List<Product> search(@Param("keyword") String keyword);
}

package com.myapp.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.demo.model.Product;

@Repository //manage by spring framework
public interface ProductRepository extends JpaRepository<Product, Integer>{  //jparepository already have all the crud operations, we don't have to write these.
//we don't have to write the implementation, spring framework will manage all that automatically	

	List<Product> findByPriceGreaterThan(double price);
	
}

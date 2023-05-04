package com.asfour.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asfour.entity.Product;

@Repository
public interface  ShopRepo extends JpaRepository<Product,Integer> {

}

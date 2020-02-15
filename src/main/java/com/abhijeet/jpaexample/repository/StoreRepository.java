package com.abhijeet.jpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhijeet.jpaexample.model.Company;

@Repository
public interface StoreRepository extends JpaRepository<Company, Integer> {

}

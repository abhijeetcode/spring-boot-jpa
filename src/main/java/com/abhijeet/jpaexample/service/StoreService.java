package com.abhijeet.jpaexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhijeet.jpaexample.model.Company;
import com.abhijeet.jpaexample.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	StoreRepository storeRepository;

	public List<Company> getAllStore() {
		List<Company> al = storeRepository.findAll();
		return al;
	}

	public Optional<Company> getStoreId(int id) {
		Optional<Company> optional = storeRepository.findById(id);
		
		return optional;
	}

}

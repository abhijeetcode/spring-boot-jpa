package com.abhijeet.jpaexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhijeet.jpaexample.model.Company;
import com.abhijeet.jpaexample.service.StoreService;

@RestController
public class StoreController {

	@Autowired
	StoreService storeService;

	@GetMapping("/getallstores")
	public List<Company> getStores() {
		List<Company> list1 = storeService.getAllStore();
		return list1;
	}

	@GetMapping("getStoreById/{id}")
	public ResponseEntity<Optional<Company>> getOneStore(@PathVariable("id") int sId) {
		Optional<Company> company = storeService.getStoreId(sId);
		return new ResponseEntity<>(company, HttpStatus.OK);
	}

}

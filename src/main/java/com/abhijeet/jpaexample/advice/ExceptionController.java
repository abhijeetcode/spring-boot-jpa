package com.abhijeet.jpaexample.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = StoreNotfoundException.class)
	public ResponseEntity<Object> exception(StoreNotfoundException storeNotfoundException) {
		return new ResponseEntity<>("Store not found", HttpStatus.NOT_FOUND);
	}
}

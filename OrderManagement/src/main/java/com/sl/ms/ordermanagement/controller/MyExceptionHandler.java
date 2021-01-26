package com.sl.ms.ordermanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ControllerAdvice
public class MyExceptionHandler {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> myMessage(CustomException c)
	{
		
		logger.info("inside class MyExceptionHandler");
		return new ResponseEntity<>(c.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
 
}

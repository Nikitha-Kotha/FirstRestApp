package com.lvg.rest.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lvg.rest.exception.ProductNotFoundException;
import com.lvg.rest.exception.ReviewNotFoundException;

@ControllerAdvice

public class RestAppExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public HttpStatus productNotFoundExceptionHandler(ProductNotFoundException ex)
	{
		System.out.println(ex);
		return HttpStatus.NO_CONTENT;
		
	}
	
	@ExceptionHandler(ReviewNotFoundException.class)
	public HttpStatus reviewNotFoundExceptionHandler(ReviewNotFoundException ex)
	{
		System.out.println(ex);
		return HttpStatus.OK;
		
	}

}

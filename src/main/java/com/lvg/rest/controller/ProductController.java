package com.lvg.rest.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.lvg.rest.service.ProductService;
 
import com.lvg.rest.entity.Product;
import com.lvg.rest.exception.ProductNotFoundException;
 
 
//@ResponseBody
//@Controller
@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	ProductService productService;
	@GetMapping(value="/",produces="application/json")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
 
 
	}
	@GetMapping(value="/{productId}",produces="application/json")
	//@GetMapping(value="/{productId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductById(@PathVariable int productId )
	{
		return new ResponseEntity<Product>(productService.getProductByid(productId),HttpStatus.OK);
	}
 
	@GetMapping(value="/productName{productName}",produces="application/json")
	public ResponseEntity<Product> getProductByName(@PathVariable String productName)
	{
		return new ResponseEntity<Product>(productService.getProductByName(productName),HttpStatus.OK);
	}
	@PostMapping(value="/",consumes="application/json")
	public HttpStatus addProductDetails(@RequestBody Product product)
	{
		if(productService.insertOrModifiyProduct(product))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	@PutMapping(value="/",consumes="application/json")
	public HttpStatus modifyProductDetails(@RequestBody Product product)
	{
		if(productService.insertOrModifiyProduct(product))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	@DeleteMapping(value="/{productId}")
	public HttpStatus deleteProductById(@PathVariable int productId)
	{
		productService.deleteProductById(productId);
			return HttpStatus.OK;
	}
 
 
@ExceptionHandler(ProductNotFoundException.class)
	public HttpStatus ProductNotFoundExceptionhandler(ProductNotFoundException ex)
	{
		System.out.println(ex);
		return HttpStatus.NO_CONTENT;
	}
}
 
//@GetMapping(value="/",produces="application/json")
//public ResponseEntity<List<Product>> getAllProducts()
//{
//List<Product> plist=productService.getAllProduct();
//if(plist.size()>0)
//	return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
////return new ResponseEntity<List<Product>>(plist,HttpStatus.NO_CONTENT);
 
//@GetMapping(value="/{productId}",produces="application/json")
////@GetMapping(value="/{productId}",produces=MediaType.APPLICATION_JSON_VALUE)
//public ResponseEntity<Product> getProductById(@PathVariable int productId )
//{
//Product p= productService.getProductByid(productId);
//if(p!=null)
//	return new ResponseEntity<Product>(p,HttpStatus.OK);
////return new ResponseEntity<Product>(p,HttpStatus.NO_CONTENT);
//
//}
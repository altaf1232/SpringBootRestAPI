package com.springbootjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.entites.BooksEntites;

//@Controller
@RestController
public class BookController {
	 
     //here is create your handler method 
	//@RequestMapping(value="/books",method= RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/books")
	 public BooksEntites getBooks()
	 {
		BooksEntites booksEntite=new BooksEntites();
		booksEntite.setBook_id(101234);
		booksEntite.setTitle("java Complete Refrance");
		booksEntite.setAuthor("XYZ");
		return booksEntite;
		//return " this is testing book first";
		 
	 }

}

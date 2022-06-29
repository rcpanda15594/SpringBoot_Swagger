package com.test.springboot_swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot_swagger.model.Book;
import com.test.springboot_swagger.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book book){
		return service.saveBook(book);
		
	}
	
	@PostMapping("/searchBook/{bookId}")
	public Book getBook(@RequestBody int bookId){
		System.out.println("Working..............................................");
		return service.getBook(bookId);
		
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public List<Book> deleteBook(@RequestBody int bookId){
		return service.deleteBook(bookId);
		
	}

}

package com.test.springboot_swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot_swagger.model.Book;
import com.test.springboot_swagger.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	
	public String saveBook(Book book){
		repository.save(book);
		return "Book save with id" + book.getBookId(); 
	}
	
	
	public Book getBook(int bookId){
		return repository.getOne(bookId);
	}
	
	
	public List<Book> deleteBook(int bookId){
		repository.deleteById(bookId);
		return repository.findAll();
	}
}

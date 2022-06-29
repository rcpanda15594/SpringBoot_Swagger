package com.test.springboot_swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.springboot_swagger.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

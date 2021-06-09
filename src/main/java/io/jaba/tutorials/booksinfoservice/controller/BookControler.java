package io.jaba.tutorials.booksinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jaba.tutorials.booksinfoservice.model.Book;

/**
 * Identified endpoint
 * 
 * GET   /books/{bookId}   return the book Detail of a given book.
 *                        (just for test If the book does not exist it will create a book with the given bookdId and a Default name "springBoot")
 * GET   /books            return a list of books with details
 * POST  /books/           create a new book
 * PUT   /books/{bookId}   update the details of the given book
 * DELETE /books/{bookId}  delete the book with the given bookId from the list
 * 
 * @author Zakaria.Jabara
 *
 */
@RestController
@RequestMapping("/books")
public class BookControler {
	
	@RequestMapping("/{bookId}")
	public Book getBookInfo(@PathVariable("bookId") String bookId) {
		return new Book(bookId,"SpringBoot");
	}

}

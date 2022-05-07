package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	Book getById(int bookId) throws IdNotFoundException;
	List<Book> getAll();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByLesserPrice(double price) throws BookNotFoundException;
}

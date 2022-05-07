package com.bookapp.main;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
//		IBookService bookService = new BookServiceImpl();

		ApplicationContext context = new AnnotationConfigApplicationContext("com.bookapp");
		IBookService bookService = context.getBean("bookServiceImpl",BookServiceImpl.class);

		Book book = new Book("Macbeath", "Shaskpeare", "Drama", 700);
		bookService.addBook(book);
		
		System.out.println("All Books");
		bookService.getAll().forEach(System.out::println);
		System.out.println();
		System.out.println("Books By Category");
		try {
			List<Book> booksByCategory = bookService.getByCategory("Tech");
			booksByCategory.forEach(System.out::println);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Books By Author");
		try {
			List<Book> booksByAuthor = bookService.getByAuthor("Chetan Bhagat");
			booksByAuthor.forEach(System.out::println);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
			}
		
		System.out.println();
		System.out.println("Books less than price");
		try {
			List<Book> booksByPrice = bookService.getByLesserPrice(400.0);
			booksByPrice.forEach(System.out::println);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		}

}

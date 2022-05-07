package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.util.AllQueries;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements IBookDao {

	private static Connection connection;

	@Override
	public void addBook(Book book) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.INSERTQUERY);
			preparedStatement.setString(1, book.getTitle());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getCategory());
			preparedStatement.setDouble(4, book.getPrice());
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}
	}

	@Override
	public void updateBook(int bookId, double price) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.UPDATEQUERY);
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, bookId);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}
	}

	@Override
	public void deleteBook(int bookId) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.DELETEQUERY);
			preparedStatement.setInt(1, bookId);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}
	}

	@Override
	public Book findById(int bookId) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		Book book = null;
		try {
			preparedStatement = connection.prepareStatement(AllQueries.SELECTONEQUERY);
			preparedStatement.setInt(1, bookId);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				book = new Book(bookId, title, author, category, price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}		
		return book;
	}

	@Override
	public List<Book> findAll() {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		List<Book> bookList = new ArrayList<Book>();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.SELECTQUERY);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Integer bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				Book book = new Book(bookId, title, author, category, price);
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}		return bookList;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		List<Book> bookList = new ArrayList<Book>();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.AUTHORQUERY);
			preparedStatement.setString(1, author);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Integer bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				Book book = new Book(bookId, title, author, category, price);
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}	
		return bookList;
	}

	@Override
	public List<Book> findByCategory(String category) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		List<Book> bookList = new ArrayList<Book>();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.CATEGORYQUERY);
			preparedStatement.setString(1, category);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Integer bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String author = rs.getString("author");
				double price = rs.getDouble("price");
				Book book = new Book(bookId, title, author, category, price);
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}	
		return bookList;
	}

	@Override
	public List<Book> findByLesserPrice(double price) {
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.openConnection();
		List<Book> bookList = new ArrayList<Book>();
		try {
			preparedStatement = connection.prepareStatement(AllQueries.PRICEQUERY);
			preparedStatement.setDouble(1, price);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Integer bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				double nprice = rs.getDouble("price");
				Book book = new Book(bookId, title, author, category, nprice);
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ConnectionUtil.closeConnection();
		}	
		return bookList;
	}

}

package Practica3.core.core.driver_ports;

import Practica3.core.core.driven_ports.BookRepository;
import Practica3.core.domain.Book;

public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	public BookServiceImpl(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	}
	public Book getBook(Long id) {
	        return bookRepository.findById(id);
	}

}

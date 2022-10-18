package Practica3.core.core.driven_ports;

import Practica3.core.domain.Book;

public interface BookRepository {

	Book findById(Long id);
	
}

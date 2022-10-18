package Practica3.core.core.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Practica3.core.core.db_driven_adapter.domain.BookEntity;
import Practica3.core.core.db_driven_adapter.jparepository.HAAJpaRepository;
import Practica3.core.core.driven_ports.BookRepository;
import Practica3.core.domain.Book;
import Practica3.core.domain.BookDoesNotExistException;

@Component
public class JpaBookRepository implements BookRepository {
   
	@Autowired //enlaza repositorio y servicio
	private HAAJpaRepository haaJpaRepository;
	
	@Override
	public Book findById(Long id) {
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		return bookEntity.toBook();
	}
}


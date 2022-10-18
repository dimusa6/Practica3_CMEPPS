package Practica3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Practica3.core.core.driven_ports.BookRepository;
import Practica3.core.core.driver_ports.BookService;
import Practica3.core.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepositoryPort) {
            return new BookServiceImpl(bookRepositoryPort);
        }
}

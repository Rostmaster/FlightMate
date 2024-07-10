package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CLIRunner {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            repository.save(new
                    Book(null, "Spring boot in Action",
                    471, "Craig Walls"));
        };
    }

}

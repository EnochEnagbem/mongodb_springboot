package com.spring.mongodb_springboot.repository;

import com.spring.mongodb_springboot.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class BookRepositoryTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    void addBook(){

        Book book = new Book("To Kill a Mockingbird", "Harper Lee");

        bookRepository.save(book);

    }

    @Test
    void findAllBooks(){

        ArrayList<Book> books = (ArrayList<Book>) bookRepository.findAll();

        assertNotNull(books);
    }



}
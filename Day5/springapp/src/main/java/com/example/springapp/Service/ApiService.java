package com.example.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Book;

import com.example.springapp.Repositories.BookRepo;

@Service
public class ApiService {
    @Autowired
    private BookRepo book;

    public Book addBook(Book b) {
        return book.save(b);
    }

    public List<Book> getDetails() {
        return book.findAll();
    }

    public Book getBook(int id) {
        return book.findById(id).orElse(null);
    }

    public Book updateBook(Book b) {
        return book.saveAndFlush(b);
    }

    public void deleteBook(int id) {
        book.deleteById(id);
    }

}

package com.example.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Book;
import com.example.springapp.Service.ApiService;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public String addBook(@RequestBody Book b){
        apiService.addBook(b);
        return "Book added successfully";
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return apiService.getBook(id);
    }

    @GetMapping("/")
    public List<Book> getDetails(){
        return apiService.getDetails();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book b){
        return apiService.updateBook(b);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        apiService.deleteBook(id);
        return "Book deleted successfully";
    }
}

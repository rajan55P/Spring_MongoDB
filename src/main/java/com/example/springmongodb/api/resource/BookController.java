package com.example.springmongodb.api.resource;

import com.example.springmongodb.api.model.Book;
import com.example.springmongodb.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Added book with id: " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBook(){
        return repository.findAll();
    }
    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id)
    {
        return repository.findById(id);
    }

    public String deleteBook(@PathVariable int id){
        repository.deleteById(id);
        return "Book deleted with id : "+id;
    }
}

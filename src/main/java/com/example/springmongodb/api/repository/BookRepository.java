package com.example.springmongodb.api.repository;

import com.example.springmongodb.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}

// We are making use of MongoRepository here 
// Other ways were JPAReposistory etc.
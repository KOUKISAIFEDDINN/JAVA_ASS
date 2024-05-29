package com.books.booksapi.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.books.booksapi.Entity.BookEntity;

@Repository
public interface BooksRepo extends CrudRepository<BookEntity, Long> {
    // No need for a custom method, use the default methods provided by CrudRepository
}

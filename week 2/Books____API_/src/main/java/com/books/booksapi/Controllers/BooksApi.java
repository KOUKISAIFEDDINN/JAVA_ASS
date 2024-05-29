package com.books.booksapi.Controllers;

import com.books.booksapi.Entity.BookEntity;
import com.books.booksapi.Services.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksApi {

    private final BooksService bookService;

    public BooksApi(BooksService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return bookService.allBooks();
    }

    @PostMapping
    public BookEntity addBook(
    @RequestBody BookEntity book) {
        return bookService.save(book);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(
    @PathVariable("id") Long id, @RequestBody BookEntity updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(
    @PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
}

package com.books.booksapi.Services;

import com.books.booksapi.Entity.BookEntity;
import com.books.booksapi.Repositories.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksRepo booksRepo;

    public List<BookEntity> allBooks() {
        return (List<BookEntity>) booksRepo.findAll();
    }

    public BookEntity save(BookEntity book) {
        return booksRepo.save(book);
    }

    public Optional<BookEntity> findById(Long id) {
        return booksRepo.findById(id);
    }

    public BookEntity updateBook(Long id, BookEntity updatedBook) {
        Optional<BookEntity> optionalBook = booksRepo.findById(id);
        if (optionalBook.isPresent()) {
            BookEntity book = optionalBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setDescription(updatedBook.getDescription());
            book.setLanguage(updatedBook.getLanguage());
            book.setNumberOfPages(updatedBook.getNumberOfPages());
            return booksRepo.save(book);
        } else {

            return null;
        }
    }


    public void deleteBook(Long id) {
        booksRepo.deleteById(id);
    }
}


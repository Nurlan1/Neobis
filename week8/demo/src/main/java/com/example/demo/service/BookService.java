package com.example.demo.service;

import com.example.demo.repository.BookRepository;
import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.entity.Book;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll() ;}

    public Optional<Book> getBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    public void addNewBook(Book book) {
        Author authorOptional= Optional.ofNullable(authorRepository.findByName(book.getAuthor().getName())).orElse(new Author(book.getAuthor().getName()));
        Category categoryOptional = Optional.ofNullable(categoryRepository.findByName(book.getCategory().getName())).orElse(new Category(book.getCategory().getName()));
        book.setAuthor(authorOptional);
        book.setCategory(categoryOptional);
        bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long bookId) {
        boolean exists =bookRepository.existsById(bookId);
        if(!exists){
            throw new IllegalStateException("book with id "+bookId+" doesn't exist");
        }
        bookRepository.deleteById(bookId);

    }

}

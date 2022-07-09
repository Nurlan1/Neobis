package com.example.demo.book;

import com.example.demo.author.Author;
import com.example.demo.author.AuthorRepository;
import com.example.demo.category.Category;
import com.example.demo.category.CategoryRepository;
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

    public void addNewBook(Book book) {
        Author authorOptitonal= authorRepository.findByName(book.getAuthor().getName());
        Category categoryOptional = categoryRepository.findByName(book.getCategory().getName());

        System.out.println(authorOptitonal);
        book.setAuthor(Objects.requireNonNullElseGet(authorOptitonal, () -> new Author(book.getAuthor().getName())));
        book.setCategory(Objects.requireNonNullElseGet(categoryOptional, () -> new Category(book.getCategory().getName())));
        bookRepository.save(book);
    }


    public void deleteBook(Long bookId) {
        boolean exists =bookRepository.existsById(bookId);
        if(!exists){
            throw new IllegalStateException("book with id "+bookId+" doesn't exist");
        }
        bookRepository.deleteById(bookId);

    }

    public Optional<Book> getBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}

package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/book")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
    this.bookService=bookService;
    }
    @GetMapping
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }
    @PutMapping(path="{bookId}")
    public void updateBook(@PathVariable Long bookId,@RequestBody Book book){
        System.out.println(book+" updated");
        bookService.updateBook(book);
    }


    @DeleteMapping(path= "{bookId}")
    public void deleteBook(@PathVariable("bookId")Long bookId){
        bookService.deleteBook(bookId);
    }
    @GetMapping(path = "{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId")Long bookId){
        return bookService.getBookById(bookId);
    }
}

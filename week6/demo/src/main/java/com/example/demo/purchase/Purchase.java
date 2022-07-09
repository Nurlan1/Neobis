package com.example.demo.purchase;

import com.example.demo.book.Book;
import com.example.demo.customer.Customer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name= "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    public Purchase(String name, LocalDate date, Customer customer, Book book) {
        this.name = name;
        this.date = date;
        this.customer = customer;
        this.book = book;
    }
}

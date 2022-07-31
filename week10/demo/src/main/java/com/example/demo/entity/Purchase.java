package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer quantity;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name= "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    public Purchase(Integer quanity, LocalDate date, Customer customer, Book book) {
        this.quantity = quantity;
        this.date = date;
        this.customer = customer;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

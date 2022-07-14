package com.example.demo.entity;

import com.example.demo.entity.Author;
import com.example.demo.entity.Category;

import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String name;
    private Double price;
    private String description;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)

    @JoinColumn(name ="author_id", referencedColumnName = "id")
    private Author author;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Book() {
    }

    public Book(Long id, String name, Double price, String description, Author author, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.author = author;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Book(String name, Double price, String description, Author author, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", author=" + author +
                ", category=" + category +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Book(String name, Double price, String description, Author author) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.author = author;
    }

    public Book(Double price) {
        this.price = price;
    }

    public Book(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }
}

package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Category;
import com.example.demo.service.AuthorService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API documentation for book store\n" +
        "1.\tGets all the books that list with data\n" +
        "2.\tGET /api/v1/book\n" +
        "3.\tNone\n" +
        "4.\tList of books and information \n")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAllCategories();
    }
    @PostMapping
    public ResponseEntity<String> add(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Category category){
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return categoryService.deleteCategory(id);
    }
}

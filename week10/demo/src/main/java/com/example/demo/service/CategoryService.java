package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    public ResponseEntity<?> findById(Long id){
        if(categoryRepository.existsById(id)){
            return new ResponseEntity<Optional<Category>>(categoryRepository.findById(id),HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("category with id "+id+"not found",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<String> addCategory(Category category){
        try {
            categoryRepository.save(category);
            return new ResponseEntity<String>("category created", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<String>("category '"+category.getName()+"' was not created",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> updateCategory(Long id,Category newCategory) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(newCategory.getName());
                    categoryRepository.save(category);
                    return new ResponseEntity<String>("category with id "+id+" updated!",HttpStatus.OK);
                }).orElse(new ResponseEntity<String>("category with id "+id+" not found",HttpStatus.NOT_FOUND));
    }
    public ResponseEntity<String> deleteCategory(Long id){
        try {
            System.out.print(categoryRepository.findById(id));
            categoryRepository.deleteById(id);
            return new ResponseEntity<String>("category deleted!", HttpStatus.OK);
        }
        catch (DataIntegrityViolationException e){
            return new ResponseEntity<String>("category with id "+id+" not deleted or not found ERROR:"+e.getRootCause().getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

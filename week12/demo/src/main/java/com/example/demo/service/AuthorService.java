package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
    public ResponseEntity<?> findById(Long id){
        if(authorRepository.existsById(id)){
            return new ResponseEntity<Optional<Author>>(authorRepository.findById(id),HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("author with id "+id+"not found",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<String> addAuthor(Author author){
        try {
            authorRepository.save(author);
            return new ResponseEntity<String>("author created", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<String>("author '"+author.getName()+"' was not created",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> updateAuthor(Long id,Author newAuthor) {
        return authorRepository.findById(id)
                .map(author -> {
                    author.setName(newAuthor.getName());
                    authorRepository.save(author);
                    return new ResponseEntity<String>("author with id "+id+" updated!",HttpStatus.OK);
                }).orElse(new ResponseEntity<String>("author with id "+id+" not found",HttpStatus.NOT_FOUND));
    }
    public ResponseEntity<String> deleteAuthor(Long id){
        try {
            System.out.print(authorRepository.findById(id));
            authorRepository.deleteById(id);
            return new ResponseEntity<String>("author deleted!", HttpStatus.OK);
        }
        catch (DataIntegrityViolationException e){
            return new ResponseEntity<String>("author with id "+id+" not deleted or not found ERROR:"+e.getRootCause().getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

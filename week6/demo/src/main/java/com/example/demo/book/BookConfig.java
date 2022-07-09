package com.example.demo.book;

import com.example.demo.author.Author;
import com.example.demo.author.AuthorRepository;
import com.example.demo.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Autowired
    AuthorRepository authorRepository;
//    @Bean
//    CommandLineRunner commandLineRunner(
//            BookRepository repository ){
//        return args -> {
//            Book cracking = new Book(
//                    "Cracking the coding interview",
//                    2000.00,
//                    "For developers",
//                    null,
//                    new Category("It")
//
//            );
//            try{
//            cracking.setAuthor(authorRepository.findByName("Sheldon Cooper"));}
//            catch (Exception e){
//                System.out.println(e);
//            }finally {
////                cracking.setAuthor(new Author("Rajesh Kootrepaly"));
//            }


//            Book intro = new Book(
//                    "Introduction",
//                    1500.00,
//                    "For developers",
//                    new Author("Thomas H. Cormen "),
//                    new Category("It")
//
//            );
//            repository.saveAll(List.of(cracking));
//        };
//    }
}

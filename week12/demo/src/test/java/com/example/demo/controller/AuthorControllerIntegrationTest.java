package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
@Transactional
public class AuthorControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper;

    public AuthorControllerIntegrationTest(){
        mapper = new ObjectMapper();
    }
    @Test
    void getAllAuthors() throws Exception {
        mockMvc.perform( get("/author"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void addAuthor() throws Exception {
        Author author = new Author("Pushkin");
        String jsonRequest = mapper.writeValueAsString(author);
        mockMvc.perform( post("/author")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getAuthorById() throws Exception {
        mockMvc.perform(get("/author/{id}", 1))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void updateAuthor() throws Exception {
        Author author = new Author("Hello1");
        String jsonRequest = mapper.writeValueAsString(author);
        mockMvc.perform( put("/author/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());

    }

//    @Test
//    void deleteAuthor() throws Exception {
//        mockMvc.perform( delete("/author/54"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
}
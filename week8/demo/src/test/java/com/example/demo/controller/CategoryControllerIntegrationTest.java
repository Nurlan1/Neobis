package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class CategoryControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper;

    public CategoryControllerIntegrationTest(){
        mapper = new ObjectMapper();
    }
    @Test
    void getAllCategories() throws Exception {
        mockMvc.perform( get("/category"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void addCategory() throws Exception {
        Category category = new Category("Ecology");
        String jsonRequest = mapper.writeValueAsString(category);
        mockMvc.perform( post("/category")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getCategoryById() throws Exception {
        mockMvc.perform(get("/category/{id}", 13))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void updateCategory() throws Exception {
        Category category = new Category("Other");
        String jsonRequest = mapper.writeValueAsString(category);
        mockMvc.perform( put("/category/28")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    void deleteCategory() throws Exception {
        mockMvc.perform( delete("/category/57"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
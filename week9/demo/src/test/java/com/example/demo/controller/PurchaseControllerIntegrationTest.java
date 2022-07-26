package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Purchase;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class PurchaseControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper;
    public PurchaseControllerIntegrationTest(){
        mapper = new ObjectMapper();
    }

    @Test
    void getAllPurchases() throws Exception {
        mockMvc.perform(get("/purchase"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void addPurchase() throws Exception {

        Purchase purchase=new Purchase(1,null ,new Customer("Erlan","123456","Bishkek"),new Book("Intorduction to ...",2000.00,"For IT",new Author("Nurik")) );
//        purchase.setId(64L);
        String jsonRequest=mapper.writeValueAsString(purchase);
        mockMvc.perform(post("/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void findPurchaseById() throws Exception {
        mockMvc.perform(get("/purchase/58"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void updatePurchase() {

    }

    @Test
    void deletePurchase() throws Exception {
        mockMvc.perform(delete("/purchase/58"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
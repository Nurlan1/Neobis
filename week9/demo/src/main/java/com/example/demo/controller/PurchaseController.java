package com.example.demo.controller;

import com.example.demo.entity.Purchase;
import com.example.demo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping
    public List<Purchase> getAll(){
        return purchaseService.getAllPurchases();
    }
    @PostMapping
    public ResponseEntity<String> add(@RequestBody Purchase purchase){
        return purchaseService.addPurchase(purchase);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return purchaseService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Purchase purchase){
        return purchaseService.updatePurchase(id, purchase);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return purchaseService.deletePurchase(id);
    }
}

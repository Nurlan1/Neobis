package com.example.demo.service;

import com.example.demo.entity.Purchase;
import com.example.demo.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    public List<Purchase> getAllPurchases(){
        return purchaseRepository.findAll();
    }
    public ResponseEntity<?> findById(Long id){
        if(purchaseRepository.existsById(id)){
            return new ResponseEntity<Optional<Purchase>>(purchaseRepository.findById(id),HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("purchase with id "+id+"not found",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<String> addPurchase(Purchase purchase){
        try {
            purchaseRepository.save(purchase);
            return new ResponseEntity<String>("purchase created", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<String>("purchase '"+purchase.getId()+"' was not created",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> updatePurchase(Long id,Purchase newPurchase) {
        return purchaseRepository.findById(id)
                .map(purchase -> {
                    purchase.setQuantity(newPurchase.getQuantity());
                    purchase.setBook(newPurchase.getBook());
                    purchase.setCustomer(newPurchase.getCustomer());
                    purchase.setDate(newPurchase.getDate());
                    purchaseRepository.save(purchase);
                    return new ResponseEntity<String>("purchase with id "+id+" updated!",HttpStatus.OK);
                }).orElse(new ResponseEntity<String>("purchase with id "+id+"  not found",HttpStatus.NOT_FOUND));
    }
    public ResponseEntity<String> deletePurchase(Long id){
        try {
            System.out.print(purchaseRepository.findById(id));
            purchaseRepository.deleteById(id);
            return new ResponseEntity<String>("purchase deleted!", HttpStatus.OK);
        }
        catch (DataIntegrityViolationException e){
            return new ResponseEntity<String>("purchase with id "+id+" not deleted or not found ERROR:"+e.getRootCause().getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

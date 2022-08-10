package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    
    private final CustomerRepository customerRepository;
    @Autowired

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    public ResponseEntity<?> findById(Long id){
        if(customerRepository.existsById(id)){
            return new ResponseEntity<Optional<Customer>>(customerRepository.findById(id), HttpStatus.OK);
        }else{
            return new ResponseEntity<String>("customer with id "+id+"not found",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<String> addCustomer(Customer customer){
        try {
            customerRepository.save(customer);
            return new ResponseEntity<String>("customer created", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<String>("customer '"+customer.getName()+"' was not created",HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> updateCustomer(Long id,Customer newCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setName(newCustomer.getName());
                    customer.setAddress(newCustomer.getAddress());
                    customer.setPhoneNumber(newCustomer.getPhoneNumber());
                    customerRepository.save(customer);
                    return new ResponseEntity<String>("customer with id "+id+" updated!",HttpStatus.OK);
                }).orElse(new ResponseEntity<String>("customer with id "+id+" not found",HttpStatus.NOT_FOUND));
    }
    public ResponseEntity<String> deleteCustomer(Long id){
        try {
            System.out.print(customerRepository.findById(id));
            customerRepository.deleteById(id);
            return new ResponseEntity<String>("customer deleted!", HttpStatus.OK);
        }
        catch (DataIntegrityViolationException e){
            return new ResponseEntity<String>("customer with id "+id+" not deleted or not found ERROR:"+e.getRootCause().getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

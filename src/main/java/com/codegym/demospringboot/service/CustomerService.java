package com.codegym.demospringboot.service;

import com.codegym.demospringboot.model.Customer;
import com.codegym.demospringboot.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    //Iterable<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstName(String firstName, Pageable pageable);

    //Page<Customer> findAllCustomerSortByFirstName(Sort sort);

    Iterable<Customer> findAllByProvince(Province province);

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}

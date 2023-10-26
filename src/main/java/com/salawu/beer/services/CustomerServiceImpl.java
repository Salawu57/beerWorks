package com.salawu.beer.services;

import com.salawu.beer.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().id(customerId)
                .name("Bolanle Walely")
                .build();
    }
}

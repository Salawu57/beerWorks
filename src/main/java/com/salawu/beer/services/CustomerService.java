package com.salawu.beer.services;

import com.salawu.beer.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);
}

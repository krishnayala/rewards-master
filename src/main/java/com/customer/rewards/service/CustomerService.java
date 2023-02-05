package com.customer.rewards.service;

import com.customer.rewards.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> calculateRewards();

    Customer calculateRewardsByCustomerId(Long customerId);
}

package com.customer.rewards.service;

import com.customer.rewards.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getTransactions();

    List<Transaction> getTransactionsByCustomerId(Long customerId);
}

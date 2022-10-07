package com.freelance.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {

    @Autowired
    private FraudCheckHistoryRepository repository;

    public boolean isFraudulentCustomer(Integer customerId) {
        repository.insert(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;// implementar de acuerdo a algún requisito, por ejemplo por email/username
    }
}

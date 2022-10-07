package com.freelance.fraud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepository extends MongoRepository<FraudCheckHistory, String> {
}

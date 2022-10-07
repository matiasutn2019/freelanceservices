package com.freelance.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class FraudCheckHistory {

    @Id
    private String id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}

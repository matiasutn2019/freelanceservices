package com.freelance.fraud;

import com.freelance.clients.fraud.FraudCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    @Autowired
    private FraudCheckService fraudService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID) {
        log.info("fraud check request for customer {}", customerID);
        return new FraudCheckResponse(
                fraudService.isFraudulentCustomer(customerID)
        );
    }
    //si agrego un nuevo método acá tmb debo agregarlo a la interfaz FraudClient
}

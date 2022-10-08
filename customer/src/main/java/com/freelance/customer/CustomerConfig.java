package com.freelance.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /*
    @LoadBalanced:
    Used as a marker annotation indicating that the annotated RestTemplate should use
    a RibbonLoadBalancerClient for interacting with your service(s).
    In turn, this allows you to use "logical identifiers" for the URLs you pass to the RestTemplate.
    These logical identifiers are typically the name of a service. For example: (see CustomerService)
    restTemplate.getForObject(
            "http://FRAUD/api/v1/fraud-check/{customerId}",
            FraudCheckResponse.class,
            customer.getId());
    */
}

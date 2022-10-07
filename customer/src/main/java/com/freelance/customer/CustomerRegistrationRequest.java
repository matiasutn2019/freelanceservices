package com.freelance.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}

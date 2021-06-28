package com.csculb;

import java.util.UUID;

public class Customer {

    UUID customerId = UUID.randomUUID();
    String name = "Anonymous";

    public Customer(String name) {
        this.name = name;
    }

    void borrowMovie(Movie movie) {
        // TODO: - Implement later
    }

}

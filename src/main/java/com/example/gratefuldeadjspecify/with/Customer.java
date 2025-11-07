package com.example.gratefuldeadjspecify.with;

import org.jspecify.annotations.Nullable;

class Customer {
    @Nullable
    private Address shippingAddress;

    public @Nullable Address getShippingAddress() {
        return shippingAddress;
    }
}

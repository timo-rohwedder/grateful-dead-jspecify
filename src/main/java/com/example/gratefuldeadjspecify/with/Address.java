package com.example.gratefuldeadjspecify.with;

import org.jspecify.annotations.Nullable;

class Address {
    @Nullable
    private String addressLine;

    public @Nullable String getAddressLine() {
        return addressLine;
    }
}

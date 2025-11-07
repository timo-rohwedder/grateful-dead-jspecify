package com.example.gratefuldeadjspecify.with;

import org.jspecify.annotations.Nullable;

class PrintAddressLabelWithJSpecifyApp {

    public static void main(String[] args) {
        Customer customer = EventConsumer.getCustomer();
        printAddressLabel(customer.getShippingAddress());
    }

    static void printAddressLabel(@Nullable Address shippingAddress) {
        System.out.println(shippingAddress == null ? "no shipping address" : shippingAddress.getAddressLine());
    }
}


package com.example.gratefuldeadjspecify.without;


class PrintAddressLabelApp {

    public static void main(String[] args) {
        Customer customer = EventConsumer.getCustomer();
        printAddressLabel(customer.getShippingAddress());
    }

    static void printAddressLabel(Address shippingAddress) {
        System.out.println(shippingAddress.getAddressLine());
    }
}

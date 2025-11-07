package com.example.gratefuldeadjspecify.arrays;

import lombok.ToString;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@ToString
class Book {

    Author[] authors = new Author[] {};

    // Array with null values
    // @Nullable String[] tags;

    // Array can be null
    // String @Nullable[] tags;
    @Nullable String @Nullable[] tags;

    public static void main(String[] args) {
        Book book = new Book();

        book.tags = null;

        book.tags = new String[] {null};

    }

}

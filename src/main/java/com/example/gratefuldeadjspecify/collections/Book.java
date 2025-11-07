package com.example.gratefuldeadjspecify.collections;

import lombok.ToString;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@ToString
class Book {

    final List<Author> authors = new ArrayList<>();

    @Nullable
    List<@Nullable String> tags;

    public static void main(String[] args) {
        Book book = new Book();
        book.authors.add(new Author());

        book.tags = null;

        book.tags = new ArrayList<>();
        book.tags.add(null);
    }

}

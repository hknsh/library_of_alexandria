package com.hksh.loa;

import java.util.Arrays;
import java.util.List;

public record Book (String id, String name, String summary, int pageCount, String authorId) {
    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Clean Code Tutorial", "How you can make better code", 412, "author-1"),
            new Book("book-2", "How to speak English", "A awesome book teaching english", 292, "author-2")
    );

    public static Book getById(String id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}

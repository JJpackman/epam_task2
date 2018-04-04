package com.company.subtask2.model;

import com.company.subtask2.model.entity.Book;

import java.util.*;
import java.util.function.Predicate;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(Book b) {
        if (!books.contains(b)) {
            return books.add(b);
        }

        return false;
    }

    public Book[] findBooks(Predicate<Book> p) {
        final List<Book> found = new ArrayList<>();

        for (Book checked : this.books) {
            if (p.test(checked)) {
                found.add(checked);
            }
        }

        return found.toArray(new Book[0]);
    }

    public Book[] sort(Comparator<Book> c) {
        Book[] sorted = books.toArray(new Book[0]);
        Arrays.sort(sorted, c);

        return sorted;
    }
}

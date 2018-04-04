package com.company.subtask2.model.entity;

import java.time.LocalDate;

public class Book {
    private final String title;
    private final Author author;
    private final String publisher;
    private final int yearOfPublishing;
    private final int totalPages;

    private Book(String title, Author author, String publisher, int yearOfPublishing, int totalPages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.totalPages = totalPages;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public String toString() {
        return String.format("'%s' - %s %d (%s Publisher)", title, author, yearOfPublishing, publisher);
    }

    public static final class Publisher {
        private String title;
        private Author author;
        private String publishingHouse;
        private int yearOfPublishing;
        private int totalPages;

        public Publisher() {}

        public Publisher setTitle(String title) {
            this.title = title;
            return this;
        }

        public Publisher setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Publisher setPublisher(String publishingHouse) {
            this.publishingHouse = publishingHouse;
            return this;
        }

        public Publisher setYearOfPublishing(int yearOfPublishing) {
            this.yearOfPublishing = yearOfPublishing;
            return this;
        }

        public Publisher setTotalPages(int totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public Book publish() {
            return new Book(title, author, publishingHouse, yearOfPublishing, totalPages);
        }
    }
}

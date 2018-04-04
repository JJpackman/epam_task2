package com.company.subtask2.model.enums;

public enum Action {
    FIND_BOOKS_BY_AUTHOR(1, "Obtain a list of books by the author"),
    FIND_BOOKS_PUBLISHED_LATER_OF_THE_YEAR(2, "Get a list of books that are published specified by the publishing house"),
    FIND_BOOKS_BY_PUBLISHERS(3, "Get a list of books published after the specified year"),
    SORT_BOOKS_BY_PUBLISHERS(4, "Sort books by publishers"),
    EXIT(5, "Exit");

    private final String description;
    private final int number;

    Action(int number, String description) {
        this.description = description;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%d) %s", number, description);
    }
}

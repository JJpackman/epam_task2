package com.company.subtask2.controller.command;

import com.company.subtask2.model.Library;
import com.company.subtask2.model.entity.Book;
import com.company.subtask2.view.View;

import java.util.Comparator;

public class SortBooks implements LibraryCommand {
    private final Library model;
    private final View view;
    private final Comparator<Book> c;

    public SortBooks(Library model, View view, Comparator<Book> c) {
        this.model = model;
        this.view = view;
        this.c = c;
    }

    @Override
    public void execute() {
        view.print(model.sort(c));
    }
}

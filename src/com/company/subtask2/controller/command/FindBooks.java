package com.company.subtask2.controller.command;

import com.company.subtask2.model.Library;
import com.company.subtask2.model.entity.Book;
import com.company.subtask2.view.View;

import java.util.function.Predicate;

public class FindBooks implements LibraryCommand {
    private final Library model;
    private final View view;
    private final Predicate<Book> p;

    public FindBooks(Library model, View view, Predicate<Book> p) {
        this.model = model;
        this.view = view;
        this.p = p;
    }

    @Override
    public void execute() {
        view.print(model.findBooks(p));
    }
}

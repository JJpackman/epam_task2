package com.company.subtask2.controller.command;

import com.company.subtask2.model.Library;
import com.company.subtask2.model.enums.Action;
import com.company.subtask2.view.View;
import java.util.*;

import static com.company.subtask2.model.enums.Action.*;

public class LibraryCommandInvoker {
    private final Map<Action, LibraryCommand> commands = new HashMap<>();
    private final Library model;
    private final View view;

    public void addCommand(Action action, LibraryCommand command) {
        commands.putIfAbsent(action, command);
    }

    public LibraryCommandInvoker(Library model, View view) {
        this.model = model;
        this.view = view;
    }

    public void executeCommand(Action action) throws Exception {
        try {
            commands.get(action).execute();
        } catch (NullPointerException e) {
            throw new Exception("Command not found", e);
        }
    }

    public static LibraryCommandInvoker getLibraryCommandInvoker(Library model, View view) {
        return new LibraryCommandInvoker(model, view) {
            {
                addCommand(FIND_BOOKS_BY_AUTHOR,
                        new FindBooks(model, view, book -> book.getAuthor().getSurname()
                                .equalsIgnoreCase("bulgakov")));
                addCommand(FIND_BOOKS_PUBLISHED_LATER_OF_THE_YEAR,
                        new FindBooks(model, view, book -> book.getYearOfPublishing() > 1954));
                addCommand(FIND_BOOKS_BY_PUBLISHERS,
                        new FindBooks(model, view, book -> book.getPublisher().toLowerCase().contains("alpina")));
                addCommand(SORT_BOOKS_BY_PUBLISHERS, new SortBooks(model, view,
                        (b1, b2) -> b1.getPublisher().compareTo(b2.getPublisher())));
            }
        };
    }
}

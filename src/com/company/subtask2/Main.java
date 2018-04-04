package com.company.subtask2;

import com.company.subtask2.controller.LibraryController;
import com.company.subtask2.controller.command.LibraryCommandInvoker;
import com.company.subtask2.model.util.LibraryFactory;
import com.company.subtask2.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        LibraryCommandInvoker invoker = LibraryCommandInvoker.getLibraryCommandInvoker(LibraryFactory.getLibrary(), view);

        new LibraryController(invoker, view).processUserActions();
    }
}

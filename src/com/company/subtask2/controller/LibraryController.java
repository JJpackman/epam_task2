package com.company.subtask2.controller;

import com.company.subtask2.controller.command.LibraryCommandInvoker;
import com.company.subtask2.helper.UserActionsReader;
import com.company.subtask2.model.enums.Action;
import com.company.subtask2.view.View;

public class LibraryController {
    private LibraryCommandInvoker invoker;
    private View view;

    public LibraryController(LibraryCommandInvoker invoker, View view) {
        this.invoker = invoker;
        this.view = view;
    }

    public void processUserActions() {
        final UserActionsReader actionsReader = new UserActionsReader();
        Action current;

        do {
            view.printMenu(Action.values());

            try {
                current = actionsReader.readAction();

                 if (current == Action.EXIT) {
                     break;
                 }

                invoker.executeCommand(current);
            } catch (Exception e) {
                view.printError(e.getMessage());
            }
        } while (true);
    }
}

package com.company.subtask1.controller.command;

import com.company.subtask1.view.ConsoleView;
import com.company.subtask1.view.partial_view.ActionMessagePartialView;

public class ExitCommand implements ShapeCommand {
    private ConsoleView view;
    private static final String MSG = "Exit from program";

    public ExitCommand(ConsoleView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printMsg(new ActionMessagePartialView(MSG));
    }
}

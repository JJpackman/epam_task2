package com.company.subtask1.controller.command;

import com.company.subtask1.model.ShapeManager;
import com.company.subtask1.view.ConsoleView;
import com.company.subtask1.view.partial_view.ActionMessagePartialView;

public class CalculateAreaSumCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Sum of shapes' area is:";

    public CalculateAreaSumCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printResult(new ActionMessagePartialView(String.format("%s %.2f", RESULT_MSG, model.calcAreaSum())));
    }
}

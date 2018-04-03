package com.company.subtask1.controller.command;

import com.company.subtask1.model.ShapeManager;
import com.company.subtask1.utils.data.ShapesDataSource;
import com.company.subtask1.view.ConsoleView;
import com.company.subtask1.view.partial_view.ActionMessagePartialView;

public class FillWithShapesCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Shapes created";

    public FillWithShapesCommand(ConsoleView view, ShapeManager model) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        model.fill(ShapesDataSource.readShapes());
        view.printResult(new ActionMessagePartialView(RESULT_MSG), model.getShapes());
    }
}

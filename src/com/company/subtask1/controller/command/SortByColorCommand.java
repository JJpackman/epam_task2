package com.company.subtask1.controller.command;

import com.company.subtask1.model.ShapeManager;
import com.company.subtask1.model.entity.Shape;
import com.company.subtask1.view.ConsoleView;
import com.company.subtask1.view.partial_view.ActionMessagePartialView;
import java.util.Comparator;

public class SortByColorCommand implements ShapeCommand {
    private ConsoleView view;
    private ShapeManager model;
    private static final String RESULT_MSG = "Sort result:";

    public SortByColorCommand(ConsoleView view, ShapeManager model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printResult(new ActionMessagePartialView(RESULT_MSG), model.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getShapeColor().compareTo(s2.getShapeColor());
            }
        }));
    }
}

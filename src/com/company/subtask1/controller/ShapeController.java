package com.company.subtask1.controller;

import com.company.subtask1.controller.command.ShapeCommandInvoker;
import com.company.subtask1.controller.constant.ShapeActionsConstants;
import com.company.subtask1.model.ShapeManager;
import com.company.subtask1.view.ConsoleView;
import com.company.subtask1.view.partial_view.ErrorMessagePartialView;

public class ShapeController {
    private ShapeCommandInvoker commandInvoker;
    private ConsoleView view;

    public ShapeController(ShapeManager model, ConsoleView view) {
        this.commandInvoker = ShapeCommandInvoker.createShapeCommandInvoker(model, view);
        this.view = view;
    }

    private void handleException(Exception e) {
        view.printMsg(new ErrorMessagePartialView(e.getMessage()));
    }

    private void init() {
        try {
            commandInvoker.executeCommand(ShapeActionsConstants.FILL);
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void run() {
        init();

        int selectedItem;

        while ((selectedItem = view.selectMenuItem()) != ShapeActionsConstants.EXIT) {
            try {
                commandInvoker.executeMenuCommand(selectedItem);
            } catch (Exception e) {
                handleException(e);
            }
        }

        commandInvoker.executeCommand(ShapeActionsConstants.EXIT);
    }
}

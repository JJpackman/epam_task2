package com.company.subtask1;

import com.company.subtask1.controller.ShapeController;
import com.company.subtask1.model.ShapeManager;
import com.company.subtask1.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        new ShapeController(new ShapeManager(), new ConsoleView()).run();
    }
}

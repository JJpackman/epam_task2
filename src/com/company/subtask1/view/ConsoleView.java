package com.company.subtask1.view;

import com.company.subtask1.model.entity.Shape;
import com.company.subtask1.utils.UserInput;
import com.company.subtask1.view.constant.ConsoleMsgConstants;
import com.company.subtask1.view.partial_view.*;

public class ConsoleView {
    public void printMsg(MessagePartialView view) {
        view.print();
    }

    public void printResult(MessagePartialView view, Shape... shapes) {
        if (shapes.length == 0) {
            view.setMessageContent(ConsoleMsgConstants.NOT_FOUND);
        }

        view.print();

        for (Shape p : shapes) {
            System.out.println(p);
        }
    }

    private void drawMenu() {
        printMsg(new ActionMessagePartialView(ConsoleMsgConstants.MENU_HEADER));
        System.out.println(
                "1) Display shapes\n" +
                "2) Calculate sum of areas of all shapes\n" +
                "3) Calculate sum of areas of specified shape\n" +
                "4) Sort shapes by area\n" +
                "5) Sort shapes by color\n" +
                "6) Exit"
        );
    }

    public int selectMenuItem() {
        drawMenu();
        printMsg(new ActionMessagePartialView(ConsoleMsgConstants.ITEM_SELECTION));
        return UserInput.getInteger();
    }
}

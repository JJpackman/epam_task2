package com.company.subtask1.view.partial_view;

import com.company.subtask1.view.constant.ConsoleColorConstants;
import java.util.Arrays;

public class ActionMessagePartialView extends MessagePartialView {
    public ActionMessagePartialView(String messageContent) {
        super(messageContent, ConsoleColorConstants.ANSI_BLUE);
    }

    @Override
    public void print() {
        final String msg = getMessageContent();

        final char[] delimiter = new char[msg.length()];
        Arrays.fill(delimiter, '*');

        applyColor();

        System.out.println(delimiter);
        System.out.println(msg);
        System.out.println(delimiter);

        reset();
    }
}

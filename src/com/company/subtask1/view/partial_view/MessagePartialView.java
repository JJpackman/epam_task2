package com.company.subtask1.view.partial_view;

import com.company.subtask1.view.constant.ConsoleColorConstants;

public abstract class MessagePartialView {
    private String messageContent;
    private final String color;

    public MessagePartialView(String messageContent, String color) {
        this.messageContent = messageContent;
        this.color = color;
    }

    public MessagePartialView(String messageContent) {
        this.messageContent = messageContent;
        this.color = ConsoleColorConstants.ANSI_BLACK;
    }

    public abstract void print();

    public void applyColor() {
        System.out.print(color);
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void reset() {
        System.out.print(ConsoleColorConstants.ANSI_BLACK);
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getColor() {
        return color;
    }
}

package com.company.subtask2.view;

import com.company.subtask2.model.entity.Book;
import com.company.subtask2.model.enums.Action;

import static com.company.subtask2.view.constant.ConsoleColorConstants.*;

public class View {
    public void print(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void printError(String msg) {
        System.out.println(ANSI_RED + msg + ANSI_RESET);
    }

    public void printMenu(Action[] actions) {
        for (Action a : actions) {
            System.out.println(a);
        }
    }
}

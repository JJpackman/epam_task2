package com.company.subtask2.helper;

import com.company.subtask2.model.enums.Action;

import java.util.Scanner;

public class UserActionsReader {
    private final Scanner sc = new Scanner(System.in);

    private Action getActionOrNull(int n) {
        for (Action a : Action.values()) {
            if (n == a.getNumber()) {
                return a;
            }
        }

        return null;
    }

    public Action readAction() throws Exception {
        int number = -1;

        try {
            number = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new Exception("Illegal format of action number", e);
        }

        return getActionOrNull(number);
    }
}

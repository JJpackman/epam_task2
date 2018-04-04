package com.company.subtask2.model.entity;

public class Author {
    private final String name;
    private final String surname;
    private final String patronymic;

    private Author(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return String.format("%s.%s %s", name.charAt(0), patronymic.charAt(0), surname);
    }

    public static Author getAuthor(String name, String surname, String patronymic) {
        return new Author(name, surname, patronymic);
    }
}

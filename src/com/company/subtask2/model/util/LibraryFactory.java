package com.company.subtask2.model.util;

import com.company.subtask2.model.Library;
import com.company.subtask2.model.entity.*;
import java.util.*;

public final class LibraryFactory {
    private LibraryFactory() {}

    public static Library getLibrary(Collection<Book> books) {
        final Library library = new Library();

        for (Book b : books) {
            library.addBook(b);
        }

        return library;
    }

    public static Library getLibrary() {
        return getLibrary(Arrays.asList(
            new Book.Publisher()
                .setTitle("Master and margarita")
                .setAuthor(Author.getAuthor("Mikhail", "Bulgakov", "Afanasyevich"))
                .setPublisher("alpina")
                .setYearOfPublishing(1967)
                .setTotalPages(672)
                .publish(),
            new Book.Publisher()
                .setTitle("Fatal eggs")
                .setAuthor(Author.getAuthor("Mikhail", "Bulgakov", "Afanasyevich"))
                .setPublisher("ortis")
                .setYearOfPublishing(1925)
                .setTotalPages(320)
                .publish()
        ));
    }
}

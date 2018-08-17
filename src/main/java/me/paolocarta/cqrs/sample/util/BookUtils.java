package me.paolocarta.cqrs.sample.util;

import me.paolocarta.cqrs.sample.entity.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookUtils {

    public static final List<Book> BOOK_LIST = generateBookList();

    public static List<Book> generateBookList() {
        List<Book> books = new ArrayList<>();
        Date currentDate = new Date();
        for (int i = 0; i < 10; i++) {
            books.add(new Book(String.valueOf(i), "Book " + i, currentDate));
        }
        return books;
    }
}

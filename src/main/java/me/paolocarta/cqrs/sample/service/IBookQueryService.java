package me.paolocarta.cqrs.sample.service;

import me.paolocarta.cqrs.sample.entity.Book;

import java.util.List;

public interface IBookQueryService {

    List<Book> getAllBooks();

    Book getBookInfo(String bookId);
}

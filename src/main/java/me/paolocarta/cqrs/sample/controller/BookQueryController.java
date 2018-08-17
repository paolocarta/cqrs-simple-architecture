package me.paolocarta.cqrs.sample.controller;

import me.paolocarta.cqrs.sample.entity.Book;
import me.paolocarta.cqrs.sample.service.IBookQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookQueryController {

    @Autowired
    private IBookQueryService bookQueryService;

    @GetMapping("/books")
    public List<Book> allBooks() {
        return bookQueryService.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> bookInfo(@PathVariable("bookId") String bookId) {
        Book bookInfo = bookQueryService.getBookInfo(bookId);
        if (bookInfo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bookInfo);
    }
}

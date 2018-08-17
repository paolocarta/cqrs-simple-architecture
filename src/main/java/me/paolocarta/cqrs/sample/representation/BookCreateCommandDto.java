package me.paolocarta.cqrs.sample.representation;

import lombok.Data;

import java.util.Date;

@Data
public class BookCreateCommandDto {
    private String id;
    private String name;
    private Date publishDate;
}

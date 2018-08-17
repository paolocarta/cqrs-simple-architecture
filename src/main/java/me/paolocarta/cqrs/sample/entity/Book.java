package me.paolocarta.cqrs.sample.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
 * sample entity class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String id;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date publishDate;
}

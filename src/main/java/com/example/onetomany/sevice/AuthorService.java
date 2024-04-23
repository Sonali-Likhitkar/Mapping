package com.example.onetomany.sevice;

import com.example.onetomany.model.Author;

import java.util.List;

public interface AuthorService {
    Author saveAuthordetails(Author author);

    List<Author> fetchAuthor();
}

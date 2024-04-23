package com.example.onetomany.controller;


import com.example.onetomany.model.Author;
import com.example.onetomany.model.Book;
import com.example.onetomany.sevice.AuthorService;
import com.example.onetomany.sevice.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LibraryController")
public class LibraryController {

    private AuthorService authorService;
    private BookService bookService;

    public LibraryController( AuthorService authorService , BookService bookService){
        this.authorService=authorService;
        this.bookService =bookService;
    }

    @PostMapping("/authors")
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.saveAuthordetails(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/createBook")
    private Book createBook(@RequestBody Book book){
        return bookService.saveBookDetails(book);
    }

    @GetMapping("/getAuthor")
    public List<Author> FetchAuthor(){
        return authorService.fetchAuthor();
    }
}

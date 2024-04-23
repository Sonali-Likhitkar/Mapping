package com.example.onetomany.serviceimpl;

import com.example.onetomany.model.Book;
import com.example.onetomany.repository.BookRepo;
import com.example.onetomany.sevice.BookService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public Book saveBookDetails(Book book) {
        return bookRepo.save(book);
    }
}

package com.example.onetomany.serviceimpl;

import com.example.onetomany.model.Author;
import com.example.onetomany.repository.AuthorRepo;
import com.example.onetomany.sevice.AuthorService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {


    private AuthorRepo authorRepo;
    public  AuthorServiceImpl(AuthorRepo authorRepo){
        this.authorRepo=authorRepo;
    }
    @Override
    public Author saveAuthordetails(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public List<Author> fetchAuthor() {
        return authorRepo.findAll();
    }
}

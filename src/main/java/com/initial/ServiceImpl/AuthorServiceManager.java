package com.initial.ServiceImpl;


import com.initial.model.Author;
import com.initial.repo.AuthorRepo;
import com.initial.services.AuthorService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.List;


@Singleton
@Named("Author")
public class AuthorServiceManager implements AuthorService {

    @Inject
    private AuthorRepo authorRepo;


    @Override
    public Author addAuthor(Author author) {
         return authorRepo.save(author);
    }

    @Override
    public List<AuthorService> getAll() {
        return null;
    }

    @Override
    public AuthorService updateAuthor(AuthorService author) {
        return null;
    }

    @Override
    public AuthorService delete(Long Id) {
        return null;
    }
}

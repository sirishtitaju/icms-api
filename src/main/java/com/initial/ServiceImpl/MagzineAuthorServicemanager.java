package com.initial.ServiceImpl;

import com.initial.model.Author;
import com.initial.services.AuthorService;
import io.micronaut.context.annotation.Primary;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
@Named("Magazine")
public class MagzineAuthorServicemanager implements AuthorService {
    @Override
    public Author addAuthor(Author author) {
        return null;
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

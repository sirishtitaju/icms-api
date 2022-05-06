package com.initial.services;

import com.initial.model.Author;

import java.util.List;

public interface AuthorService  {

    Author addAuthor(Author author);

    List<AuthorService> getAll();

    AuthorService updateAuthor(AuthorService author);

    AuthorService delete(Long Id);


//assigned
//    AuthorService addAuthor(AuthorService author);
//
//    List<AuthorService> getAll();
//
//    AuthorService updateAuthor(AuthorService author);
//
//    AuthorService delete(Long Id);

}

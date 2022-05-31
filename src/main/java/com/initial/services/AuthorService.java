package com.initial.services;

import com.initial.model.Article;
import com.initial.model.ArticleDTO;
import com.initial.model.Author;
import com.initial.model.AuthorDTO;

import java.util.List;
import java.util.Optional;

public interface AuthorService  {

    Author add(Author author);


    List<Author> getAll();
//
    Author updateAuthor(Author author);
    Optional<Author> getAuthor(Long id);

     void delete(Long Id);





//assigned
//    AuthorService addAuthor(AuthorService author);
//
//    List<AuthorService> getAll();
//
//    AuthorService updateAuthor(AuthorService author);
//
//    AuthorService delete(Long Id);

}

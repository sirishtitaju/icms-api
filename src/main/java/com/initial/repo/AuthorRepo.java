package com.initial.repo;

import com.initial.model.Article;
import com.initial.model.Author;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Long> {
//    Author findByAuthorName(String authorName);
//
//    Optional<Author> findById(Long id);
//
//    Author save(Author author);
//
//    void deleteById(Long id);
//
//    List<Author> findAll();
//
//    void updateAuthor(Long id, Author author);
}

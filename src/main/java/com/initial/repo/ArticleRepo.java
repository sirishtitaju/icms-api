package com.initial.repo;


import com.initial.model.Article;
import com.initial.model.Author;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ArticleRepo extends CrudRepository<Article,Long> {
//    Optional<Article> findByProviderKey(Long id);
//
//    Author save(Author author);
//
//    void deleteByProviderKey(Long id);
//
//    List<Article> findAll();
//
//    void updateArticle(Long id, Article article);
}

package com.initial.repo;


import com.initial.model.Article;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;


@Repository
public interface ArticleRepo extends CrudRepository<Article,Long> {
    Article findByTitle(String title);
}
